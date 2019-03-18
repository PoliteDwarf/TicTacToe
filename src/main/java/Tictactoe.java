import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static sun.swing.MenuItemLayoutHelper.max;

public class Tictactoe {

    static private char[][] Grid;
    static private final ArrayList<Character> possibleSymbols = new ArrayList<Character>(Arrays.asList('X', 'O'));

    Tictactoe() {
        Grid = new char[][]{
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'},
        };
    }

    static void addSymb(char a, int x, int y){
        if ((x > 0) && (x < 4) && (y > 0) && (y < 4) && possibleSymbols.contains(a)) Grid[x - 1][y - 1] = a;
        else System.out.println("Неверный ввод");
    }

    public static void delSymb(int x, int y){
        if ((x > 0) && (x < 4) && (y > 0) && (y < 4)) Grid[x - 1][y - 1] = '_';
    }

    static int lngstSeq(){
        int rez = 0;
        int temprez = 0;
        for (int i = 0; i < Grid.length; i++) {
            for (int j = 0; j < Grid[i].length; j++){
                if (possibleSymbols.contains(Grid[i][j]) && temprez == 0) temprez = 1;
                if (j < (Grid[i].length - 1) && Grid[i][j] == Grid[i][j+1] && possibleSymbols.contains(Grid[i][j])) temprez++;
                else {
                    rez = max(temprez, rez);
                    temprez = 0;
                }
            }
        }
        for (int j = 0; j < Grid[0].length; j++) {
            for (int i = 0; i < Grid.length; i++){
                if (possibleSymbols.contains(Grid[i][j]) && temprez == 0) temprez = 1;
                if (i < (Grid.length - 1) && Grid[i][j] == Grid[i+1][j] && possibleSymbols.contains(Grid[i][j])) temprez++;
                else {
                    rez = max(temprez, rez);
                    temprez = 0;
                }
            }
        }
        return rez;
    }

    static void show(){
        for (int i = 0; i < Grid.length; i++) {
            for (int j = 0; j < Grid[0].length; j++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}