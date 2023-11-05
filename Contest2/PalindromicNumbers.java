package universityprogrammingcontest;

import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        int caseNo, num, result=0, temp;
        Scanner in = new Scanner(System.in);
        caseNo = in.nextInt();
        for(int i=1; i<=caseNo; i++){
            num = in.nextInt();
            temp = num;
            while(temp!=0){
                result =  result*10 + (temp%10);
                temp = temp/10;
            }
            if(num==result){
                System.out.println("Case "+i+": Yes");
            }
            else{
                System.out.println("Case "+i+": No");
            }
            result = 0;
        }
    }
}
