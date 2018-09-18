/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Dados;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ValidarDados;

/**
 *
 * @author lsantoro
 */
public class ControleDados {

    private Dados dado;

    public void criarNovo() {
        dado = new Dados();
    }

    public void atribuirDados(String nome, String funcao, String secao, String email, String telefone, String info1, String info2) throws Exception {
        if (ValidarDados.isEmBranco(nome)) {
            throw new Exception("Nome em branco!");
        } else {
            dado.setNome(nome);
        }
        if (ValidarDados.isEmBranco(funcao)) {
            throw new Exception("Função em branco!");
        } else {
            dado.setFuncao(funcao);
        }
        if (ValidarDados.isEmBranco(secao)) {
            throw new Exception("Seção em branco!");
        } else {
            dado.setSecao(secao);
        }
        if (ValidarDados.isEmBranco(email)) {
            throw new Exception("E-mail em branco!");
        } else if (ValidarDados.isEmailValido(email)){
            dado.setEmail(email);
        } else {
            throw new Exception("E-mail inválido!");
        }
        if (telefone.trim().equals("")) {
            throw new Exception("Telefone em branco!");
        } else if (ValidarDados.isTelefoneValido(telefone)){
            dado.setTelefone(telefone);
        } else {
            throw new Exception("Telefone inválido!");
        }
        if (info1.trim().equals("")) {
            dado.setInfo1(null);
        } else {
            dado.setInfo1(info1);
        }

        if (info2.trim().equals("")) {
            dado.setInfo2(null);
        } else {
            dado.setInfo2(info2);
        }

    }

    public boolean imprimir() throws Exception {
        boolean ok = false;
        try {
            ArrayList<Dados> lista = new ArrayList<Dados>();
            lista.add(dado);
            String caminho = "..\\Assinatura\\imagem\\emissao.png";
                    //new File("\\Assinatura\\imagem\\emissao.png").getAbsolutePath();
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("caminho", caminho);
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(lista);
            InputStream relatorio = getClass().getResourceAsStream("/relatorio/assinatura.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatorio, parametros, dataSource);
            
//            JasperViewer jv = new JasperViewer(jasperPrint, false);
            Image image = JasperPrintManager.printPageToImage(jasperPrint, 0, 1.35f);
            
//            jv.setVisible(true);
            File outputFile = new File("..\\Assinatura\\" + dado.getNome() + ".png");

            BufferedImage input = toBufferedImage(image);

            ImageIO.write(input, "PNG", outputFile);
            ok = true;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return ok;

    }

    public static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }

        // This code ensures that all the pixels in the image are loaded  
        image = new ImageIcon(image).getImage();

        // Determine if the image has transparent pixels; for this method's  
        // implementation, see e661 Determining If an Image Has Transparent Pixels  
        boolean hasAlpha = hasAlpha(image);

        // Create a buffered image with a format that's compatible with the screen  
        BufferedImage bimage = null;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            // Determine the type of transparency of the new buffered image  
            int transparency = Transparency.OPAQUE;
            if (hasAlpha) {
                transparency = Transparency.BITMASK;
            }
            
            // Create the buffered image  
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();
            bimage = gc.createCompatibleImage(
                    image.getWidth(null), image.getHeight(null), transparency);
        } catch (HeadlessException e) {
            // The system does not have a screen  
        }

        if (bimage == null) {
            // Create a buffered image using the default color model  
            int type = BufferedImage.TYPE_INT_RGB;
            if (hasAlpha) {
                type = BufferedImage.TYPE_INT_ARGB;
            }
            bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
        }

        // Copy image to buffered image  
        Graphics g = bimage.createGraphics();

        // Paint the image onto the buffered image  
        g.drawImage(image, 0, 0, null);
        g.dispose();

        return bimage;
    }

    public static boolean hasAlpha(Image image) {
        // If buffered image, the color model is readily available  
        if (image instanceof BufferedImage) {
            BufferedImage bimage = (BufferedImage) image;
            return bimage.getColorModel().hasAlpha();
        }

        // Use a pixel grabber to retrieve the image's color model;  
        // grabbing a single pixel is usually sufficient  
        PixelGrabber pg = new PixelGrabber(image, 0, 0, 1, 1, false);
        try {
            pg.grabPixels();
        } catch (InterruptedException e) {
        }

        // Get the image's color model  
        ColorModel cm = pg.getColorModel();
        return cm.hasAlpha();
    }

}
