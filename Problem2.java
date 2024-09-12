public class problem2
  {
    public static void main(String[] args)
    {

      //Option 1 using truncating methods
      double first = 29.5839;
      double second = 45.4920;
      int firstr = (int) (first + 0.5);
      int secondr = (int) (second + 0.5);
      int ans = firstr + secondr;

      //Option 2 using the math functions
      double first = 29.5839;
      double second = 45.4920;
      int firstr = (int)(Math.round(first));
      int secondr = (int)(Math.round(second));
      int ans = firstr + secondr;

      
      System.out.println("Your first number: " + first);
      System.out.println("Your second number: " + second);
      System.out.println("The answer is:");
      System.out.println(firstr + " + " + secondr + " = " + ans);

      
    }
  }
