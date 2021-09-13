#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "arvore.h"

int NosInternos(Arvore * raiz)
{
    int num=0;

    if(raiz->direita != NULL || raiz->esquerda != NULL)
        num = 1;
    
    if(raiz->direita != NULL)
        num+= NosInternos(raiz->direita);

    if(raiz->esquerda != NULL)
        num+= NosInternos(raiz->esquerda);
    
    return num;       
}

int main()
{
    Arvore * ARVORE;
    ARVORE = criaArvore();

    int i, z=1, num, nosInternos;
    char resp[4];

    for(i=0; i<z ;i++)
    {
        printf("\nQual valor deseja inserir na arvore ? ");
        scanf("%d",&num);

        ARVORE = insereArvore(ARVORE,num);
        imprimeArvorePreOrder(ARVORE);

        printf("\n\nDeseja inserir novamente (sim|nao) ? ");
        fflush(stdin);
        scanf("%[^\n]",&resp);

        if(strcmp("sim",resp)==0 || strcmp("SIM",resp)==0)
            z++;
        else
            z=0;
    }

    nosInternos = NosInternos(ARVORE) ;

    printf("\nExistem %d nos internos na arvore !",nosInternos);

    printf("\n\n");
    return 0;
}