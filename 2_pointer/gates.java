import java.util.*;
//USING TWO POINTER
//https://codeforces.com/problemset/problem/1341/B
public class gates{
    public static void main(String[] str){
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int k=sc.nextInt();
                int a[] = new int[n];
                for(int i=0;i<n;i++){
                    a[i] = sc.nextInt();
                }

                //STEP 1ST
                int peaks =0;
                for(int i=1;i<k-1;i++){
                    if(a[i]>a[i-1] && a[i]>a[i+1]){
                        peaks++;
                    }
                }
                int maxpeaks = peaks;
                int ind=0;

                int l=0,r=k-1;
                while(r<n-1){
                    if(a[r]>a[r-1] && a[r]>a[r+1])
                    peaks++;
                    r++;

                    l++;
                    if(a[l]>a[l-1]&&a[l]>a[l+1])
                    peaks--;
                    if(peaks>maxpeaks){
                        maxpeaks = peaks;
                        ind=l;
                    }
                }
                System.out.println((maxpeaks+1)+" "+(ind+1));
            }
    }
}
