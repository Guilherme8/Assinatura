/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author lsantoro
 */
public class ValidarDados {
    
    public static boolean isEmBranco(String dado) {
        if (dado == null) {
            return true;
        } else if (dado.trim().equals("")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isEmailValido(String email) {
        boolean teste = false;
        if (email.length() < 10) {
            return false;
        }
        char[] letras = email.trim().toCharArray();
        for (int x = 0; x < letras.length; x++) {
            String a = String.valueOf(letras[x]);
            if (a.equals("@")) {
                teste = true;
            }
        }
        return teste;
    }
    
    public static boolean isTelefoneValido(String telefone) {
        int tam = telefone.trim().length();
        return tam >= 16;
    }
    
}
