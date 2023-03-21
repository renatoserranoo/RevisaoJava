package questao1;

public class idade {
    final int diasAno = 365;
    final int diasMes = 30;
    int anos;
    int meses;
    int dias;

    public idade(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void calcularDias(){
        dias += (anos * diasAno) + (meses * diasMes);
        System.out.println("\nA idade em dias é: "+ dias);
    }
}
