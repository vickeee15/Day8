import java.util.Scanner;

public class abcd {

        static int x1, y1, a1, b1, x2, y2, a2, b2;

        public void line() {
            double Length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double Length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
            String L1 = String.valueOf(Length1);
            String L2 = String.valueOf(Length2);
            System.out.println(L1.compareTo(L2));
            if (Length1==Length2)
                System.out.println("Equal lengths");
             else if (Length1 > Length2)
                System.out.println("L2 is greater than L1");
             else
                System.out.println("L1 is greater than L2");}


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                abcd check = new abcd();
                System.out.println("Line comparison");
                System.out.println(" First coordinates (x1, y1) : ");
                x1 = sc.nextInt();
                y1 = sc.nextInt();
                System.out.println("second coordinates (x2, y2) : ");
                x2 = sc.nextInt();
                y2 = sc.nextInt();
                System.out.println(" Third coordinates (x3, y3) : ");
                a1 = sc.nextInt();
                a2 = sc.nextInt();
                System.out.println("second coordinates (x4, y4) : ");
                b1 = sc.nextInt();
                b2 = sc.nextInt();
                check.line();
            }
        }