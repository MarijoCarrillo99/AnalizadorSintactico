/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventaniux;
import analizadorsintactico.Sintaxis;
import analizadorsintactico.ParseException;
import analizadorsintactico.Sintaxis;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;


/**
 *
 * @author MARÍA JOSÉ CARRILLO
 */
public class AnalizadorSintactico {

    public static void main(String[] args) 
    {
        try{
            Sintaxis parser = new Sintaxis(new BufferedReader(new FileReader("./Prueba.txt")));
            parser.Principal();
            System.out.println( "Analisis Exitoso");
        }
        catch(ParseException e){
           System.err.println(e.getMessage()); 
            throw e;
        }
        catch(FileNotFoundException nf){
           System.err.println(nf.getMessage());
        }
    }
    
}
