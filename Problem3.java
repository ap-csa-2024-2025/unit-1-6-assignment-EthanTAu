public class problem3
{
    public static void main(String[] args)
    {
        final double num = 56.21940;
        int first = (int)((num % 1) * 10);
        int second = (int)((num % 0.1) * 100);
        int third = (int)((num % 0.01) * 1000);
        
        System.out.println("Decimal number: " + num);
        System.out.println("Answer: " + first + " " + second + " " + third);
        
    }
}
