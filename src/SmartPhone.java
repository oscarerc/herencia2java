public class SmartPhone extends SmartDevice{
    int numero;
    public SmartPhone() {
    }

    public SmartPhone(int numero_concexiones, int voltaje, String nombre,int numero) {
        super(numero_concexiones, voltaje, nombre);
        this.numero=numero;
    }
}
