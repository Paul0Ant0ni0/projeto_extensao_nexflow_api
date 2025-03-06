package com.nextflow.api.models.enums;

public enum StatusDespesa {
    PENDENTE,   // Conta ainda não paga
    PAGA,       // Conta já foi paga
    VENCIDA,    // Conta com vencimento atrasado
    CANCELADA   // Conta cancelada
}
