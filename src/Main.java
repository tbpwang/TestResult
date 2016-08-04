import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        //杨辉三角
        int n;//共n行，范围1-10
        int[][] triangle;
        System.out.println("请输入杨辉三角形的行数：");
        while (true){
            Scanner scanner = new Scanner(System.in);
            n =  scanner.nextInt();
            if(n > 0 && n < 10){
                triangle = new int[n][];
                break;
            }else {
                System.out.println("请输入1-10的杨辉三角行数");
            }
        }

//        Integer[] column;
        for (int r = 0; r < n; r++) {
            triangle[r] = new int[r+1];
            for (int j = 0; j <= r; j++) {
                if (r == 0 || r == 1 || j == 0 || j == r) {
                    triangle[r][j] = 1;
                } else {
                    triangle[r][j] = triangle[r-1][j] + triangle[r-1][j-1];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(triangle[i]));
        }






//        int i = 0;
//        for (foo('a'); foo('b') && (i < 2); foo('c')) {
//            i++;
//            foo('d');
//        }
//        String s1 = "           ";
//        String s2 = "  ";
//        String s3 = new String(s1);
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s3==s1);
//        System.out.println(s3.equals(s1));
//
//        System.out.println(s1.trim().equals(s2.trim()));
//        System.out.println(s1.trim()==s2.trim());
    }
}
