import java.util.*;

public class Distance
{
   public static void main (String[] arg){
   
   
   double distance;


Scanner scan = new Scanner (System.in);

System.out.println("Enter the first X point: ");
double firstX = scan.nextDouble();

System.out.println("Enter the first Y point: ");
double firstY = scan.nextDouble();

System.out.println("Enter the second X point: ");
double secondX = scan.nextDouble();

System.out.println("Enter the second Y point: ");
double secondY = scan.nextDouble();


distance = ((secondX - firstX) * (secondX - firstX)) + ((secondY - firstY) * (secondY - firstY));
double root = Math.sqrt(distance);

System.out.println("The distance between the two points (" + firstX + ", " + firstY + "), (" + secondX + ", " + secondY + "), is : " + root);
   
   

      }

}