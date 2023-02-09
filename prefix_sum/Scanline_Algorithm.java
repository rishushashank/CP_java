import java.util.*;
public class Scanline_Algorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
//otimal
        int temp[] = new int[n+1];
        Arrays.fill(temp,0);
        while(q-->0){
            int l=sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();

// //brute force 

            // for(int i=l;i<=r;i++){
            //     arr[i]+=k;
            // }

//optimal way
/* intution
 * l=2
 * r=5
 * k=6
 * 2   3   4   5   / 6
 * +6  +6  +6  +6   /-6 =0
 */
                temp[l]+=k;
                temp[r+1]-=k;

        }
        int s=0;
        for(int i=0;i<n;i++){
            s += temp[i];
            arr[i] +=s;

        }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    
}
