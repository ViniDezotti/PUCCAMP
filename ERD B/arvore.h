#ifndef arvore_h
#define arvore_h
#endif

#include<stdio.h>
#include<stdlib.h>

//Estrutura de árvore
struct arvore
{
    struct arvore * esquerda;
    int info;
    struct arvore * direita;
};
typedef struct arvore Arvore;

//Função que inicializa uma árvore vazia
Arvore * criaArvore()
{
    return NULL;
}


//Função de inserção do elemento na árvore, se maior que o elemento pai é alocado a direita do elemento, caso contrário a esquerda
Arvore * insereArvore(Arvore * raiz, int valor)
{
    Arvore * novo;
    Arvore * pai;
    
    novo = (Arvore*) malloc (sizeof(Arvore));
    novo->esquerda = NULL;
    novo->info = valor;
    novo->direita = NULL;

    pai = raiz;

    int x=1;

    if(raiz == NULL)
    {
        raiz = novo;
        return raiz;
    }

    while(x == 1)
    {
        if(pai->info < valor)
        {
            if(pai->direita == NULL)
            {
                pai->direita = novo;
                x = 0;
            }

            pai = pai->direita;
        }
        else
        {
            if(pai->esquerda == NULL)
            {
                pai->esquerda = novo;
                x = 0;
            }

            pai = pai->esquerda;
        }
    }
    
    return raiz;
}

//Função que verifica se a árvore esta vazia, retorna 1 se vaiz ou retorna 0 se não vazia
int vaziaArvore (Arvore * raiz)
{
    if(raiz == NULL)
        return 1;
    else
        return 0;
}

//Função de Impressão em Pre Order, imprime o elemento pai antes que se faça uma verificação
void imprimeArvorePreOrder (Arvore * raiz)
{
    printf("%d - ",raiz->info);

    if(raiz->direita != NULL)
      imprimeArvorePreOrder(raiz->direita);

    if(raiz->esquerda != NULL)
        imprimeArvorePreOrder(raiz->esquerda);  
}

//Função de Impressão em In Order, imprime o elemento pai após a primeira verificação
void imprimeArvoreInOrder (Arvore * raiz)
{
    if(raiz->direita != NULL)
      imprimeArvoreInOrder(raiz->direita);

    printf("%d - ",raiz->info);

    if(raiz->esquerda != NULL)
        imprimeArvoreInOrder(raiz->esquerda);  
}

//Função de Impressão em Pos Order, imprime o elemento pai após as duas verificações
void imprimeArvorePosOrder (Arvore * raiz)
{
    if(raiz->direita != NULL)
      imprimeArvorePosOrder(raiz->direita);

    if(raiz->esquerda != NULL)
        imprimeArvorePosOrder(raiz->esquerda);

    printf("%d - ",raiz->info);  
}

//Retira um elemento da árvore
Arvore * retiraArvore (Arvore * raiz, int valor)
{
    if (raiz == NULL)
        return NULL;
    
    else if (raiz->info > valor)
        raiz->esquerda = retiraArvore(raiz->esquerda, valor);
    
    else if (raiz->info < valor)
        raiz->direita = retiraArvore(raiz->direita, valor);
    
    else /* achou o nó a remover */
    { 
        /* nó sem filhos */
        if (raiz->esquerda == NULL && raiz->direita == NULL)
        {
            free (raiz);
            raiz = NULL;
        }
        
        /* nó só tem filho à direita */
        else if (raiz->esquerda == NULL) 
        {
            Arvore * t = raiz;
            raiz = raiz->direita;
            free (t);
        }
        
        /* só tem filho à esquerda */
        else if (raiz->direita == NULL) 
        {
            Arvore * t = raiz;
            raiz = raiz->esquerda;
            free (t);
        }
        
        /* nó tem os dois filhos */
        else 
        {
            Arvore * f = raiz->esquerda;
            while (f->direita != NULL) 
            {
                f = f->direita;
            }
            raiz->info = f->info; /* troca as informações */
            f->info = valor;
            raiz->esquerda = retiraArvore(raiz->esquerda,valor);
        }
    }
    return raiz;
}

//Libera a árvore 
void liberaArvore(Arvore * raiz)
{
    if (vaziaArvore(raiz) == 1)
        return;
    
    if (raiz->direita != NULL)
        liberaArvore(raiz->direita);
    
    if (raiz->esquerda != NULL)
        liberaArvore(raiz->esquerda);
    
     free(raiz);
}

//Conta o número de folhas de uma árvore
int numFolhas(Arvore * raiz)
{
    int num=0;

    if(raiz->direita == NULL && raiz->esquerda == NULL)
        return 1; 

    if(raiz->direita != NULL)
        num+= numFolhas(raiz->direita);

    if(raiz->esquerda != NULL)
        num+= numFolhas(raiz->esquerda);    

    return num;     
}
/*
void desenharArvore(Arvore *raiz, int nivel, int baseCol){
    if (vazia(raiz))
        return;

    //0.5 para aumentar o espaÃ§o
    int espaco = 80 / (pow(2, (nivel + 2) / 2) + 0.5);
    if(espaco < 5)
       espaco = 5;


    if (raiz->esquerda != NULL){
        cursor(nivel, baseCol - espaco);
        imprimirGalhoEsquerda(espaco);
        desenharArvore(raiz->esquerda, nivel + 2, baseCol - espaco);
    }

    if (raiz->direita != NULL){
        cursor(nivel, baseCol);
        imprimirGalhoDireita(espaco);
        desenharArvore(raiz->direita, nivel + 2, baseCol + espaco);
    }

    if(nivel != 0){
        cursor(nivel - 1, baseCol);
        printf("\263");
    }


    cursor(nivel, baseCol);
    printf("%c", raiz->valor);
}
*/