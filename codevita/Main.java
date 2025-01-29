import java.util.*;

public class Main {

   
    public static boolean isPointInsidePolygon(int x, int y, int[][] polygon) {
        int n = polygon.length;
        boolean inside = false;
        int p1x = polygon[0][0], p1y = polygon[0][1];
        for (int i = 0; i <= n; i++) {
            int p2x = polygon[i % n][0], p2y = polygon[i % n][1];
            if (y > Math.min(p1y, p2y)) {
                if (y <= Math.max(p1y, p2y)) {
                    if (x <= Math.max(p1x, p2x)) {
                        if (p1y != p2y) {
                            int xinters = (y - p1y) * (p2x - p1x) / (p2y - p1y) + p1x;
                            if (p1x == p2x || x <= xinters) {
                                inside = !inside;
                            }
                        }
                    }
                }
            }
            p1x = p2x;
            p1y = p2y;
        }
        return inside;
    }

    
    public static int minBrushPresses(int N, int[][] vertices, int M) {
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < N; i++) {
            minX = Math.min(minX, vertices[i][0]);
            maxX = Math.max(maxX, vertices[i][0]);
            minY = Math.min(minY, vertices[i][1]);
            maxY = Math.max(maxY, vertices[i][1]);
        }

        
        int width = maxX - minX + 1;
        int height = maxY - minY + 1;
        boolean[][] grid = new boolean[height][width];

        int offsetX = -minX;
        int offsetY = -minY;

        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (isPointInsidePolygon(j + offsetX, i + offsetY, vertices)) {
                    grid[i][j] = true;
                }
            }
        }

        int presses = 0;
        boolean[][] visited = new boolean[height][width];

       
        for (int i = 0; i <= height - M; i++) {
            for (int j = 0; j <= width - M; j++) {
                boolean canPlace = true;

             
                for (int x = 0; x < M; x++) {
                    for (int y = 0; y < M; y++) {
                        if (!grid[i + x][j + y] || visited[i + x][j + y]) {
                            canPlace = false;
                            break;
                        }
                    }
                    if (!canPlace) break;
                }

                
                if (canPlace) {
                    presses++;
                    for (int x = 0; x < M; x++) {
                        for (int y = 0; y < M; y++) {
                            visited[i + x][j + y] = true; // Mark cells as visited
                        }
                    }
                }
            }
        }

        return presses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int N = sc.nextInt();
        int[][] vertices = new int[N][2];
        
       
        for (int i = 0; i < N; i++) {
            vertices[i][0] = sc.nextInt();
            vertices[i][1] = sc.nextInt();
        }

      
        int M = sc.nextInt();

      
        System.out.println(minBrushPresses(N, vertices, M));

        sc.close();
    }
}
