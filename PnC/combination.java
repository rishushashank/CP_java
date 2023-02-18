package PnC;

import java.util.Scanner;

public class combination {
    static int a[] = new int[100005];
    static int mod = 1000000007;
    public static void pre_permutation(){
        a[0] = 1;
        for(int i=1;i<a.length;i++){
            a[i] = (a[i-1]*(i%mod));
        }
    }
    public static void PnC(int n , int r){
        // NcR = N!/(R!)*(N_R)!
//brute force
        // int N=1;
        // for(int i=1;i<=n;i++){
        //     N*=i;
        // }
        // int R=1;
        // for(int i=1;i<=r;i++){
        //     R*=i;
        // }
        // int NR=1;
        // for(int i=1;i<=n-r;i++){
        //     NR*=i;
        // }
        // System.out.println(N+" "+NR+" "+R);
        // System.out.println(N/(R*NR));
// optimal by using pre_permutation array.
        System.out.println(a[n]+" "+a[n-r]+" "+a[r]);
        System.out.println(a[n]/(a[r]*a[n-r]));


    }
    combination(){
        pre_permutation();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t= sc.nextInt();
        pre_permutation();
        while(t-->0){
            int n = sc.nextInt();
        int r = sc.nextInt();
        PnC(n,r);
        }
        
    }
}
