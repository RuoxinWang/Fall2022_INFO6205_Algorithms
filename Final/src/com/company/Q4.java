package com.company;

public class Q4 {
    private static int numWaysToReachEndWithObstacles(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 0){
            return 0;
        }
        obstacleGrid[0][0] =1;
        for (int i = 0;i < m; i++){
            if (obstacleGrid[i][0] == 0){
                continue;
            }
            obstacleGrid[i][0] = obstacleGrid[i - 1][0] == 0 ? 0 : 1;
        }
        for (int i = 0;i < n; i++){
            if (obstacleGrid[0][i] == 0){
                continue;
            }
            obstacleGrid[0][i] = obstacleGrid[0][i - 1] == 0 ? 0 : 1;
        }
        for (int i = 1;i < m; i++){
            for (int j = 1;j < n; j++){
                if (obstacleGrid[i][j] == 0){
                    continue;
                }
                if (obstacleGrid[i - 1][j] == 0){
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                } else if (obstacleGrid[i][j - 1] == 0){
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }
        return obstacleGrid[m - 1][n - 1];
    }
}
//Time: O(2n+n^2)
