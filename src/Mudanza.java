import java.util.LinkedList;
import java.util.List;

public class Mudanza {

    private String id;
    private double distancia;
    private Camion camion;

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    List<Bulto> bultos = new LinkedList<>();

    public Mudanza(String id, double distancia) {
        this.id = id;
        this.distancia = distancia;
    }

    public void incluyeBulto(Bulto bulto){
        bultos.add(bulto);
    }

    public double coste(){
        return costeBultos() + costeViajes();
    }

    public double costeBultos(){
        double coste = 0;
        for (Bulto bulto: bultos){
         if (bulto.esFragil())
             coste +=bulto.getPeso() * 4;
         else
             coste += bulto.getPeso();
        }
        return coste;
    }

    public double costeViajes(){
        return viajesNecesarios() * distancia * 2;
    }

   public int viajesNecesarios(){

        List<Bulto> copiaBultos = new LinkedList<>(bultos);
        int viajes = 0;
        while(!copiaBultos.isEmpty()){
            viajes++;
            cargaCamionAlMaximo(copiaBultos);
            copiaBultos.removeAll(camion.bultosCargados());
            camion.vaciar();
        }
        return viajes;
   }
    private void cargaCamionAlMaximo(List<Bulto> bultos){
        for (Bulto bulto:bultos)
            if (camion.cabeBulto(bulto))
                camion.cargaBulto(bulto);
    }
}