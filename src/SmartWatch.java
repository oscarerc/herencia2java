public class SmartWatch  extends SmartDevice{
    int resolucion;
    public SmartWatch() {
    }

    public SmartWatch(int numero_concexiones, int voltaje, String nombre,int resolucion) {
        super(numero_concexiones, voltaje, nombre);
        this.resolucion= resolucion;
    }

    public void mostrar(){
        System.out.println("los datos son los siguientes  nombre: "+this.nombre+" numero: "+this.numero_concexiones
        +" voltaje: "+this.voltaje+ " resolcuion: "+ this.resolucion);
    }
}
