import java.io.PrintWriter;
import java.util.Scanner;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {

        //  code:   PROGLANG

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            int a2 = in.nextInt();
            int b2 = in.nextInt();
            if (a > b)  {
                int temp = a; a = b; b = temp;
            }
            if (a1 > b1)  {
                int temp = a1; a1 = b1; b1 = temp;
            }
            if (a2 > b2)  {
                int temp = a2; a2 = b2; b2 = temp;
            }
            if (a == a1 && b == b1) {
                out.println(1);
            } else if (a == a2 && b == b2)  {
                out.println(2);
            } else {
                out.println(0);
            }
        }
        in.close();
        out.close();
    }
}


/*

        code ATM2

        int t = in.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] ar = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = in.nextInt();
            }
            String s = "";
            for (int j = 0; j < n; j++) {
                if (k - ar[j] >= 0) {
                    k -= ar[j];
                    s += "1";
                } else {
                    s += "0";
                }
            }
            out.println(s);
        }

 */