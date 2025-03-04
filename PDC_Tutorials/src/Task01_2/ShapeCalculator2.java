
package Task01_2;

/**
 *
 * @author TristanGavina
 */ 
import java.util.Scanner;
public class ShapeCalculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please select:");
        System.out.println("(1) Rectangle");
        System.out.println("(2) Circle");
        System.out.println("(3) Square");
        
        String s = scan.nextLine();
        
        
        try {
            int option = Integer.parseInt(s.trim());
            switch(option){
                case 1:
                    System.out.print("Input length: ");
                    s = scan.nextLine();
                    double len = Double.parseDouble(s);
                    System.out.print("Input width: ");
                    s = scan.nextLine();
                    double wid = Double.parseDouble(s);
                    Rectangle aRec = new Rectangle(len, wid);
                    aRec.calculateArea();
                    aRec.printInfo();
                    break;
                    
                case 2:
                    System.out.print("Input radius: ");
                    s = scan.nextLine();
                    double rad = Double.parseDouble(s);
                    Circle aCir = new Circle(rad);
                    aCir.calculateArea();
                    aCir.printInfo();
                    break;
                    
                case 3:
                    System.out.print("Input side length: ");
                    s = scan.nextLine();
                    double sLen = Double.parseDouble(s);
                    Square aSqu = new Square(sLen);
                    aSqu.calculateArea();
                    aSqu.printInfo();
                    break;
                    
                default:
                    System.out.println("Wrong input.");
                    break;
            }
        } catch(NumberFormatException e){
            System.out.println("Invalid input. Not an integer");
        }
        scan.close();
    }
}
