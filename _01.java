import java.util.Scanner;

public class _01 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,d,e,f,x,y;

        System.out.print("Enter a: ");
        a = scanner.nextFloat();
        System.out.print("Enter b: ");
        b = scanner.nextFloat();
        System.out.print("Enter c: ");
        c = scanner.nextFloat();
        System.out.print("Enter d: ");
        d = scanner.nextFloat();
        System.out.print("Enter e: ");
        e = scanner.nextFloat();
        System.out.print("Enter f: ");
        f = scanner.nextFloat();
         scanner.close();;
         if((a*d)-(b*c) == 0)
        {
            System.out.println("The equation has no solution.");
        }
        else{
            x = (e*d - b*d)/(a*d-b*c);
            y = (a*f - e*c)/(a*d-b*c);
            System.out.println("X = "+x);
            System.out.println("Y = "+y);
        }

    }
}
