/******************************************************************************

* Simple Calculator 
*
* @author Hayder MohammedAli
******************************************************************************/
 
    .global main
    .func main
   
main:
    MOV R1,#5
    MOV R2,#10
    LDR R0,=print_str   @ store string address in R0
    
     BL  _prompt             @ branch to prompt procedure with return
    BL  _scanf              @ branch to scanf procedure with return
    MOV R1, R0              @ move return value R0 to argument register R1
  
    _prompt:
    MOV R7, #4              @ write syscall, 4
    MOV R0, #1              @ output stream to monitor, 1
    MOV R2, #31             @ print string length
    LDR R1, =prompt_str     @ string at label prompt_str:
    SWI 0                   @ execute syscall
    MOV PC, LR              @ return
       

    
_scanf:
    MOV R4, LR              @ store LR since scanf call overwrites
    SUB SP, SP, #4          @ make room on stack
    LDR R0, =format_str     @ R0 contains address of format string
    MOV R1, SP              @ move SP to R1 to store entry on stack
    BL scanf                @ call scanf
    LDR R0, [SP]            @ load value at SP into R0
    ADD SP, SP, #4          @ restore the stack pointer
    MOV PC, R4              @ return


    
    
    
    
    
    
    BL   _add
    BL printf           @ call printf
    B   _exit           @ branch to exit procedure with no return
   
_add:
	add R1,R1,R2     @adding
	MOV PC,LR

_exit:   
	MOV R7, #1          @ terminate syscall, 1
	SWI 0               @ execute syscall

.data
print_str:  .asciz "The Result is : %d\n"
