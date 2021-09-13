import java.util.Scanner;

public class Soma{
    
    public static void main(String[] args){

        Scanner input = new Scanner (System.in); //vai ser utilizado para entrada de dados do teclado 

        int num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.printf("A soma dos números é %d",soma);

    }

}