import java.io.PrintWriter;
import java.util.Scanner;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
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
        in.close();
        out.close();
    }
}
