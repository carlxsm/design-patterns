package com.designpatterns.strategy.model.strategies;

import com.designpatterns.strategy.model.Emprestimo;

public class EmprestimoPessoalStrategy implements EmprestimoStrategy {

    @Override
    public double calcularTaxaJuros(Emprestimo emprestimo) {
        return 0.07;
    }
}
