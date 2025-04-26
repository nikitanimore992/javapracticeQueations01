public class GFG {
    // Main driver method
    public static void main(String[] args)
    {
      // Declaring an integer variable
        int x = 2;
        // For loop to iterate
        for (long y = 0, z = 4; x < 10 && y < 10;
             x++, y++) {
            // Printing value/s stored in variable named y
            // defined inside body of for loop
            System.out.println(y + " ");
        }
        // Printing value/s stored in variable named x
        // defined outside body of for loop
        System.out.println(x);
    }
}