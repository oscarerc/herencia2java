public class Main {
    public static void main(String[] args) {
    SmartDevice device = new SmartDevice(1,22,"device1");
    SmartPhone phone = new SmartPhone(1,10,"nokia",312435445);
    SmartWatch watch= new SmartWatch(2,5,"applewatch",55);

    watch.mostrar();
    }
}