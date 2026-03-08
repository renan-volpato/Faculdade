/* Crie um TAD que implemente o controle de uma conta bancaria, 
implemente funções para inicializar, deposito, sacar e imprimir o saldo. */

#include <stdio.h>

typedef struct {
    int numero;
    float saldo;
} Conta;

void inicializar(Conta *c, int numero) {
    c->numero = numero;
    c->saldo = 0.0;
    printf("conta %d inicializada.\n", c->numero);
}

void depositar(Conta *c, float valor) {
    if (valor > 0) {
        c->saldo += valor;
        printf("deposito realizado.\n");
    } else {
        printf("valor de deposito invalido.\n");
    }
}

void sacar(Conta *c, float valor) {
    if (valor > 0 && c->saldo >= valor) {
        c->saldo -= valor;
        printf("saque de R$%.2f realizado.\n", valor);
    } else {
        printf("saque invalido.\n");
    }
}

void imprimirSaldo(Conta *c) {
    printf("conta: %d\n", c->numero);
    printf("saldo atual: R$ %.2f\n", c->saldo);
}

int main() {

    Conta conta1;

    inicializar(&conta1, 1001);

    printf("\nSaldo inicial:\n");
    imprimirSaldo(&conta1);

    depositar(&conta1, 500);

    printf("\ndepois do deposito:\n");
    imprimirSaldo(&conta1);

    sacar(&conta1, 200);

    printf("\ndepois do saque:\n");
    imprimirSaldo(&conta1);

    return 0;
}
