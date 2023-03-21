package questao3;

public class porcentagem {
    public double saldo;

    public porcentagem(double saldo) {
        this.saldo = saldo;
    }

    public void reajusteSaldo(){
        System.out.println("Saldo atual: "+saldo);

        System.out.println("Saldo com reajuste de 1%: "+ (saldo + saldo*0.01));
    }
}
