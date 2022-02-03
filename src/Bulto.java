public class Bulto {

    private String identificador;
    private double volumen;
    private double peso;
    private boolean fragil;

    public double getPeso() {
        return peso;
    }



    public Bulto(String identificador, double volumen, double peso, boolean fragil) { /*Añado el constructor para añadir las caracteristicas del bulto en el main.*/
        this.identificador = identificador;
        this.volumen = volumen;
        this.peso = peso;
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Bulto{" +
                "identificador = " + identificador +
                ", volumen = " + volumen +
                ", peso = " + peso +
                ", fragil = " + fragil +
                '}' + "\n";
    }
}
