import java.util.Scanner;

public class Main {
    static char player_marker = 'X';
    static char AI_marker = 'O';
    static char empty_marker = '*';

    static char[][] map;

    static int winLim = 3;
    static int sizeX;
    static int sizeY;
    static int posX;
    static int posY;
    static int firststepAI = 0;
    static int difficult = 4;
    static Scanner scanner;


    public static void createMap() {

        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите размерность по Х");
            sizeX = scanner.nextInt();
            System.out.println("Введите размерность по Y");
            sizeY = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        map = new char[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                map[i][j] = empty_marker;
            }
        }
    }

    static void print_map(char[][] map) {
        System.out.print("+");
        for (int i = 0; i < map[0].length * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }

        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");

            }
            System.out.println("|");
        }
    }

    static boolean checkValidPoint(int X, int Y) {
        if (map.length > X && map[0].length > Y) {
            return false;
        } else return true;

    }

    static boolean isBusy(int X, int Y) {
        if (map[X][Y] != empty_marker) {
            return true;
        } else return false;
    }


    static boolean check(char marker) {
        boolean bool = false;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (lineCheck(marker, i, j)) {
                    System.out.println("line win");
                    return true;
                }
                if (verticalCheck(marker, i, j)) {
                    System.out.println("вертикаль");
                    return true;
                }
                if (updiagCheck(marker, i, j)) {
                    System.out.println("diag up");
                    return true;
                }
                if (downdiagcheck(marker, i, j)) {
                    System.out.println("diag down");
                    return true;
                }
            }
        }
        return bool;
    }
    static boolean lineCheck(char marker, int x, int y) {
        boolean bool = false;
        int AI_Count =0;
        int count = 0;

        for (int i = y, c = 0; c < winLim && y + winLim < map.length; i++, c++) {
            if (map[x][i] == marker) {
                count++;
            }
            if(map[x][i] == empty_marker && count >= 2 && AI_Count == 0){
                AI_makeMove(x,i);
                AI_Count++;
            }if (count == winLim) {
                return true;
            }
        }
        return bool;
    }
    static boolean verticalCheck(char marker, int x, int y) {
        boolean bool = false;
        int AI_Count =0;
        int count = 0;

        for (int i = x, c = 0; c < winLim && x + winLim < map.length; i++, c++) {
            if (map[i][y] == marker) {
                count++;
            }
            if(map[i][y] == empty_marker && count >= 2 && AI_Count == 0){
                AI_makeMove(i,y);
                AI_Count++;
            }if (count == winLim) {
                return true;
            }
        }

        return bool;
    }
    static boolean updiagCheck(char marker, int x, int y) {
        boolean bool = false;
        int AI_Count =0;
        int count = 0;

        for (int i = x, c = 0; c < winLim && i >= 0 && y < map.length; y++, i--, c++) {
            if (map[i][y] == marker) {
                count++;
            }
            if(map[i][y] == empty_marker && count >= 2 && AI_Count == 0){
                AI_makeMove(i,y);
                AI_Count++;
            }if (count == winLim) {
                return true;
            }
        }
        return bool;
    }

    static boolean downdiagcheck(char marker, int x, int y) {
        boolean bool = false;
        int AI_Count =0;
        int count = 0;
        for (int i = x, c = 0; c < winLim && i < map.length && y < map.length; y++, i++, c++) {
            if (map[i][y] == marker) {
                count++;
            }
            if(map[i][y] == empty_marker && count >= 2 && AI_Count == 0){
                AI_makeMove(i,y);
                AI_Count++;
            }if (count == winLim) {
                return true;
            }

        }

        return bool;
    }
    static void makeMove(char symbol, int X, int Y) {
        posX = X - 1;
        posY = Y - 1;
        if (checkValidPoint(posX, posY)) {
            System.out.println("Выход за пределы поля");
            return;
        }
        if (isBusy(posX, posY)) {
            System.out.println("Занято");
        } else {
            map[posX][posY] = symbol;
        }
    }
    static void AI_makeMove(int x, int y) {
        if (firststepAI == 0) {
            x = map.length / 2;
            y = map[0].length / 2;
            if (!isBusy(x, y)) {
                map[x][y] = AI_marker;
                firststepAI++;

            } else {
                map[x + 1][y] = AI_marker;
            }
        } else if(!isBusy(x,y)) {
            map[x][y] = AI_marker;
        }else {
            map[x][y] = AI_marker;
        }
    }

    /**
     * TODO доделать генератор
     *
     * @return
     */
    static int[] generatePoints() {

        int coor1;
        int coor2;
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            //    checkLineForward(i);
        }
        return new int[2];
    }
    public static void main(String[] args) {
        createMap();
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            makeMove(player_marker, a, b);
            if (check(player_marker)) {
                System.out.println("pobeda");
            }
            print_map(map);
//            generatePoints();

        }
    }


}