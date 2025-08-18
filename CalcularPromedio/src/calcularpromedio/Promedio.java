
package calcularpromedio;
import java.util.Scanner;
/**
 *
 * @author BILV
 */
public class Promedio {
     
    //Metodo para pedir los datos necesarios desde consola.
    public void SolicitarDatos(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de la guia: ");
        double notaGuia = leer.nextDouble();
        double guia = calcularNotaGuia(notaGuia);
        
        System.out.println("Ingrese la nota del control de lectura: ");
        double notaLectura = leer.nextDouble();
        double lectura = calcularNotaLectura(notaLectura);
        
        System.out.println("Ingrese la nota del parcial:");
        double notaParcial = leer.nextDouble();
        double parcial = calcularNotaParcial(notaParcial);
        
        
        double promedioFinal = CalcularPromedio(guia, lectura, parcial);
        
        MostrarResultado(promedioFinal);
    }
    
    //Metodo que regrese el cálculo de la nota de la guía.
    public double calcularNotaGuia(double nota){
        
        double promGuia = nota * 0.3;
        return promGuia;
    }
    
    //Metodo que regrese el cálculo de la nota del control de lectura.
    public double calcularNotaLectura(double nota){
        
        double promLect = nota * 0.1;
        return promLect;
    }
    
    //Metodo que regrese el cálculo de la nota del parcial.
    public double calcularNotaParcial(double nota){
        
        double promParcial = nota * 0.6;
        return promParcial;
    }
    
    //Metodo que regrese cálculo del promedio obtenido por el estudiante.
    public double CalcularPromedio(double guia, double lectura, double parcial){
        double promedio = guia + lectura + parcial;
        return promedio;
    }
    
    //Método que muestre mensaje para saber si el estudiante APROBO o REPROBO esta evaluación
    //la nota mínima para aprobar es 6
    public void MostrarResultado(double promedio){
        
        System.out.println("El promedio de su evaluacion es: " + promedio);
        System.out.println("> Resultado:");
        if(promedio >= 6){
            System.out.println("HA APROBADO LA EVALUACION");
        }else{
            System.out.println("HA REPROBADO LA EVALUACION");
        }
    }
    
}
