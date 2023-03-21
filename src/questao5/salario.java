package questao5;

public class salario {
    public double salario;
    public final double salarioMinimo = 1320;

    public salario(double salario) {
        this.salario = salario;
    }

    public void quantSalarios(){
        System.out.println("A quantidade de salarios minimos é: "+(salario/salarioMinimo));
    }
}
