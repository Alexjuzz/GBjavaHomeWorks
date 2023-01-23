package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  Exception {
//        primeNum(1000);
        calcTest();
    }

    static int tringleN(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    static int fact(int num) {
        if (num == 1) return 1;
        return num * fact(num - 1);
    }

    static void primeNum(int value) {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count += 1;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.println(i);
            }
        }
    }

    static int calc(int firstNum, int seconNum, char sign) {

        switch (sign) {
            case '+':
                return firstNum + seconNum;

            case '-':
                return firstNum + seconNum;

            case '*':
                return firstNum * seconNum;

            case '/':
                return firstNum / seconNum;

            default:

                System.out.println("Не корретрное значение");

        }


        return 0;

    }

    static void calcTest() throws IOException {
        try {
            Scanner in = new Scanner(System.in);
            int  a = in.nextInt();
            int  b = in.nextInt();
            int  ic= System.in.read();
            char c  = (char) ic;
            System.out.println( calc(a,b,c));
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
