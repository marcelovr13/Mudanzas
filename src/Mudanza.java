public class Mudanza {

    private String id;
    private double distancia;
    private double conjuntoBultos;

    public Mudanza(String id, double distancia, double conjuntoBultos) {
        this.id = id;
        this.distancia = distancia;
        this.conjuntoBultos = conjuntoBultos;
    }

    @Override
    public String toString() {
        return "Mudanza{" +
                ", id = " + id +
                ", distancia = " + distancia +
                ", conjuntoBultos = " + conjuntoBultos +
                '}';
    }
}
