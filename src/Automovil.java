
public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;
    private TipoAutomovil tipo;
    private static Color colorPatentes = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA =120;
    public static int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color,Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color,Motor motor,Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }
    public Automovil(String fabricante, String modelo, Color color,Motor motor,Estanque estanque, Persona conductor) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void setIndiceRuedas(int indiceRuedas) {
        this.indiceRuedas = indiceRuedas;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static void setColorPatentes(Color colorPatentes) {
        Automovil.colorPatentes = colorPatentes;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    public static void setVelocidadMaxCiudad(int velocidadMaxCiudad) {
        VELOCIDAD_MAX_CIUDAD = velocidadMaxCiudad;
    }

    public int getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }


    public Color getColor() {
        return color;
    }

    public Motor getMotor() {
        return motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public int getIndiceRuedas() {
        return indiceRuedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public static Color getColorPatentes() {
        return colorPatentes;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static int getVelocidadMaxCiudad() {
        return VELOCIDAD_MAX_CIUDAD;
    }
    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle() {
        String detalle = "auto.id:" + this.id +
                "\nauto.fabricante:" + this.getFabricante() +
                "\nauto.modelo:" + this.getModelo();
        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + colorPatentes;
        }
        if (this.motor != null) {
            detalle += "\nauto.cilindrado = " + this.motor.getCilindraje();
        }
        if (this.conductor != null) {
            detalle += "\nConductor Subaru: " + this.getConductor();
            ;
        }
        if(getRuedas()!= null){
            detalle += "\nRuedas del automovil:";
            for (Rueda r : this.getRuedas()){
                detalle+= "\n" + r.getFabricante()+ ", aro: "+r.getAro()+"ancho: "+r.getAncho();
            }
        }


        return detalle;
    }

    public String acelerar(int rpm){
        return "el auto" + this.fabricante + "acelerado a " + rpm +"rmp";
    }



    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenado ";
    }

    public  String AcelerarFrenar (int rpm){
        String acelerar = this. acelerar(rpm);
        String frenar= this.frenar();
        return acelerar + "\n" +frenar;
    }

    public float calcularConsumo (int km , float porcentajeBencina){
        return km/ (this.getEstanque()).getCapacidad() * (porcentajeBencina);
    }
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/ (this.getEstanque()).getCapacidad() * (porcentajeBencina / 100f);
    }

    public static float calcularConsumoEstatico (int km, int porcentajeBencina){
        return km / (Automovil.capacidadEstanqueEstatico *(porcentajeBencina / 100));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
        && this.fabricante.equals(a.getFabricante()))
                && this.modelo.equals(a.getModelo());
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    

    @Override
    public int compareTo(Automovil o) {
        return this.fabricante.compareTo(o.fabricante);
    }
}
