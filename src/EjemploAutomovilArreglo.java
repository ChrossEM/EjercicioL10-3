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
        Automovil susuki = new Automovil("Susuki", "Vitara", Color.GRIS,
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

        VerDetalles.imprimirObjetos(autos);

    }

    
}
