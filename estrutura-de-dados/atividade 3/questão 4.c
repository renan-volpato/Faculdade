/* Utilizando a alocação dinamica de memoria crie uma função para criar uma nova conta bancaria */

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int numero;
    float saldo;
} Conta;

Conta* criarConta(int numero) {

    Conta *c;

    c = (Conta*) malloc(sizeof(Conta));

    if (c == NULL) {
        printf("Erro ao alocar memoria.\n");
        return NULL;
    }

    c->numero = numero;
    c->saldo = 0.0;

    printf("Conta %d criada com sucesso.\n", numero);

    return c;
}

int main() {

    Conta *conta1;

    conta1 = criarConta(1001);

    if (conta1 != NULL) {
        printf("Conta: %d\n", conta1->numero);
        printf("Saldo: R$ %.2f\n", conta1->saldo);
    }
    
    free(conta1);

    return 0;
}
