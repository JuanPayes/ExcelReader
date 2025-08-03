package com.example.testito.model.secciones;

import com.example.testito.model.Pieza;

public class Interiores {
    private Pieza estriboIzquierdo;
    private Pieza estriboDerecho;
    private Pieza pisoDelantero;
    private Pieza pisoTrasero;
    private Pieza pisoBaul;
    private Pieza cama;
    private Pieza ajustes;

    public Interiores() {
        this.estriboIzquierdo = new Pieza("Estribo izquierdo", 0, 0, 0, 0, true);
        this.estriboDerecho = new Pieza("Estribo derecho", 0, 0, 0, 0, true);
        this.pisoDelantero = new Pieza("Piso delantero", 0, 0, 0, 0, true);
        this.pisoTrasero = new Pieza("Piso trasero", 0, 0, 0, 0, true);
        this.pisoBaul = new Pieza("Piso baúl", 0, 0, 0, 0, true);
        this.cama = new Pieza("Cama", 0, 0, 0, 0, true);
        this.ajustes = new Pieza("Ajustes", 0, 0, 0, 0, true);
    }

    public Pieza getEstriboIzquierdo() { return estriboIzquierdo; }
    public void setEstriboIzquierdo(Pieza estriboIzquierdo) { this.estriboIzquierdo = estriboIzquierdo; }

    public Pieza getEstriboDerecho() { return estriboDerecho; }
    public void setEstriboDerecho(Pieza estriboDerecho) { this.estriboDerecho = estriboDerecho; }

    public Pieza getPisoDelantero() { return pisoDelantero; }
    public void setPisoDelantero(Pieza pisoDelantero) { this.pisoDelantero = pisoDelantero; }

    public Pieza getPisoTrasero() { return pisoTrasero; }
    public void setPisoTrasero(Pieza pisoTrasero) { this.pisoTrasero = pisoTrasero; }

    public Pieza getPisoBaul() { return pisoBaul; }
    public void setPisoBaul(Pieza pisoBaul) { this.pisoBaul = pisoBaul; }

    public Pieza getCama() { return cama; }
    public void setCama(Pieza cama) { this.cama = cama; }

    public Pieza getAjustes() { return ajustes; }
    public void setAjustes(Pieza ajustes) { this.ajustes = ajustes; }
}
