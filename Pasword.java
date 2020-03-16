/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasword;
import java.util.Scanner;
/**
 *
 * @author SEVEN
 */
public class Pasword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String con="";
        String defi="asjfhd";
        System.out.println("ingresa la contraseña:");
        con= entrada.nextLine();
        if(con.equals(defi)){
        System.out.println("Contraseña correcta");
        
         }else{
        System.out.println("contraseña incorrecta");
        
        
        
        }
               
        
              
        
        
        // TODO code application logic here
    }
    
}
