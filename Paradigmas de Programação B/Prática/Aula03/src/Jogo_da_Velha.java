import java.util.Scanner; // permite utilizar o Scanner

public class Jogo_da_Velha{
    
    public static void exibirTabuleiro(int [][] tabuleiro){ // método para printar o tabuleiro na tela

        int i, j;
        
        for(i=0; i<3 ;i++)
        {
            if(i == 1)
            {
                System.out.printf("\n\t—————|—————|—————");    
                System.out.printf("\n\t");
            }
            else
                System.out.printf("\n\t");
                
            for(j=0; j<3 ;j++)
            {
                if(tabuleiro[i][j] > 8)
                {
                    if(j == 1)
                        System.out.printf("|  %c  |",tabuleiro[i][j]);
                    else
                        System.out.printf("  %c  ",tabuleiro[i][j]); 
                }
                else
                {
                    if(j == 1)
                        System.out.printf("|  %d  |",tabuleiro[i][j]);
                    else
                        System.out.printf("  %d  ",tabuleiro[i][j]);
                } 
            }

            if(i == 1)
                System.out.printf("\n\t—————|—————|—————"); 
        }

    }

    public static byte verificarJogadorX(int [][] tabuleiro){
        byte venceu=0;
        
        // verifica as linhas
        if(tabuleiro[0][0] == 88 && tabuleiro[0][1] == 88 && tabuleiro[0][2] == 88) // linha 0
            venceu = 1;
        if(tabuleiro[1][0] == 88 && tabuleiro[1][1] == 88 && tabuleiro[1][2] == 88) // linha 1
            venceu = 1;
        if(tabuleiro[2][0] == 88 && tabuleiro[2][1] == 88 && tabuleiro[2][2] == 88) // linha 2
            venceu = 1;

        // verifica as colunas
        if(tabuleiro[0][0] == 88 && tabuleiro[1][0] == 88 && tabuleiro[2][0] == 88) // coluna 0
            venceu = 1;
        if(tabuleiro[0][1] == 88 && tabuleiro[1][1] == 88 && tabuleiro[2][1] == 88) // coluna 1
            venceu = 1;
        if(tabuleiro[0][2] == 88 && tabuleiro[2][2] == 88 && tabuleiro[2][2] == 88) // coluna 2
            venceu = 1;

        // verifica diagonais
        if(tabuleiro[0][0] == 88 && tabuleiro[1][1] == 88 && tabuleiro[2][2] == 88) // diagonal esquerda
            venceu = 1;
        if(tabuleiro[2][0] == 88 && tabuleiro[1][1] == 88 && tabuleiro[0][2] == 88) // diagonal direita
            venceu = 1;

        return venceu;
    }

    public static byte verificarJogadorO(int [][] tabuleiro){
        byte venceu=0;
        
        // verifica as linhas
        if(tabuleiro[0][0] == 79 && tabuleiro[0][1] == 79 && tabuleiro[0][2] == 79) // linha 0
            venceu = 1;
        if(tabuleiro[1][0] == 79 && tabuleiro[1][1] == 79 && tabuleiro[1][2] == 79) // linha 1
            venceu = 1;
        if(tabuleiro[2][0] == 79 && tabuleiro[2][1] == 79 && tabuleiro[2][2] == 79) // linha 2
            venceu = 1;

        // verifica as colunas
        if(tabuleiro[0][0] == 79 && tabuleiro[1][0] == 79 && tabuleiro[2][0] == 79) // coluna 0
            venceu = 1;
        if(tabuleiro[0][1] == 79 && tabuleiro[1][1] == 79 && tabuleiro[2][1] == 79) // coluna 1
            venceu = 1;
        if(tabuleiro[0][2] == 79 && tabuleiro[2][2] == 79 && tabuleiro[2][2] == 79) // coluna 2
            venceu = 1;

        // verifica diagonais
        if(tabuleiro[0][0] == 79 && tabuleiro[1][1] == 79 && tabuleiro[2][2] == 79) // diagonal esquerda
            venceu = 1;
        if(tabuleiro[2][0] == 79 && tabuleiro[1][1] == 79 && tabuleiro[0][2] == 79) // diagonal direita
            venceu = 1;

        return venceu;
    }

