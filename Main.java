// Punto # 1 //   
public static void main(String[] args) {
        int resultado;
        resultado = suma( 7, 4, 22);

        System.out.println(resultado);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

// Punto # 2 //

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

