/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author ifernandezblanco
 */
class Consumo {
     private float km;
    private float litros;
    private float velocidadMedia;
    private float pGas;
    private float ceur;
    private float litrosmed;

    public Consumo() {
    }

    ;
    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.velocidadMedia = vMed;
        this.pGas = pGas;
    }

    public float getTempo() {
        float tem = km / velocidadMedia;
        return tem;
    }

    public float consumoMedio() {
        float cmed = litros / km * 100;
        return cmed;
    }

    public float consumoEuros() {
        float cmed = litros / km * 100;
        float eur = pGas * cmed;
        return eur;
    }

    public float velocidadMedia() {
        float velocidadMed = velocidadMedia;
        return velocidadMed;
    }

    public void setkm(float km) {
        this.km = km;
    }

    public float getKm() {
        return km;
    }

    public void setLitros(float lit) {
        this.litros = lit;
    }

    public float getLitros() {
        return litros;
    }

    public void setPrecioGasolina(float pGas) {
        this.pGas = pGas;
    }

    public float getPrecioGasolina() {
return pGas;
}
}
