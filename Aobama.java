package OJ;
//输入描述:输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
//输出描述:输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，
//我们输出的行数实际上是列数的50%（四舍五入取整）。

import java.util.Scanner;

public class Aobama{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String c = sc.next();

        int count=(int) (Math.round((double)N/2)-2);
        for(int i=1;i<N;i++){
            System.out.print(c);
        }
        System.out.println(c);
        while(count>0){
            System.out.print(c);
            for(int i=2;i<N;i++){
                System.out.print(" ");
            }
            System.out.println(c);
            count--;
        }
        for(int i=1;i<=N;i++){
            System.out.print(c);
        }
    }
}
