package faculteit;


public class Faculteit {
    public static void main(String[] args) {
        for (int i = 0; i <=20 ; i++) {
            long res=1;
            for (int j = 1; j <=i ; j++) {
                res *= j;
            }
            System.out.println(i + "!-->" + res);
        }

        //OF
        long res = 1;

        for (int i = 1; i <=21 ; i++) {
            System.out.println(i-1+"!-->"+res);
            res *= i;
        }
    }
}
