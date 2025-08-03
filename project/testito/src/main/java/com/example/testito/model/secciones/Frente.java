package com.example.testito.model.secciones;

import com.example.testito.model.Pieza;

public class Frente {

    private Pieza capo;
    private Pieza guardafangoIzq;
    private Pieza guardafangoDer;
    private Pieza bumper;
    private Pieza almaDeBumper;
    private Pieza marcoDeRadiador;
    private Pieza torreIzq;
    private Pieza torreDer;
    private Pieza ajustes;

    public Frente() {
        this.capo = new Pieza("Capo", 0.0, 0.0, 0.0, 0.0, true);
        this.guardafangoIzq = new Pieza("Guardafango izq", 0.0, 0.0, 0.0, 0.0, true);
        this.guardafangoDer = new Pieza("Guardafango der", 0.0, 0.0, 0.0, 0.0, true);
        this.bumper = new Pieza("Bumper", 0.0, 0.0, 0.0, 0.0, true);
        this.almaDeBumper = new Pieza("Alma de Bumper", 0.0, 0.0, 0.0, 0.0, true);
        this.marcoDeRadiador = new Pieza("Marco de Radiador", 0.0, 0.0, 0.0, 0.0, true);
        this.torreIzq = new Pieza("Torre Izq", 0.0, 0.0, 0.0, 0.0, true);
        this.torreDer = new Pieza("Torre Der", 0.0, 0.0, 0.0, 0.0, true);
        this.ajustes = new Pieza("Ajustes", 0.0, 0.0, 0.0, 0.0, true);
    }

    public Pieza getCapo() { return capo; }
    public void setCapo(Pieza capo) { this.capo = capo; }

    public Pieza getGuardafangoIzq() { return guardafangoIzq; }
    public void setGuardafangoIzq() { this.guardafangoIzq = guardafangoIzq; }

    public Pieza getGuardafangoDer() { return guardafangoDer; }
    public void setGuardafangoDer() { this.guardafangoDer = guardafangoDer; }

    public Pieza getBumper() { return bumper; }
    public void setBumper() { this.bumper = bumper; }

    public Pieza getAlmaDeBumper() { return almaDeBumper; }
    public void setAlmaDeBumper() { this.almaDeBumper = almaDeBumper; }

    public Pieza getMarcoDeRadiador() { return marcoDeRadiador; }
    public  void setMarcoDeRadiador() { this.marcoDeRadiador = marcoDeRadiador; }

    public Pieza getTorreIzq() { return torreIzq; }
    public void setTorreIzq() { this.torreIzq = torreIzq; }

    public Pieza getTorreDer() { return torreDer; }
    public void  setTorreDer() { this.torreDer = torreDer; }

    public Pieza getAjustes() { return ajustes; }
    public void setAjustes(Pieza ajustes) {this.ajustes = ajustes;}
}
