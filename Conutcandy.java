package OJ;

import java.util.Scanner;

public class Conutcandy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = 0,y2 = 0,y3 = 0,y4 = 0;
        float a,b,c;
        while(scanner.hasNextInt()) {
            y1 = scanner.nextInt();
            y2 = scanner.nextInt();
            y3 = scanner.nextInt();
            y4 = scanner.nextInt();
        }
            a = (y1 + y3)/2f;
            b = (y2 + y4)/2f;
            c = (y4 - y2)/2f;
            if((a - (y1 + y3)/2) != 0){
                System.out.println("Error");
                return;
            }
            if(b != (y2 + y4)/2 || b != (y3 - y1)/2){
                System.out.println("Error");
                return;
            }
            if((c - (y4 - y2)/2) != 0) {
                System.out.println("Error");
                return;
            }
            System.out.print((int)a + " " + (int)b +" "+ (int)c +" ");
    }
}
