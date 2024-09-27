package Chapter3LoopFromSchoolBook;

public class ForLoop {
    public static void main(String[] args) {

     /*
Goal: Learn to write for loops.

Assignment: In a new mobile game, players earn points by overcoming obstacles. Each level has an increasing number
 of obstacles, and the points earned for each obstacle in a level are equal to the square of the level number. The
 game designer needs to calculate the total points that can be earned from the first 20 levels to adjust the game's
 difficulty.Given int variables level and totalPoints, use a for loop to compute the total points a player can earn
 by completing all obstacles in the first 20 levels. The points from each level are the square of the level number
 multiplied by the number of obstacles in that level (assume each level has obstacles equal to the level number).
 Store this cumulative point total in totalPoints.For example, level 1 has 1 obstacle worth 1^2 points, level 2 has 2
 obstacles each worth 2^2 points (totaling 4*2=8 points for level 2), and so on. You must use level for your for loop.
      */

int totalPoints = 0;
for ( int level = 1; level <= 20; level++){
    totalPoints += level * level * level;
}
        System.out.println("the total is : " + totalPoints);
        System.out.println("-----------------------------------------------------");












    }







}
