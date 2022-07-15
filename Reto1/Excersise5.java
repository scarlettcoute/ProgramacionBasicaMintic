package practice1;
import java.util.Scanner;
/**
 *
 * @author scarl
 */
public class Excersise5 {

    //1. Declaración de variables globales
    Scanner keyboardInputUser = new Scanner(System.in);
    private String userPassword = "";
    private int numberAttempts = 1;

    //2. Creación del método que valida la contraseña y cantidad de intentos
    public void CorrectPassword() {
        //3. Solicitamos al usuario el dato de la contraseña
        System.out.println("Ingresa la contraseña de tu WIFI");
        userPassword = keyboardInputUser.nextLine();

        //4. Validamos si la contraseña NO ES EQUIVALENTE a ABC123
        while (numberAttempts < 4) {
            //Incrementamos el intento
            
            if (!(userPassword.equals("ABC123"))) {
                System.out.println("Contraseña incorrecta.\nIntento" + numberAttempts + ": ");
                userPassword = keyboardInputUser.nextLine();
            } else {
                System.out.println("Se ha establecido conexión con su red wifi.");
                break;
            }
            numberAttempts += 1;
        }
    }
} 
