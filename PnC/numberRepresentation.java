package PnC;
//diff way to represent a number as a sum of k non-zero no.
import java.util.Scanner;

public class numberRepresentation {
    static int a[] ;
    static int mod = 1000000007;

    public static void pre_permutation(int n){
        a = new int[n];
        a[0] = 1;
        for(int i=1;i<a.length;i++){
            a[i] = (a[i-1]*(i)%mod);
        }
    }
    // ler 5 = 1, 1 1 1, 1(k==3); in 4 space we have to put 2 commas i.e. 4C2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pre_permutation(n);
        //int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(a[n-1]+" "+a[k-1]+" "+a[n-k-2]);

        int ans = a[n-1]/(a[k-1]*a[n-k-2]);
        System.out.println(ans);
        
    }
}
