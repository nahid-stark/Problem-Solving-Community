package universityprogrammingcontest;

import java.util.Scanner;

public class veryEasy {
    public static void main(String[] args) {
        int num1, num2, caseNo, res;
        Scanner in = new Scanner(System.in);
        caseNo = in.nextInt();
        for(int i=1; i<=caseNo; i++){
            num1 = in.nextInt();
            num2 = in.nextInt();
            res = num1+num2;
            System.out.println("case "+i+": "+res);
        }
    }
}
