import java.util.Scanner;

public class Circulo {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int raio, diametro;
        double area, pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = input.nextInt();

        diametro = 2 * raio;
        area = pi * raio * raio;

        System.out.printf("O diâmetro do círculo é %d",diametro);
        System.out.printf("\nA área do círculo é %.2f",area);

    }
    
}
