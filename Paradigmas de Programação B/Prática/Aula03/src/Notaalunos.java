import java.util.Scanner;

public class Notaalunos {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int i;
        double notas[] = new double[10];
        double media, max, min;

        for(i=0; i<10 ;i++)
        {
            System.out.printf("Nota do aluno %02d: ",i+1);
            notas[i] = input.nextDouble();
        }

        max = min = notas[0];
        media = 0;

        for(i=0; i<10 ;i++)
        {
            if(max < notas[i])
                max = notas[i];
            
            if(min > notas[i])
                min = notas[i];

            media+= notas[i];
        }

        media = media/notas.length;

        System.out.printf("\nAs notas digitadas foram : ");
        for(i=0; i<10 ;i++)
        {
            System.out.printf("%.2f ",notas[i]);
        }

        System.out.printf("\nMaior Nota: %.2f",max);
        System.out.printf("\nMenor Nota: %.2f",min);
        System.out.printf("\nMedia das Notas: %.2f",media);
    }

}