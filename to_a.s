	.arch armv6
	.eabi_attribute 27, 3
	.eabi_attribute 28, 1
	.fpu vfp
	.eabi_attribute 20, 1
	.eabi_attribute 21, 1
	.eabi_attribute 23, 3
	.eabi_attribute 24, 1
	.eabi_attribute 25, 1
	.eabi_attribute 26, 2
	.eabi_attribute 30, 6
	.eabi_attribute 18, 4
	.file	"to_a.c"
	.section	.rodata
	.align	2
.LC0:
	.ascii	"%d\000"
	.align	2
.LC1:
	.ascii	"a[%d] = %d\012\000"
	.align	2
.LC2:
	.ascii	"Max = %d\012\000"
	.align	2
.LC3:
	.ascii	"Min = %d\012\000"
	.text
	.align	2
	.global	main
	.type	main, %function
main:
	@ args = 0, pretend = 0, frame = 56
	@ frame_needed = 1, uses_anonymous_args = 0
	stmfd	sp!, {fp, lr}
	add	fp, sp, #4
	sub	sp, sp, #56
	mov	r3, #0
	str	r3, [fp, #-8]
	b	.L2
.L3:
	ldr	r2, .L14
	sub	r3, fp, #60
	mov	r0, r2
	mov	r1, r3
	bl	__isoc99_scanf
	ldr	r2, [fp, #-60]
	ldr	r1, [fp, #-8]
	mvn	r3, #51
	mov	r1, r1, asl #2
	sub	r0, fp, #4
	add	r1, r0, r1
	add	r3, r1, r3
	str	r2, [r3, #0]
	ldr	r3, [fp, #-8]
	add	r3, r3, #1
	str	r3, [fp, #-8]
.L2:
	ldr	r3, [fp, #-8]
	cmp	r3, #9
	ble	.L3
	mov	r3, #0
	str	r3, [fp, #-8]
	b	.L4
.L5:
	ldr	r2, .L14+4
	ldr	r1, [fp, #-8]
	mvn	r3, #51
	mov	r1, r1, asl #2
	sub	r0, fp, #4
	add	r1, r0, r1
	add	r3, r1, r3
	ldr	r3, [r3, #0]
	mov	r0, r2
	ldr	r1, [fp, #-8]
	mov	r2, r3
	bl	printf
	ldr	r3, [fp, #-8]
	add	r3, r3, #1
	str	r3, [fp, #-8]
.L4:
	ldr	r3, [fp, #-8]
	cmp	r3, #9
	ble	.L5
	mov	r3, #0
	str	r3, [fp, #-8]
	b	.L6
.L9:
	ldr	r2, [fp, #-8]
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r1, fp, #4
	add	r2, r1, r2
	add	r3, r2, r3
	ldr	r2, [r3, #0]
	ldr	r3, [fp, #-8]
	add	r1, r3, #1
	mvn	r3, #51
	mov	r1, r1, asl #2
	sub	r0, fp, #4
	add	r1, r0, r1
	add	r3, r1, r3
	ldr	r3, [r3, #0]
	cmp	r2, r3
	ble	.L7
	ldr	r2, [fp, #-8]
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r1, fp, #4
	add	r2, r1, r2
	add	r3, r2, r3
	ldr	r3, [r3, #0]
	str	r3, [fp, #-12]
	b	.L8
.L7:
	ldr	r2, [fp, #-8]
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r0, fp, #4
	add	r2, r0, r2
	add	r3, r2, r3
	ldr	r2, [r3, #0]
	ldr	r3, [fp, #-8]
	add	r1, r3, #1
	mvn	r3, #51
	mov	r1, r1, asl #2
	sub	r0, fp, #4
	add	r1, r0, r1
	add	r3, r1, r3
	ldr	r3, [r3, #0]
	cmp	r2, r3
	bge	.L8
	ldr	r3, [fp, #-8]
	add	r2, r3, #1
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r1, fp, #4
	add	r2, r1, r2
	add	r3, r2, r3
	ldr	r3, [r3, #0]
	str	r3, [fp, #-12]
.L8:
	ldr	r3, [fp, #-8]
	add	r3, r3, #1
	str	r3, [fp, #-8]
.L6:
	ldr	r3, [fp, #-8]
	cmp	r3, #9
	ble	.L9
	mov	r3, #0
	str	r3, [fp, #-8]
	b	.L10
.L13:
	ldr	r2, [fp, #-8]
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r0, fp, #4
	add	r2, r0, r2
	add	r3, r2, r3
	ldr	r2, [r3, #0]
	ldr	r3, [fp, #-8]
	add	r1, r3, #1
	mvn	r3, #51
	mov	r1, r1, asl #2
	sub	r0, fp, #4
	add	r1, r0, r1
	add	r3, r1, r3
	ldr	r3, [r3, #0]
	cmp	r2, r3
	bge	.L11
	ldr	r2, [fp, #-8]
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r1, fp, #4
	add	r2, r1, r2
	add	r3, r2, r3
	ldr	r3, [r3, #0]
	str	r3, [fp, #-16]
	b	.L12
.L11:
	ldr	r2, [fp, #-8]
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r0, fp, #4
	add	r2, r0, r2
	add	r3, r2, r3
	ldr	r2, [r3, #0]
	ldr	r3, [fp, #-8]
	add	r1, r3, #1
	mvn	r3, #51
	mov	r1, r1, asl #2
	sub	r0, fp, #4
	add	r1, r0, r1
	add	r3, r1, r3
	ldr	r3, [r3, #0]
	cmp	r2, r3
	ble	.L12
	ldr	r3, [fp, #-8]
	add	r2, r3, #1
	mvn	r3, #51
	mov	r2, r2, asl #2
	sub	r1, fp, #4
	add	r2, r1, r2
	add	r3, r2, r3
	ldr	r3, [r3, #0]
	str	r3, [fp, #-16]
.L12:
	ldr	r3, [fp, #-8]
	add	r3, r3, #1
	str	r3, [fp, #-8]
.L10:
	ldr	r3, [fp, #-8]
	cmp	r3, #9
	ble	.L13
	ldr	r3, .L14+8
	mov	r0, r3
	ldr	r1, [fp, #-12]
	bl	printf
	ldr	r3, .L14+12
	mov	r0, r3
	ldr	r1, [fp, #-16]
	bl	printf
	sub	sp, fp, #4
	ldmfd	sp!, {fp, pc}
.L15:
	.align	2
.L14:
	.word	.LC0
	.word	.LC1
	.word	.LC2
	.word	.LC3
	.size	main, .-main
	.ident	"GCC: (Debian 4.6.3-8+rpi1) 4.6.3"
	.section	.note.GNU-stack,"",%progbits
