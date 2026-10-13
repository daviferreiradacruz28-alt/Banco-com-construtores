package com.example;

public class Conta {
    private String titular;
    private double saldo;
    
    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        System.out.println("Conta de "+this.titular+" criada com R$"+saldo);
    }
    
    public double depositar(double valor) {
        double deposito = this.saldo += valor;
        System.out.println("Deposito de R$ "+valor+" realizado");
        
        return deposito;
    }
    
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saque de R$ "+valor+" negado: saldo insuficiente");
        } else {
            System.out.println("Saque de R$ "+valor+" realiazado.");
            double saque = this.saldo -= valor;
        }
    }
    
    public void imprimir() {
        System.out.println("Saldo de "+this.titular+" "+this.saldo);
    }
}