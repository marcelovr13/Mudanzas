import java.util.LinkedList;
import java.util.List;

public class Camion {

    private String matricula;
    private double volumenRemolque;
    private double pesoMaximo;

    List<Bulto> bultosCargados = new LinkedList<>();

    public Camion(String matricula, double volumenRemolque, double pesoTransporteMaximo) {
        this.matricula = matricula;
        this.volumenRemolque = volumenRemolque;
        this.pesoMaximo = pesoTransporteMaximo;
    }

    public void cargaBulto(Bulto bulto){
        bultosCargados.add(bulto);
    }

    public boolean cabeBulto(Bulto bulto){
        return bulto.getPeso() <= pesoDisponible();
    }

    public double pesoDisponible(){
        return pesoMaximo -  pesoCarga();
    }

    public double pesoCarga(){
        double pesoTotalCarga = 0;

        for (Bulto bulto: bultosCargados)
            pesoTotalCarga += bulto.getPeso();
            return pesoTotalCarga;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "matricula = " + matricula +
                ", volumenRemolque = " + volumenRemolque +
                ", pesoTransporteMaximo = " + pesoMaximo +
                '}' + "\n";
    }
}
