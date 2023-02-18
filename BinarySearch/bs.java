package BinarySearch;
import java.util.*;

// Binary search obly possible in sorted array.
public class bs {
    public static void main(String[] aegs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int x = sc.nextInt();

        int l=0,h=n-1;
        int flag=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==x){
                flag = mid;
                break;
            }
            else if(a[mid]>x){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println(flag);
    }
    
}
