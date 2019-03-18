public class Main {
    public static void main(String[] args) {
        new Tictactoe();
        Tictactoe.show();
        Tictactoe.addSymb('O', 1, 1);
        Tictactoe.addSymb('O', 2, 1);
        Tictactoe.addSymb('O', 3, 1);
        Tictactoe.addSymb('O', 2, 2);
        Tictactoe.addSymb('O', 1, 2);
        Tictactoe.addSymb('O', 1, 3);
        Tictactoe.show();
        System.out.println(Tictactoe.lngstSeq());
    }
}
