package universityprogrammingcontest;

import java.util.Scanner;

public class FindingLCM {

    public static void main(String[] args) {
        int caseNo, a, b, L, flag = 0;
        Scanner in = new Scanner(System.in);
        caseNo = in.nextInt();
        for (int i = 1; i <= caseNo; i++) {
            a = in.nextInt();
            b = in.nextInt();
            L = in.nextInt();
            for (int j = 1; j < L; j++) {
                int result = lcmOfThree(a, b, j);
                if(result==L){
                    flag = 999;
                    System.out.println("Case "+i+": "+j);
                    break;            
                }
            }

            if (flag == 0) {
                System.out.println("case " + i + ": impossible");
            }
            flag = 0;
        }

    }
    public static int lcmOfThree(int a, int b, int c) {
        int lcmAB = lcm(a, b);
        int lcmABC = lcm(lcmAB, c);
        return lcmABC;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
