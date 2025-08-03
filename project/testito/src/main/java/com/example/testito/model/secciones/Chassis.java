package com.example.testito.model.secciones;

import com.example.testito.model.Pieza;

public class Chassis {

    private Pieza piernasDelanteras;
    private Pieza bastidorDelantero;
    private Pieza bastidorIntermedio;
    private Pieza bastidorTrasero;
    private Pieza piernasTraseras;

    public Chassis() {
        this.piernasDelanteras = new Pieza("Piernas delanteras", 0, 0, 0, 0, true);
        this.bastidorDelantero = new Pieza("Bastidor delantero", 0, 0, 0, 0, true);
        this.bastidorIntermedio = new Pieza("Bastidor intermedio", 0, 0, 0, 0, true);
        this.bastidorTrasero = new Pieza("Bastidor trasero", 0, 0, 0, 0, true);
        this.piernasTraseras = new Pieza("Piernas traseras", 0, 0, 0, 0, true);
    }

    public Pieza getPiernasDelanteras() { return piernasDelanteras; }
    public void setPiernasDelanteras(Pieza piernasDelanteras) { this.piernasDelanteras = piernasDelanteras; }

    public Pieza getBastidorDelantero() { return bastidorDelantero; }
    public void setBastidorDelantero(Pieza bastidorDelantero) { this.bastidorDelantero = bastidorDelantero; }

    public Pieza getBastidorIntermedio() { return bastidorIntermedio; }
    public void setBastidorIntermedio(Pieza bastidorIntermedio) { this.bastidorIntermedio = bastidorIntermedio; }

    public Pieza getBastidorTrasero() { return bastidorTrasero; }
    public void setBastidorTrasero(Pieza bastidorTrasero) { this.bastidorTrasero = bastidorTrasero; }

    public Pieza getPiernasTraseras() { return piernasTraseras; }
    public void setPiernasTraseras(Pieza piernasTraseras) { this.piernasTraseras = piernasTraseras; }

}
