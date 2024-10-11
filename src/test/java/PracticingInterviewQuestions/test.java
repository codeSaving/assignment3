package PracticingInterviewQuestions;

public class test {
    public static void main(String[] args) {

    int [] num = {12, 3,4,5,6,6};
    int large = num[0];
    for (int i = 1; i < num.length; i++){
        if (num [i] > large){
            large = num[i];
        }
    }

        System.out.println();
    }
}
