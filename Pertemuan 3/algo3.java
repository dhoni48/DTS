import java.util.Scanner; 
public class algo3{
    public static void main(String args[]){        
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        int r=scan.nextInt();

        double v=3.14;
        double l,k;

        l=v*r*r;
        k=2*v*r;
        System.out.println("Luas Lingkaran = " + l);
        System.out.println("Keliling Lingkaran = " + k);
    }
}