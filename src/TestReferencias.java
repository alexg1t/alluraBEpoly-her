public class TestReferencias {
    
    public static void main(String[] args) {
        
        // El elemento generico puede ser adaptabado al mas especifico
        // Funcionario funcionario=new Funcionario() => new Gerente(); 
        Funcionario funcionario=new Gerente();
        funcionario.setNombre("Alexander");
        funcionario.setSalario(2000);

        Gerente gerente = new Gerente();
        gerente.setNombre("Alexander2");
        funcionario.setSalario(5000);
        

    }
}

