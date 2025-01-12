package com.example.semestralniprojektpma;

public class MainModel {
    public MainModel(String body, String kategorie, String nazev, String popis) {
        this.body = body;
        this.kategorie = kategorie;
        this.nazev = nazev;
        this.popis = popis;
    }

    MainModel(){

    }

    String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    String kategorie;
    String nazev;
    String popis;

}
