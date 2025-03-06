package com.nextflow.api.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.nextflow.api.models.enums.FormaPagamento;
import com.nextflow.api.models.enums.StatusDespesa;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("DESPESA")
public class Despesa extends Transacao {

    @Column(nullable = false)
    private LocalDate dataVencimento;

    @Column
    private LocalDate dataPagamento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusDespesa status = StatusDespesa.PENDENTE;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FormaPagamento formaPagamento;

    public Despesa() {}

    public Despesa(Usuario usuario, String descricao, BigDecimal valor, LocalDate dataEntrada, 
                   LocalDate dataVencimento, StatusDespesa status, FormaPagamento formaPagamento) {
        super(usuario, descricao, valor, dataEntrada);
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.formaPagamento = formaPagamento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public StatusDespesa getStatus() {
        return status;
    }

    public void setStatus(StatusDespesa status) {
        this.status = status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
