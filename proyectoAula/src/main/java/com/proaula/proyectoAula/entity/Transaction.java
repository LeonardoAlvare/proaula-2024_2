package com.proaula.proyectoAula.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaccionId;
    private double monto;
    private String metodoPago;
    private LocalDate fecha;

    @OneToOne
    private Contract contract;

    // CONSTRUCTORS
    public Transaction() {
    }

    public Transaction(Long transaccionId, double monto, String metodoPago, LocalDate fecha, Contract contract) {
        this.transaccionId = transaccionId;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.contract = contract;
    }

    // GETTERS AND SETTERS
    public Long getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(Long transaccionId) {
        this.transaccionId = transaccionId;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
