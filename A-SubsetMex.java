import java.util.*;
public class a{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int arr[] = new int[101];
		    for(int i=0; i<n; i++)
		        arr[sc.nextInt()]++;
		    int a=0,b=0;
		    while(arr[a]>0)
		          --arr[a++];
		    while(arr[b]>0)
		          --arr[b++];
		    System.out.println(a+b);
		}
	}
}
