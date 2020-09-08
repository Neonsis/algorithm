package org.neonsis;

/*
   Implement Caesar Encryptor only for lower case characters
*/
public class CaesarCipherEncryptor {

    public static void main(String[] args) {
        String str = "xyz";
        int step = 2;
        System.out.println(encrypt(str, step));
    }

    // Ascii solution (n) - time, (n) - space
    public static String encrypt(String str, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char encryptChar = (char) (ch + step);
            if (encryptChar > 122) {
                encryptChar -= 26;
            }
            sb.append(encryptChar);
        }
        return sb.toString();
    }
}
