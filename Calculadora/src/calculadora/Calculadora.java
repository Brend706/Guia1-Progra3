
/*
Cree un programa que solicite 2 números enteros y también una clave desde
teclado.
Según sea la clave deberá realizar la operación con los números solicitados
Las claves disponibles son las siguientes:
➢ La clave + realiza una suma.
➢ La clave - realiza una resta.
➢ La clave * realiza una multiplicación.
➢ La clave / realiza una división (Debe validar el no hacer divisiones entre 0).
➢ La clave R obtiene la raíz cuadra de ambos números.
➢ La clave E eleva el primer número con el segundo (debe redondear
decimales a máximo 3).
*/

package calculadora;
import java.util.*;

/*
 @author ELIZABEH
*/

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        char clave;
        int resp;
        
        System.out.print("Ingrese un numero: "); num1 = sc.nextInt();
        System.out.print("Ingrese un segundo numero: "); num2 = sc.nextInt();
        System.out.println("Ingrese una clave de las siguientes: "
                            +"\n + "
                            + "\n - "
                            + "\n * "
                            + "\n / "
                            + "\n R "
                            + "\n E"); 
        System.out.print("Favor Ingresar aca su clave: "); clave = Character.toUpperCase(sc.next().charAt(0)); //<-- Para que cuando 
                                                                                                               //ingresen R o E en MINUS siempre agarre el caracter
                
        switch (clave){
            case '+': resp = num1 + num2; 
                        System.out.println("Elegiste Suma\n" + "Tu Respuesta a la suma de: " + num1 + " + " + num2 + " es: " + resp);
                break;
            case '-': resp = num1 - num2;
                        System.out.println("Elegiste Resta\n" + "Tu Respuesta a la resta de: " + num1 + " - " + num2 + " es: " + resp);
                break;
            case '*': resp = num1 * num2;
                        System.out.println("Elegiste Multiplicacion\n" + "Tu Respuesta a la multiplicacion de: " + num1 + " * " + num2 + " es: " + resp);                    
                break;
            case '/': 
                     if(num2 == 0){
                         System.out.println("SYNTAX ERROR\n"
                                            + "(A donde con esa nueva regla matematica?, No se puede dividir entre 0)");
                         System.out.print("Ingresa de nuevo el segundo numero: "); num2 = sc.nextInt();
                         resp = num1 / num2;
                         System.out.println("Ahora Si, y elegiste Division\n" + "Tu Respuesta a la division correcta de: " + num1 + " / " + num2 + " es: " + resp);
                     }else{
                        resp = num1 / num2;
                        System.out.println("Elegiste Division\n" + "Tu Respuesta a la division de: " + num1 + " / " + num2 + " es: " + resp); 
                     }           
                break;
                //Aca usaremos el metodo Math porque es mas facil hacer los procesos :)
            case 'R': System.out.println("Elegiste Raiz Cuadrada\n"); 
                      System.out.println("La raiz de " + num1 + " es " + Math.sqrt(num1));
                      System.out.println("La raiz de " + num2 + " es " + Math.sqrt(num2));
                break;
            case 'E': System.out.println("Elegiste Elevacion de Potencias con redondeo de 3 decimales");
                      double potencia = Math.pow((double) num1, (double) num2); //Hacemos una conversion para las variables de los numeros
                      double redondeado = Math.round(potencia * 1000.0) / 1000.0; 
                      System.out.println("La Elevacion de " + num1 + " sobre " + num2 + " es: " + redondeado);
                break;
        }
    }
    
}
