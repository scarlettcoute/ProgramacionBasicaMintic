package practice1;
import java.util.Scanner;
/**
 *
 * @author scarl
 */

public class Excersise3 {
    //1. Creamos la instancia de la librería Scanner
    Scanner keyboardData = new Scanner(System.in);
    //2. Declaramos de forma global las variables necesarias para la clase
    private int userNumber = 0;
    
    //3. Creamos el método que validará si el número es o no par y negativo
    public void validateNumberNegativeEven(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Validar si es o no par <<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Ingresa un número: ");
        userNumber = keyboardData.nextInt();
        
        if(userNumber < 0){
            //El número es positivo
            if(userNumber % 2 == 0){
                System.out.println("El número " + userNumber + " es negativo par.");
            }else{
                System.out.println("El número " + userNumber + " es negativo impar.");
            }
        }else{
            //El número es negativo
            System.out.println("Número ingresado no cumple la condición de ser negativo.");
        }
    }
}
           

