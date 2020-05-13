/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalistas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mega_
 */
public class PracticaListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        lista.forEach(elemento->{
            System.out.println("Valor de la lista"+ elemento);
                if(elemento.equals("D")){
                    System.out.println("Se encontro la cadena");
                }
        });
        lista.add("G");
        lista.add("H");
        
        for (String contenido : lista){
            System.out.println("Valor de la lista "+ contenido);
        }
        
        lista.add("I");
        lista.add("J");
        lista.add("K");
        String variable ="L";
        lista.add(variable);
        System.out.println("\n\n otra forma de recorrer la lista \n");
        lista.stream().forEach((contiene) ->{
            mensaje(contiene);
        });
    };
    public static void mensaje(String valor){
        System.out.println("");
        System.out.println("contiene" + valor);
    }    
    }
    
    

