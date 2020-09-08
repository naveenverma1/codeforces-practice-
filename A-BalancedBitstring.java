import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        String S;
        int n, k;
        boolean isPos;
        boolean f1;
        boolean f0;
        int c0;
        int c1;
        while (test-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            S = scanner.next();
            isPos = true;
            c0 = c1 = 0;
            int a=0;
            int b=0;
            for (int i = 0; i < k; i++) {
                f1 = f0 = false;
                for(int j = i; j < n; j+=k) {
                    if (S.charAt(j) == '0') f0 = true;
                    if (S.charAt(j) == '1') f1 = true;
                   // System.out.println(f0+" "+a++ +"  "+f1+" "+b++);
                }
                if (f1 && f0) {
                    System.out.println(f1+"hh"+f0);
                    isPos = false;
                    break;
                }
                if (f1)c1++;
                if (f0)c0++;
            }
            System.out.println(isPos  && c0 <= k/2 && c1 <= k/2 ? "YES" : "NO");
        }
    }
}


