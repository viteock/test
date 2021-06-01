package replit._5_Arrays;

import java.util.*;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        //copy from
        float totalScore = 0;
        float highestScore = 0;
        float lowestScore = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
            totalScore += score[i];
            if(score[i] > highestScore) {
                highestScore = score[i];
            }
            if(i == 0) {
                lowestScore = score[0];
            }
            if(score[i] < lowestScore) {
                lowestScore = score [i];
            }
        }
        totalScore -= (lowestScore + highestScore);
        System.out.println("Enter difficulty:");
        float dif = input.nextFloat();
        float finalScore = (float) (totalScore * dif * 0.6);
        System.out.println("Total: " + finalScore);
    }
}
