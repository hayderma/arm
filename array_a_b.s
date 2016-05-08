 
    .global main
    .func main
   
main:
    MOV R0,#0
    BL writeloop
    BL readloop
    MOV R0,#0
    BL _max
    MOV R0,#0
    BL _printf_max
    MOV R0,#0
    BL _min
    MOV R0,#0
    BL _printf_min
	
writeloop:
    CMP R0, #10            @ check to see if we are done iterating
    BEQ writedone           @ exit loop if done
    LDR R1, =a              @ get address of a
    LSL R2, R0, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    STR R0, [R2]            @ write the address of a[i] to a[i]
    ADD R0, R0, #1          @ increment index
    B   writeloop           @ branch to next loop iteration
writedone:
    MOV R0, #0              @ initialze index variable
readloop:
    CMP R0, #10            @ check to see if we are done iterating
    BEQ _max            @ exit loop if done
    LDR R1, =a              @ get address of a
    LSL R2, R0, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    LDR R1, [R2]            @ read the array at address 
    PUSH {R0}               @ backup register before printf
    PUSH {R1}               @ backup register before printf
    PUSH {R2}               @ backup register before printf
    MOV R2, R1              @ move array value to R2 for printf
    MOV R1, R0              @ move array index to R1 for printf
    BL  _printf             @ branch to print procedure with return
    POP {R2}                @ restore register
    POP {R1}                @ restore register
    POP {R0}                @ restore register
    ADD R0, R0, #1          @ increment index
    B   readloop            @ branch to next loop iteration
    

readdone:
    MOV R0,#0

_max:
    CMP R0, #9            @ check to see if we are done iterating
    BEQ _printf_max         @ exit loop if done
    LDR R1, =a              @ get address of a
    LSL R2, R0, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    LDR R9, [R2]            @ read the array at address 
    ADD R10,R0,#1
    LSL R2, R10, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    LDR R8,[R2]
    CMP R8,R9
    MOVLE R7,R9
    MOVGT R7,R8
    MOV R1,R7		    @ended here
    ADD R0, R0, #1          @ increment index
    B   _max            @ branch to next loop iteration

_mini:
     CMP R0, #9            @ check to see if we are done iterating
    BEQ _printf_min         @ exit loop if done
    LDR R1, =a              @ get address of a
    LSL R2, R0, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    LDR R9, [R2]            @ read the array at address 
    ADD R10,R0,#1
    LSL R2, R10, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    LDR R8,[R2]
    CMP R8,R9
    MOVLE R7,R8
    MOVGT R7,R9
    MOV R1,R7		    @ended here
    ADD R0, R0, #1          @ increment index
    B   _mini            @ branch to next loop iteration

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
_printf_min:
    PUSH {LR}               @ store the return address
    LDR R0, =printf_min     @ R0 contains formatted string address
    BL printf               @ call printf
    POP {PC}                @ restore the stack pointer and return
_printf_max:
    PUSH {LR}               @ store the return address
    LDR R0, =printf_max     @ R0 contains formatted string address
    BL printf               @ call printf
    POP {PC}                @ restore the stack pointer and return
.data

.balign 4
a:              .skip       40
printf_str:     .asciz      "a[%d] = %d\n"
printf_min:     .asciz      "min = %d"
printf_max:     .asciz      "max = %d"
exit_str:       .ascii      "Terminating program.\n"
