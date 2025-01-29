import java.util.*;

public class LegoBlockRemoval {
    static int N, M;
    static int[][] matrix;
    static boolean[][] visited;
    static int blocksRemoved = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        N = sca.nextInt();
        M = sca.nextInt();
        matrix = new int[N][M];
        visited = new boolean[N][M]; 
       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sca.nextInt();
            }
        }

        
        int targetColor = sca.nextInt();

        
        int targetRow = -1, targetCol = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == targetColor) {
                    targetRow = i;
                    targetCol = j;
                    break;
                }
            }
            if (targetRow != -1) break;
        }

        
        removeBlocks(targetRow, targetCol);

        
        System.out.println(blocksRemoved);
        sca.close();
    }

    private static void removeBlocks(int targetRow, int targetCol) {
        
        for (int j = M - 1; j >= targetCol; j--) {
            for (int i = 0; i < N; i++) {
                if (matrix[i][j] != 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    blocksRemoved++;
                    
                    checkGravity(i, j);
                }
            }
        }
    }

    private static void checkGravity(int row, int col) {
        
        for (int i = row - 1; i >= 0; i--) {
            if (matrix[i][col] != 0 && !visited[i][col]) {
                boolean canFall = true;
                
                if (i + 1 < N && matrix[i + 1][col] == 0) {
                    canFall = false;
                }
                if (canFall) {
                    visited[i][col] = true;
                    blocksRemoved++;
                    checkGravity(i, col);
                }
            }
        }
    }
}