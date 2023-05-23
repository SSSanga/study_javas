public class SetAndGetVariable {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 5;
        int D = 7;
        int first = 200;
        int second = 30;
        int third = 10;
        int fourth = 50;
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        System.out.println (D);
        if (B == 3) {System.out.println (A = third);}
        else {System.out.println (C = 5);}
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        System.out.println (D);
        if (D != 9) {System.out.println (B = 5);}
        else {System.out.println (C = first);}
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        System.out.println (D);
        if (A == 10) {System.out.println (C = fourth);}
        else {System.out.println (D = second);}
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        System.out.println (D);

        // return 0;
    } 
}
