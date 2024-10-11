package tekJavaInterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class practiceIt {
    public static void main(String[] args) {

     // we are going to declare and initialize a 2d array numbers [][]
     int [][] numbers = new int [4][7];
     // [4] will represent row and [7] will represent col
        numbers [2][2] = 3 ;
        numbers [1][2] = 10;
        numbers [1][3] = 11;
        numbers [2][1] = 13;
        numbers [2][2] = 14;
        numbers [2][3] =  4;
        numbers [3][1] =  7;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0 ; j< numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("________________________________________");
        ArrayList <ArrayList <Integer>> nums = new ArrayList<>();
        nums.add(new ArrayList<Integer>());
        nums.add(new ArrayList<Integer>());
        nums.add(new ArrayList<Integer>());
        nums.add(new ArrayList<Integer>());
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 7; j++){
                nums.get(i).add(2);
                nums.get(i).add(3);


            }
        }
        System.out.println(nums);
        for(int i = 0; i<nums.size(); i++){
            for(int j= 0; j< nums.get(i).size(); j++){
                System.out.print(nums.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }
}
