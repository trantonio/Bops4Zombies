package com.ounce.bops4zombies.maps;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private String nombreMapa;
    private String escudo;
    private String armaEspecial;
    private String paso1;
    private String paso2;
    private String paso3;
    private String paso4;
    private String paso5;
    private String paso6;
    private String paso7;
    private String paso8;
    private String paso9;
    private String paso10;
    private static List<Mapa> mapas;

    public Mapa(String nombreMapa, String escudo, String armaEspecial, ArrayList<String> argumentos) {
        this.nombreMapa = nombreMapa;
        this.escudo = escudo;
        this.armaEspecial = armaEspecial;
        for (int i = 0; i < argumentos.size() ; i++) {
            this.paso1 = argumentos.get(i);
        }
        mapas.add(this);
    }


    public String getNombreMapa() {
        return nombreMapa;
    }

    public void setNombreMapa(String nombreMapa) {
        this.nombreMapa = nombreMapa;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getArmaEspecial() {
        return armaEspecial;
    }

    public void setArmaEspecial(String armaEspecial) {
        this.armaEspecial = armaEspecial;
    }

    public String getPaso1() {
        return paso1;
    }

    public void setPaso1(String paso1) {
        this.paso1 = paso1;
    }

    public String getPaso2() {
        return paso2;
    }

    public void setPaso2(String paso2) {
        this.paso2 = paso2;
    }

    public String getPaso3() {
        return paso3;
    }

    public void setPaso3(String paso3) {
        this.paso3 = paso3;
    }

    public String getPaso4() {
        return paso4;
    }

    public void setPaso4(String paso4) {
        this.paso4 = paso4;
    }

    public String getPaso5() {
        return paso5;
    }

    public void setPaso5(String paso5) {
        this.paso5 = paso5;
    }

    public String getPaso6() {
        return paso6;
    }

    public void setPaso6(String paso6) {
        this.paso6 = paso6;
    }

    public String getPaso7() {
        return paso7;
    }

    public void setPaso7(String paso7) {
        this.paso7 = paso7;
    }

    public String getPaso8() {
        return paso8;
    }

    public void setPaso8(String paso8) {
        this.paso8 = paso8;
    }

    public String getPaso9() {
        return paso9;
    }

    public void setPaso9(String paso9) {
        this.paso9 = paso9;
    }

    public String getPaso10() {
        return paso10;
    }

    public void setPaso10(String paso10) {
        this.paso10 = paso10;
    }
}
