package com.example.testito.model;

public class Pieza {

    private String nombre;
    private double tiempoDesarmado; //horas
    private double tiempoEnderezado; //dias
    private double tiempoPasteado; //horas
    private double tiempoArmado; //dias
    private boolean presente; //por si falta

    // Constructor
    public Pieza(String nombre, double tiempoDesarmado, double tiempoEnderezado,
                 double tiempoPasteado, double tiempoArmado, boolean presente) {
        this.nombre = nombre;
        this.tiempoDesarmado = tiempoDesarmado;
        this.tiempoEnderezado = tiempoEnderezado;
        this.tiempoPasteado = tiempoPasteado;
        this.tiempoArmado = tiempoArmado;
        this.presente = presente;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getTiempoDesarmado() {
        return tiempoDesarmado;
    }

    public double getTiempoEnderezado() {
        return tiempoEnderezado;
    }

    public double getTiempoPasteado() {
        return tiempoPasteado;
    }

    public double getTiempoArmado() {
        return tiempoArmado;
    }

    public boolean isPresente() {
        return presente;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempoDesarmado(double tiempoDesarmado) {
        this.tiempoDesarmado = tiempoDesarmado;
    }

    public void setTiempoEnderezado(double tiempoEnderezado) {
        this.tiempoEnderezado = tiempoEnderezado;
    }

    public void setTiempoPasteado(double tiempoPasteado) {
        this.tiempoPasteado = tiempoPasteado;
    }

    public void setTiempoArmado(double tiempoArmado) {
        this.tiempoArmado = tiempoArmado;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }


}
