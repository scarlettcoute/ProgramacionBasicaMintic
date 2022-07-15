package practice1;
import java.util.Scanner;
/**
 *
 * @author scarl
 */
public class Excersise2 {
    //1. Creamos una instancia de la librería Scanner
    Scanner keyboardData = new Scanner(System.in);
    //2. Declaramos las variables necesarias de forma global
    private int userNumber = 0;
    //3. Creamos el metodo que validará si el número es o no par
    public void validateNumberEven(){
        System.out.println(">>>>>>>>>>>> Vliras si es o no par<<<<<<<<<<<");
        System.out.println("Ingresa un número");
        userNumber = keyboardData.nextInt();
        //4. Validamos si el numero ingresado es par
        if(userNumber % 2 == 0){
            System.out.println("El número" + userNumber + " es par. ");
        }else{
            System.out.println("El núemro" + userNumber + " es impar.");
        }
    }
}
