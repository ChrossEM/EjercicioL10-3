import javax.sound.sampled.AudioFileFormat;
import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Objects;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Rodriguez");
        Motor motorMazda = new Motor(1.0, TipoMotor.GASOLINA);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        mazda.setConductor(pato);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Gonzalez");
        Automovil susuki = new Automovil("Sussuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.GASOLINA), new Estanque(50));
        susuki.setConductor(lalo);
        susuki.setColor(Color.AMARILLO);
        susuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatentes(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = susuki;
        autos[3] = audi;
        autos[4] = nissan;

        imprimirObjetos(autos);

    }

    public static void imprimirObjetos(Automovil[] autos) {
        for (Automovil a : autos) {
            if (a != null) {

                System.out.println("\n Conductor: " + (a.getConductor() != null ? a.getConductor() : "N/A"));
                System.out.print(" " + (a.getFabricante() != null ? a.getFabricante() : "N/A"));
                System.out.print(" " + (a.getModelo() != null ? a.getModelo() : "N/A"));
                System.out.println(" " + (a.getColor() != null ? a.getColor() : "N/A"));

                if (a.getMotor() != null) {
                    System.out.print("Tipo de motor: " + Objects.toString(a.getMotor().getTipo(), "N/A"));
                    System.out.print(", Cilindraje: " + Objects.toString(a.getMotor().getCilindraje(), "N/A"));
                } else {
                    System.out.print("Tipo de motor: N/A, Cilindraje: N/A");
                }

                if (a.getEstanque() != null) {
                    System.out.print(" Capacidad de estanque: "
                            + Objects.toString(a.getEstanque().getCapacidad(), "N/A") + "\n");
                } else {
                    System.out.println(" Capacidad de estanque: N/A");
                }

            }
        }
    }
}
