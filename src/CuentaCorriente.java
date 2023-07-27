public class CuentaCorriente extends Cuenta {

    //super accede a metodos de clase padre y llama su constructor (cuenta)
    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero);
    }
    //sobreescrito de padre cuenta
    public boolean retirar(double valor){
        double comision =0.2;
        return super.retirar(valor+comision);
   }    
    
}
