import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Recorrido();
        
    }

    public static void Recorrido() {
        Scanner palabra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("Ingresa una palabra");
        String palabra_recorrido = palabra.nextLine();
        System.out.println("Ingresa un numero");
        int number = num.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.println(palabra_recorrido);
        }
        
        
    }

}