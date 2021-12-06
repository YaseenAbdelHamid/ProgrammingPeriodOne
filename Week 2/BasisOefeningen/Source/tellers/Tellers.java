package tellers;

public class Tellers
{
    /*1 -10
      2 -9
      3 -8
      4 -7
      5 -6
      6 -5
      7 -4
      8 -3
      9 -2
      10 -1
     */
    public static void main(String[] args)
    {
        final int MAX = 10;
        int teller = 1;
        while (teller<=MAX) {
            System.out.println(teller + " - " + (MAX + 1 - teller++));
        }
    }
}
