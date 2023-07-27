public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc= new CuentaCorriente(23, 2323);
        CuentaAhorros ca= new CuentaAhorros(2, 20);

        cc.depositar(2000);
        cc.transferir(1000, ca);

        System.out.println(cc.obtenerSaldo());
        System.out.println(ca.obtenerSaldo());
    }
    
}
