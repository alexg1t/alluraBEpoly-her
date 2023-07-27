public class Funcionario {
     private String nombre;
     private int documento;
     private double salario;
     private int tipo;

     public Funcionario(){

     }

     public String getNombre() {
         return nombre;
     }
     public int getDocumento() {
         return documento;
     }
     public double getSalario() {
         return salario;
     }
     public int getTipo() {
         return tipo;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public void setDocumento(int documento) {
         this.documento = documento;
     }
     
     public void setSalario(double salario) {
         this.salario = salario;
     }

     public void setTipo(int tipo) {
         this.tipo = tipo;
     }

     public double getBonificacion(){
       
            return this.salario*0.05;

     }
     
}
