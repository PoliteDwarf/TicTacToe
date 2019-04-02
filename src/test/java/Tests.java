import static org.junit.Assert.assertEquals;

public class Tests {

    @org.junit.Test
    public void addSymb(){
        Tictactoe test = new Tictactoe();
        test.addSymb('O', 1, 1);
        assertEquals('O', test.getGrid()[0][0]);
        test.addSymb('X', 3, 2);
        assertEquals('X', test.getGrid()[2][1]);
        test.addSymb('O', 1, 3);
        assertEquals('O', test.getGrid()[0][2]);
    }

    @org.junit.Test
    public void delSymb(){
        Tictactoe test = new Tictactoe();
        test.addSymb('O', 1, 1);
        test.delSymb(1, 1);
        assertEquals('_', test.getGrid()[0][0]);
        test.addSymb('X', 3, 2);
        test.delSymb(3, 2);
        assertEquals('_', test.getGrid()[2][1]);
        test.addSymb('O', 1, 3);
        test.delSymb(1, 3);
        assertEquals('_', test.getGrid()[0][2]);
    }

    @org.junit.Test
    public void longSeq(){
        Tictactoe test = new Tictactoe();
        test.addSymb('O', 2, 1);
        test.addSymb('O', 3, 1);
        test.addSymb('X', 1, 1);
        test.addSymb('X', 2, 2);
        assertEquals(new int[]{0, 0, 1, 1, 2}, test.longX());
        assertEquals(new int[]{1, 0, 1, 0, 2}, test.longO());
        test.addSymb('O', 3, 3);
        test.addSymb('O', 3, 2);
        test.addSymb('X', 1, 2);
        test.addSymb('O', 1, 3);
        test.addSymb('X', 2, 3);
        assertEquals(new int[]{0, 0, 0, 1, 2}, test.longX());
        assertEquals(new int[]{2, 0, 0, 1, 3}, test.longO());
    }
}
