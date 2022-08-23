public class Main {
    public static void main(String[] args) {
        //instanciar la clase o crear objeto

        Cuenta miCuenta = new Cuenta("1234567","Ahorro",150000);
        System.out.println("Saldo minimo: "+ miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("Saldo actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("Saldo actual: "+miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        miCuenta.setNumero("22222");
        System.out.println(miCuenta.toString());
        System.out.println("---------------------------------------------------------");

        Cuenta alexCuenta= new Cuenta("1028036","Prestamo",50000);
        System.out.println(alexCuenta.toString());
    }

}
