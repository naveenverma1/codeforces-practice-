import java.util.*;
public class MyCdglass {

    public static void main(String args[]) {
  
Scanner sc = new Scanner(System.in);

int t = sc.nextInt();
while(t-->0){

  long n = sc.nextLong();
  if(n%2050!=0){
    System.out.println(-1);
  }else{
    n/=2050;
    long sum = 0;
    while(n!=0){
      sum+= n%10;
      n/=10;
      
  }
  System.out.println(sum);
  }

}


    }

    }