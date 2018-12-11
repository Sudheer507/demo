package com.example.demo.util;

public class MaxSatisfactionUtil {

    public  static int getMaxSatisfaction(int []satisfaction, int []time, int totalTime)
    {
        //int i, j;

        int [][]dynamicProblem = new int[satisfaction.length+1][totalTime+1];



        for (int i = 0; i <= satisfaction.length; i++)

        {

            for (int j = 0; j <= totalTime; j++)

            {

                if (i==0 || j==0)

                    dynamicProblem[i][j] = 0;

                else if (time[i-1] <= j)

                    dynamicProblem[i][j] = max(satisfaction[i-1] + dynamicProblem[i-1][j-time[i-1]],  dynamicProblem[i-1][j]);

                else

                    dynamicProblem[i][j] = dynamicProblem[i-1][j];

            }

        }
        return  dynamicProblem[satisfaction.length][totalTime];

    }

    public static int max(int a, int b)

    {

        return (a > b)? a : b;

    }
}
