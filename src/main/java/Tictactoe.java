import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static sun.swing.MenuItemLayoutHelper.max;

class Tictactoe {

    private char[][] Grid;
    private final ArrayList<Character> possibleSymbols = new ArrayList<Character>(Arrays.asList('X', 'O'));

    Tictactoe() {
        Grid = new char[][]{
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'},
        };
    }

    void addSymb(char a, int x, int y){
        if ((x > 0) && (x < Grid.length + 1) && (y > 0) && (y < Grid[0].length + 1) && possibleSymbols.contains(a)) Grid[x - 1][y - 1] = a;
        else System.out.println("Неверный ввод");
    }

    void delSymb(int x, int y){
        if ((x > 0) && (x < Grid.length + 1) && (y > 0) && (y < Grid[0].length + 1)) Grid[x - 1][y - 1] = '_';
        else System.out.println("Неверный ввод");
    }

    private int[] direct(int startx, int starty, int plusx, int plusy, char elem) {
        byte flag;
        int max;
        int x = startx;
        int y = starty;
        if (x + plusx == Grid.length || y + plusy == Grid[x].length || y + plusy < 0) flag = 1;
        else flag = 0;
        if (Grid[x][y] == elem) max = 1;
        else {
            max = 0;
            flag = 1;
        }
        while (flag == 0){
            if (Grid[x][y] == Grid[x + plusx][y + plusy] && Grid[x][y] == elem) max += 1;
            else flag = 1;
            x += plusx;
            y += plusy;
            if (x + plusx == Grid.length || y + plusy == Grid[x].length || y + plusy < 0) flag = 1;
        }
        return new int[]{startx, starty, plusx, plusy, max};
    }

    private int[] maxdirect(int[] r, int[] dir1,  int[] dir2,  int[] dir3,  int[] dir4) {
        int[] rez = r;
        if (rez[4] < dir1[4]) rez = dir1;
        if (rez[4] < dir2[4]) rez = dir2;
        if (rez[4] < dir3[4]) rez = dir3;
        if (rez[4] < dir4[4]) rez = dir4;
        return rez;
    }

    int[] longX(){
        int[] rez = new int[]{0, 0, 0, 0, 0};
        for (int i = 0; i < Grid.length; i++) {
            for (int j = 0; j < Grid[i].length; j++){
                rez = maxdirect(rez, direct(i, j, 0, 1, 'X'), direct(i, j, 1, 0, 'X'),
                        direct(i, j, 1, 1, 'X'), direct(i, j, 1, -1, 'X'));
            }
        }
        return rez;
    }

    int[] longO(){
        int[] rez = new int[]{0, 0, 0, 0, 0};
        for (int i = 0; i < Grid.length; i++) {
            for (int j = 0; j < Grid[i].length; j++){
                rez = maxdirect(rez, direct(i, j, 0, 1, 'O'), direct(i, j, 1, 0, 'O'),
                        direct(i, j, 1, 1, 'O'), direct(i, j, 1, -1, 'O'));
            }
        }
        return rez;
    }

    char[][] getGrid(){
        return Grid;
    }

    void show(){
        for (char[] chars : Grid) {
            for (int j = 0; j < Grid[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}