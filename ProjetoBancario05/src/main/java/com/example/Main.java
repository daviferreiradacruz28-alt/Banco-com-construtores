package com.example;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Ana", 100);
        
        conta1.depositar(50);
        conta1.imprimir();
        
        conta1.sacar(200);
        conta1.imprimir();
        
        System.out.println("===================");
        
        Conta conta2 = new Conta("Pedro", 2000);
        
        conta2.depositar(300);
        conta2.imprimir();
        
        conta2.sacar(7000);
        conta2.imprimir();
    }
}