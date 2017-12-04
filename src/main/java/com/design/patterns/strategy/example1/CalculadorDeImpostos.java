package com.design.patterns.strategy.example1;

public class CalculadorDeImpostos {

    public void calcula(Orcamento orcamento, Imposto stratagyImposto){
        double valorComImposto = stratagyImposto.calcula(orcamento);
        System.out.println(valorComImposto);
    }
}
