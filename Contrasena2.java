import java.util.Scanner;
/**
 *
 * @author SEVEN
 */
public class Contrasena2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String c= "jaja";
        String n="";
        int  intentos=3;
          
          for(int cont=1;cont<4;cont++){

          System.out.println("ingresa la contrasena");
           n= entrada.nextLine();
          if (c.equals(n)){
          cont=intentos;
          System.out.println("contrasena correcta");
          }else{
          System.out.println("contraseña incorrecta");
        
        }
        
         
        }
    }
}
