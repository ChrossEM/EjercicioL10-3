public class Motor {
    private double cilindraje;
    private TipoMotor tipo;
    public Motor(){}

    public Motor(double cilindraje, TipoMotor tipo) {
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
