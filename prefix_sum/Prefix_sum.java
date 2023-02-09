import java.util.*;
public class Prefix_sum {
   
    
    public void prefixsum_2d(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int q = sc.nextInt();
        while(q-->0){
            int i1=sc.nextInt();
            int j1=sc.nextInt();
            int i2=sc.nextInt();
            int j2=sc.nextInt();

            // brute force method
            int s = 0;
            for(int i=i1;i<=i2;i++){
                for(int j=j1;j<=j2;j++){
                    s+=arr[i][j] ;
                }
            }
            System.out.print(s);

            //optimal solution
            int pre[][] = new int[n][m]; //create prefix summ array
            pre[0][0] = arr[0][0];
            for(int i=0;i<n;i++){
                for(int j=0;i<m;j++){
                    if(i-1>=0){
                        pre[i][j]+=pre[i-1][j];
                    }
                    if(j-1>=0){
                        pre[i][j]+=pre[i][j-1];
                    }
                    if(i-1>=0 && j-1>=0){
                        pre[i][j]-=pre[i-1][j];
                    }
                }
            }
            int sum = pre[i2][j2] - pre[i1-1][j2]-pre[i2][j1-1]+pre[i1-1][j1-1];
            System.out.print(sum);

        }

    }

    
    public void prefixsum_1D(){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pri_sum[] = new int[n];// its given the sum from 0 to ith index;
        for(int i=1;i<arr.length;i++){
            pri_sum[i] = arr[i]+pri_sum[i-1];
        }
        for(int i:pri_sum)
        System.out.print(i+" ");
        // if we want a specific range sum,lets find the sum b/w index 2 to 6 then,
        // l > 0;
       
        int l=sc.nextInt();
        int r=sc.nextInt();


        //Greedy approach
        // int s=0;
        // for(int i=l;i<=r;i++){
        //     s+=arr[i];
        // }
        // System.out.println(s);


            // optimal way to get sum;
        if(l ==0){
            System.out.println();
            System.out.println(pri_sum[r]);
            return;
        }
        
        System.out.println();
        System.out.println(pri_sum[r] - pri_sum[l-1]);
    }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

    }
}
