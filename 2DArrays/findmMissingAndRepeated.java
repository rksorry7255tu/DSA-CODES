import java.util.HashSet;

public class findmMissingAndRepeated {
  public static void main(String[] args) {
    int grid[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
    int res[] = new int[2];
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (set.contains(grid[i][j])) {
          res[0] = grid[i][j];
          set.add(grid[i][j]);
        } else {
          set.add(grid[i][j]);
        }
      }
    }
    int size = grid.length * grid.length;
    for (int i = 1; i < size + 1; i++) {
      if (!set.contains(i)) {
        res[1] = i;
        break;
      }
    }
    System.out.println(res[0]);
    System.out.println(res[1]);
    System.out.println(set);
  }
}
