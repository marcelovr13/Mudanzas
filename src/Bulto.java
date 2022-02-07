public class Bulto {

    private String identificador;
    private double volumen;
    private double peso;
    private boolean esFragil;

    public double getVolumen() {
        return volumen;
    }

    public boolean esFragil() {
        return esFragil;
    }

    public double getPeso() {
        return peso;
    }

    public Bulto(String identificador, double volumen, double peso, boolean esFragil) { /*Añado el constructor para añadir las caracteristicas del bulto en el main.*/
        this.identificador = identificador;
        this.volumen = volumen;
        this.peso = peso;
        this.esFragil = esFragil;
    }
}

