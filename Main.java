public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.ponerpuertas();
        miCoche.ponerpuertas();
        miCoche.quitarpuertas();

        System.out.println(miCoche.puertas);

    }
 static class Coche {
        public int puertas = 3;

        public void quitarpuertas() {
            this.puertas--;
        }

        public void ponerpuertas() {
            this.puertas++;
        }


}



}

