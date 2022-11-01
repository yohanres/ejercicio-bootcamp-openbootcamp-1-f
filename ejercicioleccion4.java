// punto numero 1 //

public class ejercicioleccion4 {

    public static void main(String[] args) {
        int numeroif = -4;

        if  (numeroif > 0) {
            System.out.println("es positivo");

        } else if (numeroif < 0) {
            System.out.println("es negativo");
            
        } else {
            System.out.println("es 0");
        }
    }
}

// punto numero 2 //

public class ejercicioleccion4 {

    public static void main(String[] args) {
        int numerowhile = 0;
        while (numerowhile < 3) {
            System.out.println(numerowhile);
            numerowhile = numerowhile + 1;
        }
    }
}

// punto numero 3 //

public class ejercicioleccion4 {

    public static void main(String[] args) {
        int numerowhile = 4;
        do {
            System.out.println(numerowhile);
            numerowhile = numerowhile + 1;
        } while (numerowhile < 3);
    }
}

// punto numero 4 //

public class ejercicioleccion4 {

    public static void main(String[] args) {
        for (int numerofor = 0; numerofor <= 3; numerofor = numerofor + 1) {
            System.out.println(numerofor);
        }
    }
}

// punto numero 5 //

public class ejercicioleccion4 {

    public static void main(String[] args) {
        var estaciondelaño = "invierno";

        switch (estaciondelaño) {
            case "invierno":
                System.out.println("abrigate que hace mucho frio");
                break;
            case "verano":
                System.out.println("vamos a la playa");
                break;
            case "otoño":
                System.out.println("a recoger hojas");
                break;
            case "primavera":
                System.out.println("no se que se hace en esta temporada");
                break;
            default:
                System.out.println("Depende del pais donde vivas, no hay todas las estaciones");
        }
    }
}
