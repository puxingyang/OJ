package OJ;

//题目描述：
//一个DNA序列由A/C/G/T四个字母的排列组合组成。G和C的比例（定义为GC-Ratio)是序列中G和C两个字母
// 的总的出现次数除以总的字母数目（也就是序列长度）。在基因工程中，这个比例非常重要。因为高的
// GC-Ratio可能是基因的起始点。给定一个很长的DNA序列，以及要求的最小子序列长度，研究人员经常
// 会需要在其中找出GC-Ratio最高的子序列。
//输入描述：
//输入一个string型基因序列，和int型子串的长度。
//输出描述：
//找出GC比例最高的子串，如果有多个，输出第一个的子串。

import java.util.Scanner;

public class FindDNA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = sc.nextInt();
        int sz = str.length();//字符串总长度
        int[] count = new int[sz - len];
        int max = 0;
        for (int i = 0; i < sz - len; i++) {
            String substr = str.substring(i, i + len);
            for (int j = 0; j < len; j++) {
                if (substr.charAt(j) == 'C' || substr.charAt(j) == 'G') {
                    count[i]++;
                }
            }
            if (count[max] < count[i]) {
                max = i;
            }
        }
        String res = str.substring(max, max + len);
        System.out.println(res);
    }
}
