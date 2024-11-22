package FrmBookJava;

import java.util.Scanner;

public class AutoGradedProgramming2 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter matrix1 (9 numbers in one line): ");
                double[][] m1 = new double[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        m1[i][j] = input.nextDouble();
                    }
                }
                System.out.print("Enter matrix2 (9 numbers in one line): ");
                double[][] m2 = new double[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        m2[i][j] = input.nextDouble();
                    }
                }
        System.out.println("The matrices are added as follows: ");
                double[][] m3 = addMatrix(m1, m2);
                printResult(m1, m2, m3, '+');
            }

            public static double[][] addMatrix(double[][] m1, double[][] m2) {
                double[][] result = new double[m1.length][m1[0].length];
                for (int i = 0; i < m1.length; i++) {
                    for (int j = 0; j < m1[0].length; j++) {
                        result[i][j] = m1[i][j] + m2[i][j];
                    }
                }
                return result;
            }
            public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op) {
                for (int i = 0; i < m1.length; i++) {
                    for (int j = 0; j < m1[i].length; j++) {
                        System.out.printf("%6.1f", m1[i][j]);
                    }

                    System.out.printf((i == 1 ? "   %c   " : "       "), op);
                    for (int j = 0; j < m2[i].length; j++) {
                        System.out.printf("%6.1f", m2[i][j]);
                    }
                    System.out.print(i == 1 ? "   =   " : "       ");

                    for (int j = 0; j < m3[i].length; j++) {
                        System.out.printf("%6.1f", m3[i][j]);
                    }
                    System.out.println();
                }
            }
        }

