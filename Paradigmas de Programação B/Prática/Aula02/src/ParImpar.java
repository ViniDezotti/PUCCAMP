import java.util.Scanner;

public class ParImpar{
    
    public static void main(String[] agrs){

        Scanner input = new Scanner (System.in); 

        int num;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("O número digitado é par !");
        }
        else
        {
            System.out.println("O número digitado é impar !");
        }

    }

}
