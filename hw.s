/******************************************************************************

* Simple Calculator 
*
* @author Hayder MohammedAli
******************************************************************************/
 
    .global main
    .func main
   
main:
  BL _scanf
  BL _getchar
  
   @ MOV R1,#5
    @MOV R2,#10
    LDR R0,=print_str   @ store string address in R0
    
     
   @ BL  _scanf              @ branch to scanf procedure with return
    MOV R1, R0              @ move return value R0 to argument register R1
  
    
   CMP R3, '+'		@ R3 is where the operation is saved from scanf
   BL _add		@ compare R3 and call related procedure
   CMP R3, '-'
   BL _subtract
   CMP R3, '*'
   BL _multiply
   CMP R3, 'M'
   BL _M

    
_scanf:
    MOV R4, LR              @ store LR 
    SUB SP, SP, #4          @ make room on stack
    
    MOV R1, SP              @ move SP to R1 to store entry on stack
    BL scanf                @ call scanf
    LDR R1, [SP]            @ load value at SP into R0
    ADD SP, SP, #4          @ restore the stack pointer
    MOV PC, R4              @ return
    
    _getchar:
    MOV R7, #3              @ write syscall, 3
    MOV R0, #0              @ input stream from monitor, 0
    MOV R2, #1              @ read a single character
    LDR R1, =read_char      @ store the character in data memory
    SWI 0                   @ execute the system call
    LDR R0, [R1]            @ move the character to the return register
    AND R0, #0xFF           @ mask out all but the lowest 8 bits
    MOV PC, LR              @ return


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
	CMP R1,R2
	MOVGT R1,R2      @if R2 > R1 , move R2 to R1 for printing
	

_exit:   
	MOV R7, #1          @ terminate syscall, 1
	SWI 0               @ execute syscall

.data
print_str:  .asciz "The Result is : %d\n"
