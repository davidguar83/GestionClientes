/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;

/**
 *
 * @author David
 */
public class Metodos {

    public static void validarDNI(String DNI) throws DNIException {

        if (!(DNI.length() >= 8 && DNI.length() <= 9)) {

            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);

        }

        String parte_numerica = DNI.substring(0, DNI.length() - 1);

        int numeroDNI = 0;

        try {

            numeroDNI = Integer.parseInt(parte_numerica);

        } catch (NumberFormatException e) {

            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRETA);

        }

        char letra = DNI.substring(DNI.length() - 1, DNI.length()).toUpperCase().charAt(0);

        if (!(letra >= 'A' && letra <= 'Z')) {

            throw new DNIException(DNIException.PARTE_LETRA_NO_CORECTA);

        }

        final int DIVISOR = 23;

        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = numeroDNI % DIVISOR;

        String nuevoDNI = numeroDNI + "" + letrasNIF[resto];

        if (DNI.startsWith("0")) {

            nuevoDNI = "0" + nuevoDNI;
        }

        if (!(nuevoDNI.equalsIgnoreCase(DNI))) {

            throw new DNIException(DNIException.FORMATO_NO_CORRECTO);

        }
    }

    public static void comprobarNumeroTelf(String a) throws DNIException {

        if (!(a.length() == 0 || a.length() == 9)) {
            
             throw new DNIException(DNIException.ERROR_LONGITUD_NUMEROCO_TELEFONO);

        }

    }

    public static int combertidorTelefon(String a) throws DNIException {

        int valor = 0;

       

            if ("".equals(a)) {

                valor = 0;

            } else {

                 try {
                
                valor = Integer.parseInt(a);
                
                
                } catch (NumberFormatException e) {
            
                    
                         throw new DNIException(DNIException.ERROR_FORMATO_NUMEROCO_TELEFONO);
                   
            

        }

            }
       

        return valor;

    }
     public static int combertidorDeu(String a) throws DNIException {

        int valor = 0;

       

            if ("".equals(a)) {

                valor = 0;

            } else {

                 try {
                
                valor = Integer.parseInt(a);
                
                
                } catch (NumberFormatException e) {
            
                    
                         throw new DNIException(DNIException.ERROR_FORMATO_NUMEROCO_DEUDA);
                   
            

        }

            }
       

        return valor;

    }

}
