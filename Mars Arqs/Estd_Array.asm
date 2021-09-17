.data
	meuArray:
		.align 2
		.space 16   # aloca 4 espa�os no array

.text
	move $t0, $zero   # indice do array
	move $t1, $zero   # valor a ser colocado no array
	li $t2, 16        # tamanho do array

loop:
	beq $t0, $t2, saiLoop   # se $t0(indice = 0) = $t2(tamanho) vai para saiLoop
	sw $t1, meuArray($t0)   # aloca $t1(valor) na primeira posi��o do array (meuArray($zero))
	addi $t0, $t0, 4        # atualiza o indice somando 4 para proxima posi��o
	addi $t1, $t1, 1        # incrementa o valor a ser alocado na proxima posi��o
	j loop                  # continua loop

saiLoop:
	move $t0, $zero   # reinicia o indice do array
	
	imprime:
		beq $t0, $t2, saiImprime   # se $t0 = $t2 vai para saiImprime  
		li $v0, 1                  # imprime inteiro
		lw $a0, meuArray($t0)      # $a0 recebe o valor de meuArray(indice)
		syscall

		addi $t0, $t0, 4   # atualiza o indice somando 4 para proxima posi��o   
		j imprime          # continua imprime
	
	saiImprime:
		li $v0, 10   # encerra o programa
		syscall