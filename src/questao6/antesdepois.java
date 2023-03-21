package questao6;

public class antesdepois {
    public int numero;

    public antesdepois(int numero) {
        this.numero = numero;
    }

    public void imprimeAntesDepois(){
        int antes = this.numero--;
        int depois = this.numero++;
        System.out.println("numero informado: "+ numero + "\nAntecessor: "+ antes);
        System.out.println("Sucessor: "+ depois);
    }
}
