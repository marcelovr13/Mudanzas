public class Camion {

    private String matricula;
    private double volumenRemolque;
    private double pesoTransporteMaximo;

    public Camion(String matricula, double volumenRemolque, double pesoTransporteMaximo) {
        this.matricula = matricula;
        this.volumenRemolque = volumenRemolque;
        this.pesoTransporteMaximo = pesoTransporteMaximo;
    }



    @Override
    public String toString() {
        return "Camion{" +
                "matricula = " + matricula +
                ", volumenRemolque = " + volumenRemolque +
                ", pesoTransporteMaximo = " + pesoTransporteMaximo +
                '}' + "\n";
    }
}
