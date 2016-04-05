/******************************************************************************
* @file hello_world.s
* @brief Simple hello world example using printf
* @author Christopher D. McMurrough
******************************************************************************/
 
    .global main
    .func main
   
main:
    MOV R1,#5
    MOV R2,#10
    LDR R0,=print_str   @ store string address in R0
    
    
    BL   _add
    BL printf           @ call printf
    B   _exit           @ branch to exit procedure with no return
   
_add:
	add R1,R1,R2
	MOV PC,LR

_exit:   
	MOV R7, #1          @ terminate syscall, 1
	SWI 0               @ execute syscall

.data
print_str:  .asciz "The Result is : %d\n"
