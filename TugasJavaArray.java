import java.util.Scanner;

public class TugasJavaArray {
    public static void main(String[] args) throws Exception {
        char[][] papancatur = {
                { 'B', 'N', 'G', 'Q', 'R', 'G', 'N', 'B' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { 'B', 'N', 'G', 'Q', 'R', 'G', 'N', 'B' }
        };
        for (int i = 0; i < papancatur.length; i++) {
            for (int j = 0; j < papancatur[i].length; j++) {
                System.out.println(papancatur[i][j] + " ");
            }
            System.out.println();
        }
    }
}