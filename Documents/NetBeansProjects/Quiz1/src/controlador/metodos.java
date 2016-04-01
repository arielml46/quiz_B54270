/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ventana;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Ariel
 */
public class metodos {
            
    ventana v;
            
        
    
    public void sumar(){
        
        String linea= ventana.jTextField1;
       
        Pattern patron= Pattern.compile("(\\s\\d+\\s)\\+(\\s\\d+\\s)");
        Matcher matcher= patron.matcher(linea);
        
        matcher.find();
        
        
        
        ventana.jTextField2.setText(linea);
        
            linea= matcher.group(1)+matcher.group(2);
    }
            
    

    public void restar(){
        
        String linea= ventana.jTextField1;
       
        Pattern patron= Pattern.compile("(\\s\\d+\\s)\\+(\\s\\d+\\s)");
        Matcher matcher= patron.matcher(linea);
        
        matcher.find();
        
        
        
       ventana.jTextField2.setText(linea);
        
            linea= matcher.group(1)-matcher.group(2);
    }
     
    public void multiplicar(){
        
        String linea= ventana.jTextField1;
       
        Pattern patron= Pattern.compile("(\\s\\d+\\s)\\+(\\s\\d+\\s)");
        Matcher matcher= patron.matcher(linea);
        
        matcher.find();
        
        
        
      ventana.jTextField2.setText(linea);
        
            linea= matcher.group(1)*matcher.group(2);
    }
    
    public void dividir(){
        
        String linea= ventana.jTextField1;
       
        Pattern patron= Pattern.compile("(\\s\\d+\\s)\\+(\\s\\d+\\s)")
                ;
        Matcher matcher= patron.matcher(linea);
        
        matcher.find();
        
        
        
       ventana.jTextField2.setText(linea);
        
            linea= matcher.group(1)/matcher.group(2);
    }
            
    }

  }
    
    

