package questao4;

public class ipi {
    public double ipi;
    public int cod1;
    public double valor1;
    public int quant1;
    public int cod2;
    public double valor2;
    public int quant2;

    public ipi(double ipi, int cod1, double valor1, int quant1, int cod2, double valor2, int quant2) {
        this.ipi = ipi;
        this.cod1 = cod1;
        this.valor1 = valor1;
        this.quant1 = quant1;
        this.cod2 = cod2;
        this.valor2 = valor2;
        this.quant2 = quant2;
    }

    public void valorTotal(){
        System.out.println("Valor total: " + ((valor1*quant1 + valor2*quant2)*(ipi/100 + 1)));
    }
}
