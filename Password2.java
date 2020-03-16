/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password2;
import java.util.Scanner;
/**
 *
 * @author SEVEN
 */
public class Password2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner entrada =new Scanner(System.in);
    String con="jajaja";
    String c="";
   for(int i=1;i<4;i++){
   System.out.println("ingrese la contrasena");
    c= entrada.nextLine();
    if(con.equals(c)){
    System.out.println("contrasena incorrecta");
}else{
System.out.println("contrasena incorrecta ");

}
}
}
}