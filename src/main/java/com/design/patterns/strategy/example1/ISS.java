package com.design.patterns.strategy.example1;

public class ISS implements Imposto{

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
