package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int x){
        int pomocna;
        int suma=0;
        while(x!=0){
            pomocna=x%10;
            x=x/10;
            suma=suma+pomocna;
        }

        return suma;
    }

    public static void main(String[] args) {
	Scanner ulaz = new Scanner(System.in);
    System.out.println("Unesite cifru: ");
    int n=ulaz.nextInt();

    for(int i=1;i<n;i++){
        if((i%sumaCifara(i))==0){
            System.out.println("Cifre su: "+i);
        }
    }
    }
}
