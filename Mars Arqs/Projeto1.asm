.data
	titulo: .asciiz "-----------------   CBLOL   -----------------\n"
	inserir: .asciiz "\nInsira o nome dos 10 times participantes:\n"
	msg_vencedor: .asciiz "Vencedor: "
	msg_perdedor: .asciiz "Perdedor: "
	msg_editar: .asciiz "Deseja editar alguma informação (sim|nao) ? "
	msg_info: .asciiz "Qual informação deseja editar ?\n ( Nome, Vitórias, Derrotas )\n"
	
	times: .space 200
	time: .space 20
	#vitoria: .space		
	#derrota: .space	
	#jogos: .space	
	#colocacao: .space
		
	
	#vencedor:
	#perdedor:
	#resposta de editar
	#resposta1:
.text
	# imprime o titulo
	la $a0, titulo
	li $v0, 4
	syscall
	
	# imprime a mensagem de inserir
	la $a0, inserir
	li $v0, 4
	syscall
	
	move $t0, $zero # indice vetor times
	li $t1, 1	# contador = 1
	li $t2, 10	# numero de execuções
	
lerTime:	
	beq $t1, $t2, sairLerTime # se $t1 = $t2 para a entrada de times
	
	li $v0, 8
	la $a0, time
	li $a1, 20
	syscall
	
	sb $a0, times($t0)
	
	addi $t0, $t0, 20	# atualiza o indice do vetor times
	addi $t1, $t1, 1
	j lerTime

sairLerTime:
	move $t0, $zero # indice vetor times
	li $t1, 1	# contador = 1
	li $t2, 10	# numero de execuções
	
	imprime:
		beq $t1, $t2, saiImprime
		
		li $v0, 4
		lb $a0, times($t0)
		syscall
		
		la $a0, ' '
		li $v0, 4
		syscall
		
		addi $t1, $t1, 1
		addi $t0, $t0, 20
		
		j imprime
		
	saiImprime:
		li $v0, 10
		syscall
