package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();

        int time = 0;
        for (char c : charArr) {
            time += calculateTime(c);
        }

        System.out.println(time);
    }

    public static int calculateTime(char c) {
        int time = 0;

        if ('A' <= c && c <= 'C') {
            time = 3;
        } else if ('D' <= c && c <= 'F') {
            time = 4;
        } else if ('G' <= c && c <= 'I') {
            time = 5;
        } else if ('J' <= c && c <= 'L') {
            time = 6;
        } else if ('M' <= c && c <= 'O') {
            time = 7;
        } else if ('P' <= c && c <= 'S') {
            time = 8;
        } else if ('T' <= c && c <= 'V') {
            time = 9;
        } else if ('W' <= c && c <= 'Z') {
            time = 10;
        }

        return time;
    }
}