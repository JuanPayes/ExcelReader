package com.example.testito.model.secciones;

import com.example.testito.model.Pieza;

public class ParteTrasera {
    private Pieza compuertaTapadera;
    private Pieza bumperTrasero;
    private Pieza recibidor;
    private Pieza ajustes;

    public ParteTrasera() {
        this.compuertaTapadera = new Pieza("Compuerta/tapadera", 0, 0, 0, 0, true);
        this.bumperTrasero = new Pieza("Bumper trasero", 0, 0, 0, 0, true);
        this.recibidor = new Pieza("Recibidor", 0, 0, 0, 0, true);
        this.ajustes = new Pieza("Ajustes", 0, 0, 0, 0, true);
    }

    public Pieza getCompuertaTapadera() { return compuertaTapadera; }
    public void setCompuertaTapadera(Pieza compuertaTapadera) { this.compuertaTapadera = compuertaTapadera; }

    public Pieza getBumperTrasero() { return bumperTrasero; }
    public void setBumperTrasero(Pieza bumperTrasero) { this.bumperTrasero = bumperTrasero; }

    public Pieza getRecibidor() { return recibidor; }
    public void setRecibidor(Pieza recibidor) { this.recibidor = recibidor; }

    public Pieza getAjustes() { return ajustes; }
    public void setAjustes(Pieza ajustes) { this.ajustes = ajustes; }

}
