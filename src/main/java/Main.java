public class Main {
    public static void main(String[] args) {
        new Tictactoe();

        Tictactoe.addSymb('O', 2, 1);
        Tictactoe.addSymb('O', 3, 1);
        Tictactoe.addSymb('X', 1, 1);
        Tictactoe.addSymb('X', 2, 2);
        Tictactoe.show();

        Tictactoe.addSymb('O', 3, 3);
        Tictactoe.addSymb('O', 3, 2);
        Tictactoe.addSymb('X', 1, 2);
        Tictactoe.addSymb('O', 1, 3);
        Tictactoe.addSymb('X', 2, 3);
        Tictactoe.show();
    }
}