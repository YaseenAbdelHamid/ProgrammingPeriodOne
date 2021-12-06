package hexadecimaal;

public class Hexadecimaal {
    public static void main(String[] args) {

        char ch;
        for (int i = 0; i < 16; i++) {
            switch (i) {
                case 10:
                    ch = 'A';
                    break;
                case 11:
                    ch = 'B';
                    break;
                case 12:
                    ch = 'C';
                    break;
                case 13:
                    ch = 'D';
                    break;
                case 14:
                    ch = 'E';
                    break;
                case 15:
                    ch = 'F';
                    break;
                default:
                    ch = (char) (i + 48);
            }
            System.out.print(ch + " ");
        }
        System.out.println();

    }
}
