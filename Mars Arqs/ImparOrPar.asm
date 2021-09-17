.data 
	msg: .asciiz "Digite um número: "
    	par: .asciiz "O número digitado é par !"
    	impar: .asciiz "O número digitado é impar !"

.text
.globl main
main:
	la $a0, msg
    	jal imprimeString
    	jal leInteiro

    	move $a0, $v0
    	jal ehImpar
    	beq $v0, $zero, imprimePar

    	la $a0, impar
    	jal imprimeString
    	jal encerraPrograma

# função que imprime que o número é par
imprimePar:
	la $a0, par
    	jal imprimeString
    	jal encerraPrograma

# função que verifica se o argumento $a0 é impar
# retorna 1 se for impar
# retorna 0 se for par
ehImpar:
    	li $t0, 2
    	div $a0, $t0

    	mfhi $v0
    	jr $ra

# função que recebe uma string em $a0 e a imprime
imprimeString:
    	li $v0, 4
    	syscall
    	jr $ra

# função que lê um inteiro e o retorna em $v0
leInteiro:
    	li $v0, 5
    	syscall
    	jr $ra

# função que encerra programa
encerraPrograma:
    	li $v0, 10
    	syscall