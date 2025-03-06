package com.nextflow.api.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RECEITA")
public class Receita extends Transacao {

    public Receita() {}

    public Receita(Usuario usuario, String descricao, BigDecimal valor, LocalDate data) {
        super(usuario, descricao, valor, data);
    }
}
