package tekJavaInterviewQuestions;

import java.util.ArrayList;

public class InterviewQuestion {

        public static void main(String[] args) {

            //0 [0][0][0][0][0][0][0]
            //1 [0][0][0][0][0][0][0]
            //2 [0][0][0][0][3][0][0]
            //3 [0][0][0][0][0][0][0]
            //   0  1  2  3  4  5  6
            // [row][col]

            int[][] numbers = new int[4][7];
            numbers[2][4] = 3;
            numbers[2][4] = 0;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------------------");
            ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
            nums.add(new ArrayList<Integer>());
            nums.add(new ArrayList<Integer>());
            nums.add(new ArrayList<Integer>());
            nums.add(new ArrayList<Integer>());
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 7; j++) {
                    nums.get(i).add(0);
                }
            }
            System.out.println(nums);
            for (int i = 0; i < nums.size(); i++) {
                for (int j = 0; j < nums.get(i).size(); j++) {
                    System.out.print(nums.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }







}
