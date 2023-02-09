import java.util.*;
public class Max_sum_size_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
// brute force
    //     int m = 0;
    //     for(int j=0;j<=n-k;j++){
    //         int s=0;
    //     for(int i=j;i<j+k;i++){
    //         s += arr[i];
    //     }
    //     m = Math.max(s,m);
    // }
    //     System.out.print(m);

// Optimal using prefix_sum array;
        int pre[] = new int[n];
        for(int i=0;i<n;i++){
            if(i==0)
            pre[i]=arr[i];
            else
            pre[i] += pre[i-1]+arr[i];
        }

        int ma=0;
        for(int i=0;i<=n-k;i++){
            int l=i;
            int r = i+k-1;
            if(l ==0){
               ma = Math.max(ma,pre[r]); 
            }else 
            ma = Math.max(ma,pre[r]-pre[l-1]);
        }
        System.out.print(ma);
    }
}
