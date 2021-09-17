.data
	flut:
		.align 2
		.space 20 # aloca 5 espaços no array
	
	fla: .float 3.14
	flb: .float 2.75
	flc: .float 6.32
	fld: .float 37.13
	fle: .float 10.91
	
	zero: .float 0.0
	
	espaco: .asciiz "  "
	msg1: .asciiz "Flut: "
	msg2: .asciiz "\nO maior número de flut é: "
.text
	li $t1, 20 # tamanho do vetor flut
	
	# primeira posição do vetor flut
	move $t0, $zero
	lwc1 $f0, fla
	swc1 $f0, flut($t0)
	
	# segunda posição do vetor flut
	addi $t0, $t0, 4
	lwc1 $f2, flb
	swc1 $f2, flut($t0)
	
	# terceira posição do vetor flut
	addi $t0, $t0, 4
	lwc1 $f4, flc
	swc1 $f4, flut($t0)
	
	# quarta posição do vetor flut
	addi $t0, $t0, 4
	lwc1 $f6, fld
	swc1 $f6, flut($t0)
	
	# quinta posição do vetor flut
	addi $t0, $t0, 4
	lwc1 $f8, fle
	swc1 $f8, flut($t0)
	
	move $t0, $zero # reinicia o indice do vetor flut
	lwc1 $f1, zero
	
	li $v0, 4
	la $a0, msg1
	syscall
	
imprimeFlut:
	beq $t0, $t1, saiImprimeFlut 
	
	lwc1 $f3, flut($t0)
	add.s $f12, $f1, $f3
	
	li $v0, 2
	syscall
	
	li $v0, 4
	la $a0, espaco
	syscall
	
	addi $t0, $t0, 4
	
	#li $t2, 4
	#beq $t0, $t2, primeiroMaior
	#subi $t3, $t0, 4
	#lwc1 $f5, flut($t3)
	
	#bgt $f3, $f5, maior
	
	#c.eq.d $f3, $f5   
	#bc1t maior 
	
	#add.s $f7, $f1, $f5
	
	#add.s $f12, $f1, $f7
	
	#li $v0, 2
	#syscall
	
	j imprimeFlut

saiImprimeFlut:
	li $v0, 4
	la $a0, msg2
	syscall
	
	add.s $f12, $f1, $f6
	
	li $v0, 2
	syscall
	
	li $v0, 10
	syscall
	
#primeiroMaior:
	#lwc1 $f7, flut($t2)
	#jr $ra
	
#maior:
	#add.s $f7, $f1, $f3
	#jr $ra
