
// Question:- "https://www.spoj.com/problems/CSUMQ/""
//having complexity O(n)+O(q*(a-b+l));
import java.util.*;
public class cummulative_sum_querry_1{
    // public static void sum(int arr1[],int arr2[][]){
    //     for(int i=0;i<arr2.length;i++){
    //         int x = arr2[i][0];
    //         int y = arr2[i][1];
    //         int s=0;
    //         for(int j=x;j<=y;j++){
    //             s+= arr1[j];
    //         }
    //         System.out.println(s);
    //     }
    // }
    // public static void main(String[] args){
    //     int arr[] = {1,4,1};
    //     int arr2[][] = {{1,1},{1,2},{0,2}};
    //     sum(arr,arr2);

    public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 	int arr[] = new int[n];
	 	for(int i=0;i<n;i++){
	 		arr[i] = sc.nextInt();
	 	}
	 	int q = sc.nextInt();
	 	while(q-->0){
	 		int a = sc.nextInt();
	 		int b= sc.nextInt();
	 		int s=0;
	 		for(int j=a;j<=b;j++){
                s+= arr[j];
            }
            System.out.println(s);
            // q--;
	 	}
        // int arr2[][] = new int[q][2];
        // for(int i=0;i<n;i++){
        // 	arr2[i][0] = sc.nextInt();
        // 	arr2[i][1] = sc.nextInt();
        // }
        // sum(arr,arr2);
    }
}