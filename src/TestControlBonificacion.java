public class TestControlBonificacion {
    
    public static void main(String[] args) {
        
        Funcionario alex = new Funcionario();

        alex.setSalario(2000);

        Gerente alex2 = new Gerente();

        alex2.setSalario(10000);

        Contador alex3 = new Contador();
        alex3.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(alex);
        controlBonificacion.registrarSalario(alex2);
        controlBonificacion.registrarSalario(alex3);

    }
}
