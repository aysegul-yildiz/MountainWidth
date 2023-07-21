import java.util.Scanner;

/**
 * Lab05_Q2
 */
public class Lab05_Q2 
{

    public static void main(String[] args) 
    { 
        Scanner scan;
        int input;
        int rows;
        int sum;
        sum=0;

        // keep asking for mountain width if the input is not an odd number
        do
        {
        scan = new Scanner(System.in);
        System.out.print("Enter mountain width: ");
        input = scan.nextInt();
        } while ( (input % 2) == 0);

        // close scanner
        scan.close();

        // define the rows needed
        rows = (input / 2) + 1;
 
        int f = input;

        // for every row print the numbers 
        for (int i = 1; i <= rows ; i++)
        {
            // loop to print the spaces according to the row and create the pyramid shape
            for (int a = 1; a <= 20-2*i; a++)
            {
            System.out.print(" ");
            }
            // print the numbers that takes place before the middle of the row in an increasing order
            for (int b = 1, e = input - (2*(i-1)); b < i ; b++, e++)
            {
                System.out.print(e +" ");
                sum+=e;
            }
           
            // print the number in the middle
            System.out.printf( "%d ",f);
            f--;
            sum+=f;
            
            // print the numbers that takes place after the middle of the row in an decreasing order
            for (int d = 1, c = f; d < i ; d++,c--)
            {
                System.out.print(c +" ");
                sum+=c;   
            }
            
            System.out.println();
        }
        sum++;
        // print the sum 
        sum+=f;
        System.out.println("Weight of mountain with width of "+input+" is "+sum);
    }
}