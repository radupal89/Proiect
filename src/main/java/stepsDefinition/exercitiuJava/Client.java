package stepsDefinition.exercitiuJava;

public class Client {

    private String numeClient;
    private String adresaClient;

    public Client(String numeClient, String adresaClient) {
        this.numeClient = numeClient;
        this.adresaClient = adresaClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getAdresaClient() {
        return adresaClient;
    }


}
