/******************************************************************************

* Simple Calculator 
*
* @author Hayder MohammedAli
******************************************************************************/
 
    .global main
    .func main
   
main:
    MOV R4,#3		@ LOOP_COUNTER (3 INPUTS)
    loop_label:  	
    bl      scanf
    sub     r4, r4, #1  
    cmp     r4, #0  
    bne     loop_label    @ for (i = 3; i != 0; i--)
    MOV R1,#5
    MOV R2,#10
    LDR R0,=print_str   @ store string address in R0
    
     
    BL  _scanf              @ branch to scanf procedure with return
    MOV R1, R0              @ move return value R0 to argument register R1
  
    
       

    
_scanf:
    MOV R4, LR              @ store LR since scanf call overwrites
    SUB SP, SP, #4          @ make room on stack
    
    MOV R1, SP              @ move SP to R1 to store entry on stack
    BL scanf                @ call scanf
    LDR R1, [SP]            @ load value at SP into R0
    ADD SP, SP, #4          @ restore the stack pointer
    MOV PC, R4              @ return


    
    
    
    
    
    
    BL   _add
    BL printf           @ call printf
    B   _exit           @ branch to exit procedure with no return
   
_add:
	add R1,R1,R2     @adding
	MOV PC,LR
_subtract:
	sub R1,R1,R2     @subtracting
	MOV PC,LR
_multiply:
	mul R1,R1,R2     @multiplying
	MOV PC,LR
_M:
	cmp R1,R2
	MOVGT R1,R2      @if R2 > R1 , move R2 to R1 for printing
	

_exit:   
	MOV R7, #1          @ terminate syscall, 1
	SWI 0               @ execute syscall

.data
print_str:  .asciz "The Result is : %d\n"