    public static void main(String[] args){

        Scanner input = new Scanner (System.in); //permite que eu faça entrada de dados no programa

        byte venceu=0; // controla as jogadas dos jogadores se validas ou não e determina o final do jogo
        int tabuleiro[][] = new int[3][3]; // array bidimensional que compoem o tabuleiro
        int jogada_X, jogada_O; // determina a posição escolhida pelo jogador
        int jogadasTotais=0; // conta se uma linha ou uma coluna ou uma diagonal foi preenchida
        int z=1, w=1, t=1; // permite controle dos loopings do jogo
        int num = 0; // inicializa o tabuleiro
        int rodada=0; // conta o número de rodadas

        for(int m=0; m<3 ;m++)
        {
            for(int n=0; n<3 ;n++)
            {
                tabuleiro[m][n] = num;
                num++;
            }
        }
        
        System.out.printf("\n\t  JOGO DA VELHA\n");

        for(int i=0; i<z ;i++) // Enquanto o jogo não acaba
        {
            byte valido_X=2, valido_O=2; 
            
            System.out.printf("\n\t    RODADA %d\n",rodada+1);
            exibirTabuleiro(tabuleiro);

            // JOGADOR 'X'
            for(int j=0; j<w ;j++) // Enquanto a posição digitada pelo JOGADOR 'X' não for válida
            {
                System.out.printf("\n\nJOGADOR 'X'");
                System.out.printf("\nQual posição deseja marcar ? ");
                jogada_X = input.nextInt();

                if(jogada_X < 0 || jogada_X > 8) // verifica se o número da posição é valido
                {
                    valido_X = 0;
                    System.out.printf("\nPosição inválida, tente novamente !");
                    w++;
                }

                for(int a=0; a<3 ;a++)
                {
                    for(int b=0; b<3 ;b++)
                    {
                        if(jogada_X == tabuleiro[a][b]) // posição permitida
                        {
                            tabuleiro[a][b] = 88;
                            valido_X = 1;
                            jogadasTotais++;
                            exibirTabuleiro(tabuleiro);
                        }
                    }
                }

                if(valido_X == 2) // posição ocupada
                {
                    System.out.printf("\nPosição inválida, tente novamente !");
                    w++;
                }
                
                venceu = verificarJogadorX(tabuleiro); // verifica se o JOGADOR 'X' venceu
                
                if(venceu == 1)
                {    
                    System.out.printf("\n\n      O JOGADOR 'X' VENCEU !");
                    System.exit(0);
                }

                if(jogadasTotais == 9) // O tabuleiro ja foi preenchido sem que ninguém ganhasse, ou seja, velha
                {
                    System.out.printf("\n\n\t  DEU 'VELHA' !");
                    System.exit(0);
                }   
            }

            // JOGADOR 'O'
            for(int k=0; k<t ;k++) // Enquanto a posição digitada pelo JOGADOR 'O' não for válida
            {
                System.out.printf("\n\nJOGADOR 'O'");
                System.out.printf("\nQual posição deseja marcar ? ");
                jogada_O = input.nextInt();

                if(jogada_O < 0 || jogada_O > 8) // verifica se o número da posição é valido
                {
                    valido_O = 0;
                    System.out.printf("\nPosição inválida, tente novamente !");
                    t++;
                }

                for(int a=0; a<3 ;a++)
                {
                    for(int b=0; b<3 ;b++)
                    {
                        if(jogada_O == tabuleiro[a][b]) // posição permitida
                        {
                            tabuleiro[a][b] = 79;
                            valido_O = 1;
                            jogadasTotais++;
                            exibirTabuleiro(tabuleiro);
                            System.out.printf("\n");
                        }
                    }
                }

                if(valido_O == 2) // posição ocupada
                {
                    System.out.printf("\nPosição inválida, tente novamente !");
                    t++;
                }
                
                venceu = verificarJogadorO(tabuleiro); // verifica se o JOGADOR 'O' venceu
                
                if(venceu == 1)
                {   
                    System.out.printf("\n\n      O JOGADOR 'O' VENCEU !");
                    System.exit(0);
                }
            }

            if(venceu == 0)
            {
                z++;
                rodada++;
            }
        }        

        System.out.printf("\n\n");
    }
}
