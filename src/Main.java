public class Main {

    public static void main(String[] args) {

        Bulto sofa = new Bulto("sofa", 20, 50, false );
        Bulto sillas = new Bulto("sillas", 10, 15, false );
        Bulto jarron = new Bulto("jarron", 5, 10, true );
        Bulto mesa = new Bulto("mesa", 25, 50, false );

        Camion camion = new Camion("1234ABC", 50, 100);
        if (camion.cabeBulto(sofa))
            camion.cargaBulto(sofa);
        if (camion.cabeBulto(sillas))
            camion.cargaBulto(sillas);
        if (camion.cabeBulto(jarron))
            camion.cargaBulto(jarron);
        if (camion.cabeBulto(mesa))
            camion.cargaBulto(mesa);





    }
}
