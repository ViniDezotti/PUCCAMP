import java.util.Scanner;

public class Separa {
    
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int num, pri, seg, ter, qua, qui;

        System.out.print("Digite um número de 5 dígitos : ");
        num = input.nextInt();

        pri = num / 10000;
        seg = (num % 10000) / 1000;
        ter = ((num % 10000) % 1000) / 100;
        qua = (((num % 10000) % 1000) % 100) / 10;
        qui = (((num % 10000) % 1000) % 100) % 10;

        System.out.printf("Os números separados são : %d   %d   %d   %d   %d",pri,seg,ter,qua,qui);

    }

}
