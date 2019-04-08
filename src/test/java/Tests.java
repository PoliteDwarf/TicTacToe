import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests {

    @org.junit.Test
    public void addSymb(){
        Tictactoe test = new Tictactoe();
        test.addSymb(Tictactoe.TicTac.O, 1, 1);
        assertEquals(Tictactoe.TicTac.O, test.getElem(1, 1));
        test.addSymb(Tictactoe.TicTac.X, 3, 2);
        assertEquals(Tictactoe.TicTac.X, test.getElem(3, 2));
        test.addSymb(Tictactoe.TicTac.O, 1, 3);
        assertEquals(Tictactoe.TicTac.O, test.getElem(1, 3));
    }

    @org.junit.Test
    public void delSymb(){
        Tictactoe test = new Tictactoe();
        test.addSymb(Tictactoe.TicTac.O, 1, 1);
        test.delSymb(1, 1);
        assertEquals(Tictactoe.TicTac.EMPTY, test.getElem(1, 1));
        test.addSymb(Tictactoe.TicTac.X, 3, 2);
        test.delSymb(3, 2);
        assertEquals(Tictactoe.TicTac.EMPTY, test.getElem(3, 2));
        test.addSymb(Tictactoe.TicTac.O, 1, 3);
        test.delSymb(1, 3);
        assertEquals(Tictactoe.TicTac.EMPTY, test.getElem(1, 3));
    }

    @org.junit.Test
    public void longSeq(){
        Tictactoe test = new Tictactoe();
        test.addSymb(Tictactoe.TicTac.O, 2, 1);
        test.addSymb(Tictactoe.TicTac.O, 3, 1);
        test.addSymb(Tictactoe.TicTac.X, 1, 1);
        test.addSymb(Tictactoe.TicTac.X, 2, 2);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2}, test.longX());
        assertArrayEquals(new int[]{1, 0, 1, 0, 2}, test.longO());
        test.addSymb(Tictactoe.TicTac.O, 3, 3);
        test.addSymb(Tictactoe.TicTac.O, 3, 2);
        test.addSymb(Tictactoe.TicTac.X, 1, 2);
        test.addSymb(Tictactoe.TicTac.O, 1, 3);
        test.addSymb(Tictactoe.TicTac.X, 2, 3);
        assertArrayEquals(new int[]{0, 0, 0, 1, 2}, test.longX());
        assertArrayEquals(new int[]{2, 0, 0, 1, 3}, test.longO());
    }
}
