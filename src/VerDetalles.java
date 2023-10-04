public class VerDetalles {
    public static void imprimirObjetos(Automovil[] autos) {
        for (Automovil a : autos) {
            if (a != null) {

                System.out.println("\n Conductor: " + (a.getConductor() != null ? a.getConductor() : "N/A"));
                System.out.print(" " + (a.getFabricante() != null ? a.getFabricante() : "N/A"));
                System.out.print(" " + (a.getModelo() != null ? a.getModelo() : "N/A"));
                System.out.println(" " + (a.getColor() != null ? a.getColor() : "N/A"));

                if (a.getMotor() != null) {
                    System.out.print("Tipo de motor: " + (a.getMotor().getTipo() != null ? a.getMotor().getTipo() : "N/A"));
                    System.out.print(", Cilindraje: " + (a.getMotor().getCilindraje() != 0.0d ? a.getMotor().getCilindraje() : "N/A"));
                } else {
                    System.out.print("Tipo de motor: N/A, Cilindraje: N/A");
                }

                if (a.getEstanque() != null) {
                    System.out.print(" Capacidad de estanque: " + (a.getEstanque().getCapacidad() != 0 ? a.getEstanque().getCapacidad() : "N/A") + "\n");
                } else {
                    System.out.println(" Capacidad de estanque: N/A");
                }

            }
        }
    }
}
