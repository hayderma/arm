/******************************************************************************

* Simple Calculator 
*
* @author Hayder MohammedAli
******************************************************************************/
 
    .global main
    .func main
   
main:
  BL _scanf       
  MOV R4,R0    @ Fist input number
  BL _getchar  
  MOV R5,R0	@Operation char
  BL _scan
  MOV R6,R0	@Second input number
  
   
    LDR R0,=print_str   @ store string address in R0
    
     
  
    MOV R1, R0              @ move return value R0 to argument register R1
  
    
   CMP R5,#'+'		@ R5 is where the operation is saved from scanf
   BL _add		@ compare R5 and call related procedure
   MOV R1,R0		@then after any procedure call, move R0 to R1 for printing
   CMP R5, #'-'
   BL _subtract
   MOV R1,R0
   CMP R5, #'*'
   BL _multiply
   MOV R1,R0
   CMP R5, #'M'
   BL _M
   MOV R1,R0

    
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


    
    BL printf           @ call printf
    B   _exit           @ branch to exit procedure with no return
   
_add:
	add R0,R4,R6     @adding
	MOV PC,LR
_subtract:
	sub R0,R4,R6     @subtracting
	MOV PC,LR
_multiply:
	mul R0,R4,R6     @multiplying
	MOV PC,LR
_M:
	CMP R4,R6
	MOVGT R0,R2      @if R2 > R1 , move R2 to R0
	MOVLT R0,R1
	MOV PC,LR
	

_exit:   
	MOV R7, #1          @ terminate syscall, 1
	SWI 0               @ execute syscall

.data
print_str:  .asciz "The Result is : %d\n"
