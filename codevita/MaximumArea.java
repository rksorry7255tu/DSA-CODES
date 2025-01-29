import java.util.*;

public class MaximumArea {

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class LineSegment {
        Point start, end;

        LineSegment(int x1, int y1, int x2, int y2) {
            this.start = new Point(x1, y1);
            this.end = new Point(x2, y2);
        }
    }

    public static double calculateArea(List<Point> points) {
        double area = 0.0;
        int n = points.size();
        for (int i = 0; i < n; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % n);
            area += p1.x * p2.y - p2.x * p1.y;
        }
        return Math.abs(area) / 2.0;
    }


    public static boolean doIntersect(LineSegment l1, LineSegment l2) {

        return (l1.start.x == l2.start.x && l1.start.y == l2.start.y) ||
               (l1.start.x == l2.end.x && l1.start.y == l2.end.y) ||
               (l1.end.x == l2.start.x && l1.end.y == l2.start.y) ||
               (l1.end.x == l2.end.x && l1.end.y == l2.end.y);
    }


    public static List<List<Point>> findPolygons(List<LineSegment> segments) {
        List<List<Point>> polygons = new ArrayList<>();
        boolean[] visited = new boolean[segments.size()];

        for (int i = 0; i < segments.size(); i++) {
            if (!visited[i]) {
                List<Point> polygon = new ArrayList<>();
                LineSegment current = segments.get(i);
                polygon.add(current.start);
                polygon.add(current.end);
                visited[i] = true;

                
                while (true) {
                    boolean found = false;
                    for (int j = 0; j < segments.size(); j++) {
                        if (!visited[j] && (current.end.x == segments.get(j).start.x && current.end.y == segments.get(j).start.y)) {
                            polygon.add(segments.get(j).end);
                            current = segments.get(j);
                            visited[j] = true;
                            found = true;
                            break;
                        }
                    }
                    if (!found) break;
                }
                polygons.add(polygon);
            }
        }
        return polygons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<LineSegment> segments = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            segments.add(new LineSegment(x1, y1, x2, y2));
        }

        List<List<Point>> polygons = findPolygons(segments);
        double maxArea = 0;

        for (List<Point> polygon : polygons) {
            double area = calculateArea(polygon);
            maxArea = Math.max(maxArea, area);
        }

        System.out.println((int) maxArea);
        sc.close();
    }
}
