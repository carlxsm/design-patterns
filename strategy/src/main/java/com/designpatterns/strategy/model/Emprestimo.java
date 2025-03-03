package com.designpatterns.strategy.model;

import com.designpatterns.strategy.model.Enum.ModeloEmprestimo;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;


public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private double valor;
    private Cliente cliente;
    private ModeloEmprestimo modeloEmprestimo;
    private LocalDateTime inicioEmprestimo;
    private LocalDateTime vencimentoEmprestimo;

    public Emprestimo(double valor, Cliente cliente, ModeloEmprestimo modeloEmprestimo, LocalDateTime inicioEmprestimo, LocalDateTime vencimentoEmprestimo) {
        this.valor = valor;
        this.cliente = cliente;
        this.modeloEmprestimo = modeloEmprestimo;
        this.inicioEmprestimo = inicioEmprestimo;
        this.vencimentoEmprestimo = vencimentoEmprestimo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ModeloEmprestimo getModeloEmprestimo() {
        return modeloEmprestimo;
    }

    public void setModeloEmprestimo(ModeloEmprestimo modeloEmprestimo) {
        this.modeloEmprestimo = modeloEmprestimo;
    }

    public LocalDateTime getInicioEmprestimo() {
        return inicioEmprestimo;
    }

    public void setInicioEmprestimo(LocalDateTime inicioEmprestimo) {
        this.inicioEmprestimo = inicioEmprestimo;
    }

    public LocalDateTime getVencimentoEmprestimo() {
        return vencimentoEmprestimo;
    }

    public void setVencimentoEmprestimo(LocalDateTime vencimentoEmprestimo) {
        this.vencimentoEmprestimo = vencimentoEmprestimo;
    }
}



