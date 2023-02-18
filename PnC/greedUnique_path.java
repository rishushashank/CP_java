package PnC;

import java.util.Scanner;

public class greedUnique_path {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        //r = m-1 time; ans  d = n-1 time ==> total time move = m-1+n-1 = m+n-2 
        //in these total number of moves we have to choose only m-1 or n-1 path;
        int a = m+n-2;
        int b = m-1;
        
        combination c = new combination();
        c.PnC(a,b);
    }
}
