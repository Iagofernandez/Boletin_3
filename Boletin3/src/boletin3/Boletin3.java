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
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Consumo obx = new Consumo();
        
        obx.setLitros(50f);
        obx.setPrecioGasolina(1.57f);
        float litro = obx.getLitros(), gas = obx.getPrecioGasolina();
        System.out.println("Litros= " + litro + " Preciogas= " + gas);
        
        Consumo consumo = new Consumo(50f, 8f, 50f, 1.4f);
       float consumoMed = consumo.consumoMedio();
        System.out.println("El consumo medio es " + consumoMed + "l/km");
        
        consumo.setLitros(20f);
        float litros = consumo.getLitros();
        System.out.println("Los listros consumidos es=" + litros);
       float velocidadMedia = consumo.velocidadMedia();
        System.out.println("Este es el velocidad media " + velocidadMedia + "km/h");
    }
    
}
