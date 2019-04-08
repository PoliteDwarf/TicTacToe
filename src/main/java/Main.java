public class Main {
    public static void main(String[] args) {
        Tictactoe test = new Tictactoe();

        test.addSymb(Tictactoe.TicTac.O, 2, 1);
        test.addSymb(Tictactoe.TicTac.O, 3, 1);
        test.addSymb(Tictactoe.TicTac.X, 1, 1);
        test.addSymb(Tictactoe.TicTac.X, 2, 2);
        System.out.println(test.toString());
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

        test.addSymb(Tictactoe.TicTac.O, 3, 3);
        test.addSymb(Tictactoe.TicTac.O, 3, 2);
        test.addSymb(Tictactoe.TicTac.X, 1, 2);
        test.addSymb(Tictactoe.TicTac.O, 1, 3);
        test.addSymb(Tictactoe.TicTac.X, 2, 3);
        System.out.println(test.toString());
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