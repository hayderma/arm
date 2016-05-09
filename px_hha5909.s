/************************************
*@file final.s
*Author : Hayder Mohammed Ali
*Min,max,sum,array_print
* L's represent labels (or functions to go to)
************************************/

	
	.align	2
.LC0:
	.ascii	"%d\000"
	.align	2
.LC1:
	.ascii	"a[%d] = %d\012\000"
	.align	2
.LC2:
	.ascii	"Max = %d\012\000"   @declaring strings
	.align	2
.LC3:
	.ascii	"Min = %d\012\000"
	.align	2
.LC4:
	.ascii	"Sum = %d\012\012\000"
	.align	2
.LC5:
	.ascii	"Terminating Program.\000"
	.text
	.align	2
	.global	main
	.type	main, %function
main:
	
	stmfd	sp!, {r4, fp, lr}
	add	fp, sp, #8
	sub	sp, sp, #92
	mov	r3, #0
	str	r3, [fp, #-16]
	b	.L2
.L3:
	ldr	r2, .L6
	sub	r3, fp, #60
	mov	r0, r2
	mov	r1, r3
	bl	__isoc99_scanf
	ldr	r2, [fp, #-60]
	ldr	r1, [fp, #-16]
	mvn	r3, #87
	mov	r1, r1, asl #2
	sub	r0, fp, #12
	add	r1, r0, r1
	add	r3, r1, r3
	str	r2, [r3, #0]
	ldr	r3, [fp, #-16]
	add	r3, r3, #1
	str	r3, [fp, #-16]
.L2:
	ldr	r3, [fp, #-16]
	cmp	r3, #9
	ble	.L3
	mov	r3, #0
	str	r3, [fp, #-16]
	b	.L4
.L5:
	ldr	r2, .L6+4
	ldr	r1, [fp, #-16]
	mvn	r3, #87
	mov	r1, r1, asl #2
	sub	r0, fp, #12
	add	r1, r0, r1
	add	r3, r1, r3
	ldr	r3, [r3, #0]
	mov	r0, r2
	ldr	r1, [fp, #-16]
	mov	r2, r3
	bl	printf
	ldr	r3, [fp, #-16]
	add	r3, r3, #1
	str	r3, [fp, #-16]
.L4:
	ldr	r3, [fp, #-16]
	cmp	r3, #9
	ble	.L5
	ldr	r4, .L6+8
	sub	r3, fp, #100
	sub	r2, fp, #100
	mov	ip, r2
	mov	r0, r3
	bl	max.2230
	mov	r3, r0
	mov	r0, r4
	mov	r1, r3
	bl	printf
	ldr	r4, .L6+12
	sub	r3, fp, #100
	sub	r2, fp, #100
	mov	ip, r2
	mov	r0, r3
	bl	min.2238
	mov	r3, r0
	mov	r0, r4
	mov	r1, r3
	bl	printf
	ldr	r4, .L6+16
	sub	r3, fp, #100
	sub	r2, fp, #100
	mov	ip, r2
	mov	r0, r3
	bl	sum.2246
	mov	r3, r0
	mov	r0, r4
	mov	r1, r3
	bl	printf
	ldr	r0, .L6+20
	bl	puts
	sub	sp, fp, #8
	ldmfd	sp!, {r4, fp, pc}
.L7:
	.align	2
.L6:
	.word	.LC0
	.word	.LC1
	.word	.LC2
	.word	.LC3
	.word	.LC4
	.word	.LC5
	.size	main, .-main
	.align	2
	.type	max.2230, %function
max.2230:
	
	str	fp, [sp, #-4]!
	add	fp, sp, #0
	sub	sp, sp, #20
	str	r0, [fp, #-16]
	mov	r3, ip
	ldr	r2, [fp, #-16]
	ldr	r2, [r2, #0]
	str	r2, [fp, #-8]
	mov	r2, #1
	str	r2, [fp, #-12]
	b	.L9
.L11:
	ldr	r2, [fp, #-12]
	ldr	r1, [r3, r2, asl #2]
	ldr	r2, [fp, #-8]
	cmp	r1, r2
	ble	.L10
	ldr	r2, [fp, #-12]
	ldr	r2, [r3, r2, asl #2]
	str	r2, [fp, #-8]
.L10:
	ldr	r2, [fp, #-12]
	add	r2, r2, #1
	str	r2, [fp, #-12]
.L9:
	ldr	r2, [fp, #-12]
	cmp	r2, #9
	ble	.L11
	ldr	r3, [fp, #-8]
	mov	r0, r3
	add	sp, fp, #0
	ldmfd	sp!, {fp}
	bx	lr
	.size	max.2230, .-max.2230
	.align	2
	.type	min.2238, %function
min.2238:
	
	str	fp, [sp, #-4]!
	add	fp, sp, #0
	sub	sp, sp, #20
	str	r0, [fp, #-16]
	mov	r3, ip
	ldr	r2, [fp, #-16]
	ldr	r2, [r2, #0]
	str	r2, [fp, #-8]
	mov	r2, #1
	str	r2, [fp, #-12]
	b	.L13
.L15:
	ldr	r2, [fp, #-12]
	ldr	r1, [r3, r2, asl #2]
	ldr	r2, [fp, #-8]
	cmp	r1, r2
	bge	.L14
	ldr	r2, [fp, #-12]
	ldr	r2, [r3, r2, asl #2]
	str	r2, [fp, #-8]
.L14:
	ldr	r2, [fp, #-12]
	add	r2, r2, #1
	str	r2, [fp, #-12]
.L13:
	ldr	r2, [fp, #-12]
	cmp	r2, #9
	ble	.L15
	ldr	r3, [fp, #-8]
	mov	r0, r3
	add	sp, fp, #0
	ldmfd	sp!, {fp}
	bx	lr
	.size	min.2238, .-min.2238
	.align	2
	.type	sum.2246, %function
sum.2246:
	
	str	fp, [sp, #-4]!
	add	fp, sp, #0
	sub	sp, sp, #20
	str	r0, [fp, #-16]
	mov	r2, ip
	mov	r3, #0
	str	r3, [fp, #-12]
	mov	r3, #0
	str	r3, [fp, #-8]
	b	.L17
.L18:
	ldr	r3, [fp, #-8]
	ldr	r3, [r2, r3, asl #2]
	ldr	r1, [fp, #-12]
	add	r3, r1, r3
	str	r3, [fp, #-12]
	ldr	r3, [fp, #-8]
	add	r3, r3, #1
	str	r3, [fp, #-8]
.L17:
	ldr	r3, [fp, #-8]
	cmp	r3, #9
	ble	.L18
	ldr	r3, [fp, #-12]
	mov	r0, r3
	add	sp, fp, #0
	ldmfd	sp!, {fp}
	bx	lr
	
