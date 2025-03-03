package com.designpatterns.strategy.Service;

import com.designpatterns.strategy.model.Cliente;
import com.designpatterns.strategy.model.Emprestimo;
import com.designpatterns.strategy.model.Enum.ModeloEmprestimo;
import com.designpatterns.strategy.model.strategies.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmprestimoService {
    public Emprestimo criarEmprestimo(int valor, Cliente cliente, ModeloEmprestimo modelo, int parcelas) {
        EmprestimoStrategy strategy = getStrategyForModelo(modelo);
        LocalDateTime vencimento = LocalDateTime.now().plusMonths(parcelas);
        return new Emprestimo(valor, cliente, modelo, LocalDateTime.now(), vencimento);
    }


    public double calcularTaxaJuros(Emprestimo emprestimo) {
        EmprestimoStrategy strategy = getStrategyForModelo(emprestimo.getModeloEmprestimo());
        return strategy.calcularTaxaJuros(emprestimo);
    }

    private EmprestimoStrategy getStrategyForModelo(ModeloEmprestimo modelo) {
        switch (modelo) {
            case EMPRESA:
                return new EmprestimoEmpresaStrategy();
            case AUTOMOTIVO:
                return new EmprestimoAutomotivoStrategy();
            case CONSIGNADO:
                return new EmprestimoConsignadoStrategy();
            case GARANTIA:
                return new EmprestimoGarantiaStrategy();
            case PESSOAL:
                return new EmprestimoPessoalStrategy();
            default:
                throw new IllegalArgumentException("Modelo de empréstimo inválido: " + modelo);
        }
    }

}
