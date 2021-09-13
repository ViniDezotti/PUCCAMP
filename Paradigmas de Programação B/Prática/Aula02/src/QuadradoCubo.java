import java.util.Scanner;

public class QuadradoCubo {
    
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int i, num, quadrado, cubo;

        System.out.print("Digite a quantidade de números que deseja : ");
        num = input.nextDouble();

        for(i=0; i<num ;i++)
        {
            quadrado = i * i;
            cubo = quadrado * i;
            System.out.printf("\n%d\t%d\t%d",i, quadrado, cubo);
        }

    }

}
