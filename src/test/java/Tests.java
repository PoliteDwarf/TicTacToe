import static org.junit.Assert.assertEquals;

public class Tests {

    @org.junit.Test
    public void addSymb(){
        new Tictactoe();
        Tictactoe.addSymb('O', 1, 1);
        assertEquals('O', Tictactoe.getGrid()[0][0]);
        Tictactoe.addSymb('X', 3, 2);
        assertEquals('X', Tictactoe.getGrid()[2][1]);
        Tictactoe.addSymb('O', 1, 3);
        assertEquals('O', Tictactoe.getGrid()[0][2]);
    }

    @org.junit.Test
    public void delSymb(){
        new Tictactoe();
        Tictactoe.addSymb('O', 1, 1);
        Tictactoe.delSymb(1, 1);
        assertEquals('_', Tictactoe.getGrid()[0][0]);
        Tictactoe.addSymb('X', 3, 2);
        Tictactoe.delSymb(3, 2);
        assertEquals('_', Tictactoe.getGrid()[2][1]);
        Tictactoe.addSymb('O', 1, 3);
        Tictactoe.delSymb(1, 3);
        assertEquals('_', Tictactoe.getGrid()[0][2]);
    }

    @org.junit.Test
    public void longSeq(){
        new Tictactoe();
        Tictactoe.addSymb('O', 2, 1);
        Tictactoe.addSymb('O', 3, 1);
        Tictactoe.addSymb('X', 1, 1);
        Tictactoe.addSymb('X', 2, 2);
        assertEquals(2, Tictactoe.longX());
        assertEquals(2, Tictactoe.longO());
        Tictactoe.addSymb('O', 3, 3);
        Tictactoe.addSymb('O', 3, 2);
        Tictactoe.addSymb('X', 1, 2);
        Tictactoe.addSymb('O', 1, 3);
        Tictactoe.addSymb('X', 2, 3);
        assertEquals(2, Tictactoe.longX());
        assertEquals(3, Tictactoe.longO());
    }
}
