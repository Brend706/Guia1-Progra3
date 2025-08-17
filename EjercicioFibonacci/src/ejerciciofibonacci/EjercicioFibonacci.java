
package ejerciciofibonacci;

/**
 *
 * @author BILV
 */
public class EjercicioFibonacci {

    public static void main(String[] args) {
       
        System.out.println("Secuencia Fibonacci");
        int num1 = 1, num2 = 0, i = 0;
        int fibonacci = 0;
        while( i < 9){
            System.out.print(fibonacci + ", ");
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;
            i++;
        }
    }
    
}
