package com.design.patterns.strategy;

public class ICMS implements Imposto{

    public double calcula(Orcamento orcamento) {
        return (orcamento.getValor() * 0.05) + 50;
    }
}
