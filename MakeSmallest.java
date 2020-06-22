package OJ;

import java.util.Scanner;

public class MakeSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]num = new int[10];
        for(int i=0 ;i<10;i++){
            num[i] = sc.nextInt();
        }
        for(int i=1;i<10;i++){
            if(num[i]!=0){
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        for(int i=0 ;i<num[0] ;i++){
            System.out.print(0);
        }
        for(int i=1;i<10;i++){
            for(int j=0 ;j<num[i];j++){
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
