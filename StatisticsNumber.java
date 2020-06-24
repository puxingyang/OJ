package OJ;

import java.util.Scanner;

public class StatisticsNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char temp = '0';
        int[]arr = new int[10];
        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);

            switch(temp){
                case '0' :
                    arr[0] = arr[0] + 1;
                    break;
                case '1' :
                    arr[1] = arr[1] + 1;
                    break;
                case '2' :
                    arr[2] = arr[2] + 1;
                    break;
                case '3' :
                    arr[3] = arr[3] + 1;
                    break;
                case '4' :
                    arr[4] = arr[4] + 1;
                    break;
                case '5' :
                    arr[5] = arr[5] + 1;
                    break;
                case '6' :
                    arr[6] = arr[6] + 1;
                    break;
                case '7' :
                    arr[7] = arr[7] + 1;
                    break;
                case '8' :
                    arr[8] = arr[8] + 1;
                    break;
                case '9' :
                    arr[9] = arr[9] + 1;
                    break;
            }
        }

        for(int j=0; j<arr.length; j++){
            if (arr[j] == 0){
                continue;
            }
            System.out.printf("%d:%d\n",j,arr[j]);
        }
    }
}
