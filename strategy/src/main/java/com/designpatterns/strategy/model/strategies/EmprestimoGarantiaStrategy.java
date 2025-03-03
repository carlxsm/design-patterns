package com.designpatterns.strategy.model.strategies;

import com.designpatterns.strategy.model.Emprestimo;

public class EmprestimoGarantiaStrategy implements EmprestimoStrategy {
    @Override
    public double calcularTaxaJuros(Emprestimo emprestimo) {
        return 0.06;
    }
}
