/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

/**
 *
 * @author David
 */
public class DNIException extends Exception {

    public static final String LONGITUD_NO_CORRECTA = " La longuitud tierne que estar entre 8 y 9";
    public static final String PARTE_NUMERICA_NO_CORRETA = "La parte de la letra del DNI debe ser un numero";
    public static final String PARTE_LETRA_NO_CORECTA = "La parte de la letra del DNI debe de ser una letra entera";
    public static final String FORMATO_NO_CORRECTO = "El DNI es incorecto";
    public static final String ERROR_FORMATO_NUMEROCO_TELEFONO = "La parte del telefono deben de ser numeros";
    public static final String ERROR_LONGITUD_NUMEROCO_TELEFONO = "La parte del telefono debe de tener 9 numeros";
    public static final String ERROR_FORMATO_NUMEROCO_DEUDA = "La parte de la deuda deben de ser numeros";

    public DNIException(String mensaje) {

        super(mensaje);
    }

}
