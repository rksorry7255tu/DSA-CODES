import java.util.*;

public class PlagueSpread {
    static int N;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1}; 

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        N = sca.nextInt();
        grid = new char[N][N];
        int startX = -1, startY = -1, destX = -1, destY = -1;

        
        for (int i = 0; i < N; i++) {
            String line = sca.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 's') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'd') {
                    destX = i;
                    destY = j;
                }
            }
        }

        
        int result = bfs(startX, startY, destX, destY);
        System.out.println(result);
        sca.close();
    }

    private static int bfs(int startX, int startY, int destX, int destY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.offer(new int[]{startX, startY, 0}); 
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                int[] pos = queue.poll();
                int x = pos[0];
                int y = pos[1];
                int days = pos[2];

                
                if (x == destX && y == destY) {
                    return days; 
                }

                
                char[][] nextGrid = new char[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        nextGrid[i][j] = grid[i][j]; 
                    }
                }

               
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (grid[i][j] == '0') {
                            int infectedNeighbors = 0;
                            for (int d = 0; d < 4; d++) {
                                int ni = i + dx[d];
                                int nj = j + dy[d];
                                if (isInBounds(ni, nj) && grid[ni][nj] == '1') {
                                    infectedNeighbors++;
                                }
                            }
                            if (infectedNeighbors == 3) {
                                nextGrid[i][j] = '1'; // Becomes infected
                            }
                        }
                    }
                }

                
                grid = nextGrid;

               
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (isInBounds(nx, ny) && !visited[nx][ny]) {
                       
                        if (grid[nx][ny] == '0' || grid[nx][ny] == 'd') {
                            visited[nx][ny] = true; // Mark as visited
                            queue.offer(new int[]{nx, ny, days + 1}); // Move to the next city and increment day
                        }
                    }
                }
            }
        }

        return -1; 
    }

    private static boolean isInBounds(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}