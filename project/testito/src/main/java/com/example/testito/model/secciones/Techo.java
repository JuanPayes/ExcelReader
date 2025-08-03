package com.example.testito.model.secciones;

import com.example.testito.model.Pieza;

public class Techo {
    private Pieza pilarilloIzquierdo;
    private Pieza pilarilloDerecho;
    private Pieza techoFrente;
    private Pieza techoTrasero;
    private Pieza sunroofAjuste;

    public Techo() {
        this.pilarilloIzquierdo = new Pieza("Pilarillo izquierdo", 0, 0, 0, 0, true);
        this.pilarilloDerecho = new Pieza("Pilarillo derecho", 0, 0, 0, 0, true);
        this.techoFrente = new Pieza("Techo frente", 0, 0, 0, 0, true);
        this.techoTrasero = new Pieza("Techo trasero", 0, 0, 0, 0, true);
        this.sunroofAjuste = new Pieza("Sunroof Ajuste", 0, 0, 0, 0, true);
    }

    public Pieza getPilarilloIzquierdo() { return pilarilloIzquierdo; }
    public void setPilarilloIzquierdo(Pieza pilarilloIzquierdo) { this.pilarilloIzquierdo = pilarilloIzquierdo; }

    public Pieza getPilarilloDerecho() { return pilarilloDerecho; }
    public void setPilarilloDerecho(Pieza pilarilloDerecho) { this.pilarilloDerecho = pilarilloDerecho; }

    public Pieza getTechoFrente() { return techoFrente; }
    public void setTechoFrente(Pieza techoFrente) { this.techoFrente = techoFrente; }

    public Pieza getTechoTrasero() { return techoTrasero; }
    public void setTechoTrasero(Pieza techoTrasero) { this.techoTrasero = techoTrasero; }

    public Pieza getSunroofAjuste() { return sunroofAjuste; }
    public void setSunroofAjuste(Pieza sunroofAjuste) { this.sunroofAjuste = sunroofAjuste; }

}
