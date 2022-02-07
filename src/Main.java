public class Main {

    public static void main(String[] args) {

        Bulto sofa = new Bulto("sofa", 20, 50, false );
        Bulto sillas = new Bulto("sillas", 10, 15, false );
        Bulto jarron = new Bulto("jarron", 5, 10, true );
        Bulto mesa = new Bulto("mesa", 25, 50, false );

        Camion camion = new Camion("1234ABC", 50, 100);

        camion.cargaBulto(sofa);
        camion.cargaBulto(sillas);
        camion.cargaBulto(jarron);
        camion.cargaBulto(mesa);





    }
}
