package stepsDefinition.exercitiuJava;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Client client1  = new Client("andreea",
                "bucuresti");
        //System.out.println(client1.getNumeClient());
        //client1.setNumeClient("alina");
        //System.out.println(client1.getNumeClient());

        ContBancar contAndreea = new ContBancar("Andreea",
                "Bucuresti","economii",
                6969,500);
        //contAndreea.alimentareContBancar(-100);
        //contAndreea.retragereSuma(100);
        //contAndreea.exchangeEuro("Euro");
        Date dataFactura = new Date("2023-03-01");
        Factura facturaElectricitate = new Factura(client1,3456,
                new Date(2023-03-01),800);
        contAndreea.plataFactura(facturaElectricitate.getTotalFactura());

    }
}
