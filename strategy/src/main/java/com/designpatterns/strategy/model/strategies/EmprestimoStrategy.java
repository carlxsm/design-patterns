package com.designpatterns.strategy.model.strategies;

import com.designpatterns.strategy.model.Emprestimo;

public interface EmprestimoStrategy {
    double calcularTaxaJuros(Emprestimo emprestimo);
}
