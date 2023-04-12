package stepsDefinition.exercitiuJava;

public class ContBancar extends Client {

    private String numeContBancarAlias;
    private int numarContBancar;
    private double valuareCont;

    public ContBancar(String numeClient, String adresaClient,
                      String numeContBancarAlias,
                      int numarContBancar, double valuareCont) {
        super(numeClient, adresaClient);
        this.numeContBancarAlias = numeContBancarAlias;
        this.numarContBancar = numarContBancar;
        this.valuareCont = valuareCont;


    }

    public String getNumeContBancarAlias() {
        return numeContBancarAlias;
    }

    public int getNumarContBancar() {
        return numarContBancar;
    }

    public double getValuareCont() {
        return valuareCont;
    }

    public void setNumeContBancarAlias(String numeContBancarAlias) {
        this.numeContBancarAlias = numeContBancarAlias;
    }

    public void setNumarContBancar(int numarContBancar) {
        this.numarContBancar = numarContBancar;
    }

    public void setValuareCont(double valuareCont) {
        this.valuareCont = valuareCont;
    }

    public void alimentareContBancar(double sumaDeBani) {
        if (sumaDeBani > 0) {
            valuareCont = valuareCont + sumaDeBani;
        } else System.out.println("Contul nu a putut fi alimentat.Suma adaugata este invalida");

        System.out.println("Contul a fost alimentat cu" + sumaDeBani +
                " iar contul are valoare" + valuareCont);

    }

    public void retragereSuma(int sumaDeBani) {
        if (sumaDeBani > 0) {
            if (valuareCont - sumaDeBani > 0) {
                valuareCont = valuareCont - sumaDeBani;
                System.out.println("Contului i-au fost retrasi" + sumaDeBani +
                        " iar contul are valoare" + valuareCont);
            } else System.out.println("Fonduri insuficiente!Contul tau are valoare" + valuareCont);

        }

    }

    public void exchangeEuro(String moneda) {
        switch (moneda) {
            case "Euro" -> {
                setValuareCont(getValuareCont() / 5);
                System.out.println("valoarea contului in Euro este:" + getValuareCont());
            }
            case "Lira" -> {
                setValuareCont(getValuareCont() / 5.6);
                System.out.println("valoarea contului in Lira este:" + getValuareCont());
            }
            default -> System.out.println("valoare contului in Ron este:" + getValuareCont());

        }
    }

    public void plataFactura(double sumaDeBani) {
        if (sumaDeBani > 0) {
            if (valuareCont - sumaDeBani > 0) {
                valuareCont = valuareCont - sumaDeBani;
                System.out.println("Factura de" + sumaDeBani + "lei a fost platita! Contul are valoarea"
                        + valuareCont);
            } else System.out.println("Fonduri insuficiente!Contul tau are valoare" + valuareCont);

        }


    }
}


