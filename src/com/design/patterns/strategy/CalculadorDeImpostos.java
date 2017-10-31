package com.design.patterns.strategy;

public class CalculadorDeImpostos {

    public void calcula(Orcamento orcamento, Imposto stratagyImposto){
        double valorComImposto = stratagyImposto.calcula(orcamento);
        System.out.println(valorComImposto);
    }
}
