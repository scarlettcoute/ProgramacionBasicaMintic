package practice1;
import java.util.Scanner;
/**
 *
 * @author scarl
 */
public class Excersise1 {
    //Planteamiento del problema: Solicitarle al usuario nombre, género y edad. 
    // El problema debe idenificar si es hombre o mujer mayor de edad.
    //1. Creación de la instancia librería scanner
   Scanner keyboardData = new Scanner(System.in);
   private String user_name = "";
   private int age = 0;
   private int gender = 0;
   
   //2. Creación del método que soliita datos al usuario
   public void RequestUserData(){
       System.out.println(">>>>>> Diligencia la siguiente información <<<<<<<<<<<<<");
       System.out.println("    Nombre: ");
       //Para hacer una  lectura de cadena de texto por teclado, se utiliza nextLine()
       user_name = keyboardData.nextLine();
       
       System.out.println("    Edad: ");
       
       //Para hacer lectura de números entero por teclado, se utiliza nextInt()
       age = keyboardData.nextInt();
       
       System.out.println("    Selecciona género: \n    1. Femenino\n    2. Masculino\n    3. Otro");
       gender = keyboardData.nextInt();
       
       //3. Bloque de condcionales para el género y la edad
       //4. Declaamos una variable que almacenaá la salida del bloque condicional
       String result = "";
       //Validamos si es o no mayor de edad y dentro de este condicional, validamos el género
       if(age >= 18){
           if(gender == 1){
               result = "Mujer mayor de edad";
           }else if(gender == 2){
               result = "Hombre mayor de edad";               
           }else if(gender == 3){
               result = "Otro género mayor de edad";
           }else{
               result = "Ingreso incorrecto de género, las opciones son: 1, 2 o 3.";
           }
       }else{
            if(gender == 1){
               result = "Mujer menor de edad";
           }else if(gender == 2){
               result = "Hombre menor de edad";               
           }else if(gender == 3){
               result = "Otro género menor de edad";
           }else{
               result = "Ingreso incorrecto de género, las opciones son: 1, 2 o 3.";
           }
       }
       System.out.println(result);
   }
}
