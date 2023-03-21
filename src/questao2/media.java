package questao2;

public class media {
    public int n1 = 7;
    public int n2 = 8;
    public int n3 = 9;
    public int n4 = 4;
    public int n5 = 5;
    public int n6 = 6;
    public double media1;
    public double media2;

    public void calcularMedia(){
        media1 = n1*n2*n3;
        System.out.println("Media 1: "+media1);
        media2 = n4*n5*n6;
        System.out.println("Media 2: "+media2);

        System.out.println("Soma das medias: " + (media1+media2) );
        System.out.println("Media das medias: " + (media1*media2) / 2);
    }
}
