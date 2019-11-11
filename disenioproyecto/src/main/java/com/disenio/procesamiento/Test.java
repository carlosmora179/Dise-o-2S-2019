package com.disenio.procesamiento;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


public class Test {

    public static void main(String[] args) {
        try {
            final String claveEncriptacion = "Funko";
            String datosOriginales = "8965-6548-6985-2214";

            Cifrar encriptador = new Cifrar();

            String encriptado = encriptador.cifrado(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.decifrado(encriptado, claveEncriptacion);

            System.out.println("Original: " + datosOriginales);
            System.out.println("Escriptado     : " + encriptado);
            System.out.println("Desencriptado  : " + desencriptado);

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(Cifrar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
