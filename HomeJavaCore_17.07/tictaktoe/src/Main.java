import java.util.Scanner;
import java.util.Random;
public class Main {
    static char player_marker = 'X';
    static char AI_marker = 'O';
    static char empty_marker = '*';
    static  Random random = new Random();

    static char[][] map;

    static int winLim = 4;
    static int sizeX;
    static int sizeY;
    static int posX;
    static int posY;
    static int firststepAI = 0;
    static int difficult = 2;
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
                if (lineCheck(marker, i, j) == winLim) {
                    System.out.println("line win" + marker);
                    return true;
                }
                if (verticalCheck(marker, i, j) == winLim) {
                    System.out.println("вертикаль");
                    return true;
                }
                if (updiagCheck(marker, i, j) == winLim) {
                    System.out.println("diag up");
                    return true;
                }
                if (downdiagcheck(marker, i, j) == winLim) {
                    System.out.println("diag down");
                    return true;
                }
            }
        }
        return bool;
    }

    static int lineCheck(char marker, int x, int y) {
        int count = 0;
        for (int i = y, c = 0; c < winLim && y + winLim <= map.length; i++, c++) {
            if (map[x][i] == marker) {
                count++;
            }
        }
        return count;
    }

    static int verticalCheck(char marker, int x, int y) {

        int count = 0;

        for (int i = x, c = 0; c < winLim && x + winLim <= map.length; i++, c++) {

            if (map[i][y] == marker) {
                count++;
            }

        }
        return count;
    }


    static int updiagCheck(char marker, int x, int y) {
        int count = 0;
        for (int i = x, c = 0; c < winLim && i >= 0 && y < map.length; y++, i--, c++) {
            if (map[i][y] == marker) {
                count++;
            }
        }
        return count;
    }

    static int downdiagcheck(char marker, int x, int y) {
        int count = 0;
        for (int i = x, c = 0; c < winLim && i < map.length && y < map.length; y++, i++, c++) {
            if (map[i][y] == marker) {
                count++;
            }
        }
        return count;
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

    static void AI_LineStep(int x, int y) {
        int count = 0;
        for (int i = y, c = 0; c < winLim && y + winLim <= map.length; i++, c++) {
            if (map[x][i] == player_marker) {
                count++;
            }

            if (winLim - 1 == count) {
                for (int j = y, q = 0; q < winLim; j++, q++) {
                    if (map[x][j] == empty_marker) {
                        map[x][j] = AI_marker;
                        break;
                    }
                }
            }
        }
    }

    static void AI_verticalStep(int x, int y) {
        int count = 0;

        for (int i = x, c = 0; c < winLim && x + winLim <= map.length; i++, c++) {
            if (map[i][y] == player_marker) {
                count++;
            }

            if (winLim - 1 == count) {
                for (int j = x, q = 0; q < winLim; j++, q++) {
                    if (map[j][x] == empty_marker) {
                        map[j][x] = AI_marker;
                        break;
                    }
                }
            }
        }
    }

    static void AI_downDiagStep(int x, int y) {
        int count = 0;
        for (int i = x, c = 0,k = y; c < winLim && i <map.length && k < map.length; k++, i++, c++) {
            if (map[i][k] == player_marker) {
                count++;
            }


            if (winLim - 1 == count) {
                for (int j = x, q = 0,l = y; q < winLim; j++, q++,l++) {
                    if (map[j][l] == empty_marker) {
                        map[j][l] = AI_marker;
                        break;
                    }
                }
            }
        }
    }

    static void AI_upDiagStep(int x, int y) {
        int count = 0;
        for (int i = x, c = 0,k = y; c < winLim && i > 0 && k < map.length; k++, i--, c++) {
            if (map[i][k] == player_marker) {
                count++;
            }


            if (winLim - 1 == count) {
                for (int j = x, q = 0,l = y; q < winLim; j--, q++,l++) {
                    if (map[j][l] == empty_marker) {
                        map[j][l] = AI_marker;
                        break;
                    }
                }
            }
        }
    }

    static boolean AI_(){

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (lineCheck(player_marker, i, j) == winLim - 1) {
                    AI_LineStep(i, j);
                    return true;
                }
                if (verticalCheck(player_marker, i, j) == winLim - 1) {
                    AI_verticalStep(i, j);
                    return true;
                }
                if (updiagCheck(player_marker, i, j) == winLim - 1) {
                    AI_upDiagStep(i, j);
                    return true;
                }
                if (downdiagcheck(player_marker, i, j) == winLim - 1) {
                    AI_downDiagStep(i, j);
                  return true;
                }

            }
        }
        return false;
    }


    static void AI_makeMove() {

        if (firststepAI == 0) {
            posX = map.length / 2;
            posY = map[0].length / 2;
            if (!isBusy(posX, posY)) {
                map[posX][posY] = AI_marker;
                firststepAI++;
            } else {
                map[posX + 1][posY] = AI_marker;
            }
        } else if(AI_()){
            System.out.println("1");
        }else {
          boolean a = true;
          while (a){
              int q = random.nextInt(map.length);
              int w = random.nextInt(map.length);
              if(!isBusy(q,w)){
                  map[q][w] = AI_marker;
                  a = false;
              }
          }
        }

    }





    public static void main(String[] args) {
        createMap();
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            posX = a;
            posY = b;
            makeMove(player_marker, a, b);
            print_map(map);
            AI_makeMove();
            print_map(map);


//            generatePoints();

        }
    }


}
