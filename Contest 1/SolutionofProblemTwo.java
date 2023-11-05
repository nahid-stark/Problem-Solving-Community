package university_contest_1;

import java.util.Scanner;


public class University_contest_1 {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        
        int Case;
        int temp=0,num;
        int v1,flag=0;
        
        Case = sc.nextInt();
        for(int i=0;i<Case;i++){
            flag+=1;
            num = sc.nextInt();
            
            if(num==temp){
                v1=num-flag;
                System.out.println(flag+" "+v1);
                
            }
            else{
                System.out.println(0+" "+num);
                flag=0;
            }
            temp=num;
        }
        
        
    }
    
}
