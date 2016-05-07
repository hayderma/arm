/******************************************************************************
* @file array_a_b.s
* @program_final
******************************************************************************/
 
.global main
.func main
   
main:
    
    MOV R9, #0              @ initialze index variable
    MOV R10,#9
    BL writeloop            @ call write function
    BL readloop             @call read function (prints a)
    
writeloop:
   
    
    CMP R9, #10            @ check to see if we are done iterating
    BEQ writedone           @ exit loop if done
    LDR R1, =a              @ get address of a
    LSL R2, R9, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    
    STR R10, [R2]            @ write input to a[i]
    ADD R9, R9, #1          @ increment index
    B   writeloop           @ branch to next loop iteration
writedone:
    MOV R9, #0              @ initialze index variable
readloop:
    CMP R9, #10            @ check to see if we are done iterating
    BEQ readdone            @ exit loop if done
    LDR R1, =a              @ get address of a
    LSL R2, R9, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    LDR R1, [R2]            @ read the array at address 
    PUSH {R0,R9}               @ backup register before printf
    PUSH {R1}               @ backup register before printf
    PUSH {R2}               @ backup register before printf
    MOV R2, R1              @ move array value to R2 for printf
    MOV R1, R9              @ move array index to R1 for printf
    BL  _printf             @ branch to print procedure with return
    POP {R2}                @ restore register
    POP {R1}                @ restore register
    POP {R0,R9}                @ restore register
    ADD R9, R9, #1          @ increment index
    B   readloop            @ branch to next loop iteration
readdone:
    MOV R9,#0               @reset counter (i)
    

 _scanf:
    PUSH {LR}               @ store the return address
    PUSH {R1}               @ backup regsiter value
    LDR R0, =format_str     @ R0 contains address of format string
    SUB SP, SP, #4          @ make room on stack
    MOV R1, SP              @ move SP to R1 to store entry on stack
    BL scanf                @ call scanf
    LDR R0, [SP]            @ load value at SP into R0
    ADD SP, SP, #4          @ remove value from stack
    POP {R1}                @ restore register value
    POP {PC}                @ restore the stack pointer and return   
 
 
    
 
_exit:  
    MOV R7, #4              @ write syscall, 4
    MOV R0, #1              @ output stream to monitor, 1
    MOV R2, #21             @ print string length
    LDR R1, =exit_str       @ string at label exit_str:
    SWI 0                   @ execute syscall
    MOV R7, #1              @ terminate syscall, 1
    SWI 0                   @ execute syscall
       
_printf:
    PUSH {LR}               @ store the return address
    LDR R0, =printf_str     @ R0 contains formatted string address
    BL printf               @ call printf
    POP {PC}                @ restore the stack pointer and return
    

   
.data

format_str:     .asciz      "%d"

.balign 4
a:              .skip       40
printf_str:     .asciz      "a[%d] = %d\n"
exit_str:       .ascii      "Terminating program.\n"
