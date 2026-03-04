## 1- Qual o valor de y no final do programa? 

#include <stdio.h>  
main() {  
int y, *p, x;  
y = 0;  
p = &y;  
x = *p;  
x = 4;  
++(*p);  
x–;  
(*p) += x++;  
printf (“y = %d\n”, y);  
}

RESPOSTA: valor final de y será 4


## 2-Teste e explique a diferença, caso exista, entre
a) p++; (*p)++; *(++p);

RESPOSTA: 

b) O que quer dizer *(p+10)?

RESPOSTA:

## 3-Quais serão os valores de x, y e p ao final do trecho de código abaixo?
int x, y, *p;y = 0;  
p = &y;  
x = *p;  
x = 4;  
(*p)++;  
–x;  
(*p) += x;  

RESPOSTA:  

## 4-Os programas (trechos de código) abaixo possuem erros. Qual(is)? Como deveriam ser?
a)
void main() {  
int x, *p;  
x = 100;  
p = x;  
printf(“Valor de p: %d.\n”, *p);}  

RESPOSTA: 

b)
void troca (int *i, int *j) {  
int *temp;  
*temp = *i;  
*i = *j;  
*j = *temp;}  
 
RESPOSTA

c)
char *a, *b;  
a = “abacate”;  
b = “uva”;  
if (a < b)  
printf (“%s vem antes de %s no dicionário”, a, b);  
else  
printf (“%s vem depois de %s no dicionário”, a, b);  

RESPOSTA

## 5- Escreva uma função chamada troca que troca os valores dos parâmetros recebidos. Sua assinatura deve ser: void troca(float *a, float *b);

