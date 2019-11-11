package com.disenio.procesamiento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Procesamiento {


    public static boolean verificarCorreoElectronico(String correo){

        Pattern patronregex = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher bandera = patronregex.matcher(correo);

        return bandera.find();
    }
    public static boolean verificarFechaNacimiento(Date fechaN){

        Date fechaActual = new Date();

        int dias=(int) ((fechaActual.getTime()-fechaN.getTime())/86400000);
        int anios = dias/365;

        if(anios < 18){
            return false;
        }
        else {
            return true;
        }

    }
    public static boolean verificarTarjetaCredito(String tarjeta){



        Pattern patronTarjeta = Pattern.compile("^5[1-5][0-9]{14}$");

        Matcher bandera = patronTarjeta.matcher(tarjeta);

        return bandera.find();




    }


    public static void main(String[] args) throws ParseException {
        Procesamiento proc = new Procesamiento();
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String dateInString = "2010/04/20";
        Date date = sdf.parse(dateInString);*/

        System.out.println(verificarTarjetaCredito("5518980046210412"));


    }


}
