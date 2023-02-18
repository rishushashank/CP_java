package BinarySearch;
import java.util.*;
public class nearest_sqrt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans = -1;
        int l=1,h=n/2;
        while(l<=h){
            int mid = (l+h)/2;
            if(mid*mid <= n){
                l = mid+1;
                ans = mid;
            }
            else{
                h = mid-1;
            }
            
        }
        System.out.print(ans);
    }
}
