public class lcmAndGcd {
  public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int res[] = new int[2];
    int lcm=1;
    int i=2;
    int small=Math.max(a, b);
    int large=Math.min(a, b);
    while(true){
      if(small%i==0&&large%i==0){
        
      }
    }

    
    int GCD = 1;
    int remainder = large % small;
    while (true) {
      if (remainder == 0) {
        GCD = remainder;
        res[1] = GCD;
      } else {
        large = small;
        small = remainder;
      }
    }
    
  }
}
