import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int r;
        double alan,cevre,pi=3.14,merkezAci;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Yarıçapı giriniz");
        r=input.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz");
        merkezAci=input.nextDouble();

        alan=r*r*pi;
        cevre=2*r*pi;
        merkezAci=(pi * (r*r) * merkezAci) / 360;

        System.out.println("Dairenin alanı="+alan);
        System.out.println("Dairenin çevresi="+cevre);
        System.out.println("Daire diliminin alanı="+merkezAci);
    }
}
