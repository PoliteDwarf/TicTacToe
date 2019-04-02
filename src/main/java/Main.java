public class Main {
    public static void main(String[] args) {
        Tictactoe test = new Tictactoe();

        test.addSymb('O', 2, 1);
        test.addSymb('O', 3, 1);
        test.addSymb('X', 1, 1);
        test.addSymb('X', 2, 2);
        test.show();
        System.out.print(test.longX()[0]);
        System.out.print(test.longX()[1]);
        System.out.print(test.longX()[2]);
        System.out.print(test.longX()[3]);
        System.out.println(test.longX()[4]);
        System.out.print(test.longO()[0]);
        System.out.print(test.longO()[1]);
        System.out.print(test.longO()[2]);
        System.out.print(test.longO()[3]);
        System.out.println(test.longO()[4]);

        test.addSymb('O', 3, 3);
        test.addSymb('O', 3, 2);
        test.addSymb('X', 1, 2);
        test.addSymb('O', 1, 3);
        test.addSymb('X', 2, 3);
        test.show();
        System.out.print(test.longX()[0]);
        System.out.print(test.longX()[1]);
        System.out.print(test.longX()[2]);
        System.out.print(test.longX()[3]);
        System.out.println(test.longX()[4]);
        System.out.print(test.longO()[0]);
        System.out.print(test.longO()[1]);
        System.out.print(test.longO()[2]);
        System.out.print(test.longO()[3]);
        System.out.println(test.longO()[4]);
    }
}