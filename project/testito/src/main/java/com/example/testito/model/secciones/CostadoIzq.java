package com.example.testito.model.secciones;

import com.example.testito.model.Pieza;

public class CostadoIzq {

    private Pieza puertaDelantera;
    private Pieza puertaTrasera;
    private Pieza faldonTrasero;
    private Pieza pilarDelantero;
    private Pieza pilarIntermedio;
    private Pieza pilarTrasero;
    private Pieza ajustes;

    public CostadoIzq() {
        this.puertaDelantera = new Pieza("Puerta delantera", 0, 0, 0, 0, true);
        this.puertaTrasera = new Pieza("Puerta trasera", 0, 0, 0, 0, true);
        this.faldonTrasero = new Pieza("Faldón trasero", 0, 0, 0, 0, true);
        this.pilarDelantero = new Pieza("Pilar delantero", 0, 0, 0, 0, true);
        this.pilarIntermedio = new Pieza("Pilar intermedio", 0, 0, 0, 0, true);
        this.pilarTrasero = new Pieza("Pilar trasero", 0, 0, 0, 0, true);
        this.ajustes = new Pieza("Ajustes", 0, 0, 0, 0, true);
    }

    public Pieza getPuertaDelantera() { return puertaDelantera; }
    public void setPuertaDelantera(Pieza puertaDelantera) { this.puertaDelantera = puertaDelantera; }

    public Pieza getPuertaTrasera() { return puertaTrasera; }
    public void setPuertaTrasera(Pieza puertaTrasera) { this.puertaTrasera = puertaTrasera; }

    public Pieza getFaldonTrasero() { return faldonTrasero; }
    public void setFaldonTrasero(Pieza faldonTrasero) { this.faldonTrasero = faldonTrasero; }

    public Pieza getPilarDelantero() { return pilarDelantero; }
    public void setPilarDelantero(Pieza pilarDelantero) { this.pilarDelantero = pilarDelantero; }

    public Pieza getPilarIntermedio() { return pilarIntermedio; }
    public void setPilarIntermedio(Pieza pilarIntermedio) { this.pilarIntermedio = pilarIntermedio; }

    public Pieza getPilarTrasero() { return pilarTrasero; }
    public void setPilarTrasero(Pieza pilarTrasero) { this.pilarTrasero = pilarTrasero; }

    public Pieza getAjustes() { return ajustes; }
    public void setAjustes(Pieza ajustes) { this.ajustes = ajustes; }

}
