/******************************************************************************
* @file array_a_b.s
* @program_3
* NOTE_1, readloop function read unsorted array a, _sort_ascending function will
* sort elements of a, store them into b, and then print elements of b.
*NOTE_2, _printf will print array a, _print_b will print array b
* Arrays
******************************************************************************/
 
.global main
.func main
   
main:
    BL _scanf
    MOV R8,R0                  @storing n in R8
    MOV R0, #0              @ initialze index variable
    BL writeloop            @ call write function
    BL readloop             @call read function (prints a)
    BL _sort_ascending     @ after done printing a, call sort procedure to sort a, and print b
writeloop:
    CMP R0, #20            @ check to see if we are done iterating
    BEQ writedone           @ exit loop if done
    LDR R1, =a              @ get address of a
    ADD R9,R0,R8            @ R9=n+i
    ADD R10,R0,#1           @R10= i+1
    ADD R11,R10,#1          @R11= n+i+1
    MOV R12,#-1
    MUL R11,R11,R12         @MULTIPLY R11 BY -1 (R11= -(n+i+1)
    LSL R2, R0, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    STR R9, [R2]            @ write value to a[i]
    ADD R0, R0, #1          @ increment index
    LSL R2, R0, #2          @ multiply index*4 to get array offset
    ADD R2, R1, R2          @ R2 now has the element address
    STR R11, [R2]           @ write  value to a[i+1]
    ADD R0, R0, #1          @ increment index
    B   writeloop           @ branch to next loop iteration
writedone:
    MOV R0, #0              @ initialze index variable
readloop:
    CMP R0, #20            @ check to see if we are done iterating
    BEQ readdone            @ exit loop if done
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
    MOV R0,#0               @reset counter (i)
    
_sort_ascending:           @ function to read from array a, compare a[i] with a[i+1] and write to b[i]
    MOV R12,#0             @R12 is (i) for array b
    CMP R0, #20            @ check to see if we are done iterating
    BEQ _exit              @ exit if done comparing and storing in b
    LDR R1, =a              @ get address of a
    LDR R7, =b              @get address of b
    LSL R2, R0, #2          @ multiply index*4 to get array offset for array A
    LSL R8, R12, #2          @ multiply index*4 to get array offset for array B
    ADD R2, R1, R2          @ R2 now has the element address for array A
    ADD R8, R7, R8          @ R8 now has the element address for array B
    LDR R1, [R2]            @ read the array at address 
    MOV R9,R1               @ MOVE a[i] to R9 for comparsion with R10 (a[i+1]) later
    ADD R0, R0, #1          @ increment index i for array a for next element
    LSL R2, R0, #2          @ multiply index*4 to get NEXT array offset for array A
    ADD R2, R1, R2          @ R2 now has the NEXT element address for array A
    LDR R1, [R2]            @ read the NEXT array element at address in array A
    MOV R10,R1              @ MOVE a[i+1] to R10 for compasion with R9 (a[i])
    CMP   R9, R10           @compare i and i+1 
    MOVLE R11, R9           @if i < i+1 , MOVE i to R11 to write to array b[i]
    MOVGT R11, R10          @if i > i+1, MOVE i+1 to R11 to write to array b[i]
    STR R11, [R8]           @ write  smallest value stored in R11 to b[i]
    PUSH {R0}               @ backup register before printf
    PUSH {R2}               @ backup register before printf (address of b[i])
    PUSH {R1}               @ backup register before printf (value of b[i])
    MOV R2, R11             @ move array value to R2 for printf
    MOV R1, R8              @ move array index to R1 for printf
    BL  _printf_b           @ branch to print procedure with return
    POP {R1}                @ restore register
    POP {R2}                @ restore register
    POP {R0}                @ restore register
    ADD R0, R0, #1          @ increment index i for array a
    ADD R12,R12,#1          @ increment index i for array b
    B _sort_ascending       @ branch to next loop iteration
    
 
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
    
_printf_b:
    PUSH {LR}               @ store the return address
    LDR R0, =printf_b_str     @ R0 contains formatted string address
    BL printf               @ call printf
    POP {PC}                @ restore the stack pointer and return
   
.data

format_str:     .asciz      "%d"

.balign 4
a:              .skip       80
.balign 4
b:              .skip       80
printf_str:     .asciz      "a[%d] = %d\n"
printf_b_str:   .asciz      "b[%d] = %d\n"
exit_str:       .ascii      "Terminating program.\n"
