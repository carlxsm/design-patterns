package com.designpatterns.strategy.model.strategies;

import com.designpatterns.strategy.model.Emprestimo;

public class EmprestimoAutomotivoStrategy implements EmprestimoStrategy {
    @Override
    public double calcularTaxaJuros(Emprestimo emprestimo) {
        return 0.03;
    }
}
