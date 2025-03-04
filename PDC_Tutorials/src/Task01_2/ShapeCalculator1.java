
package Task01_2;

/**
 *
 * @author TristanGavina
 */
public class ShapeCalculator1 {
    
    public static void main(String[] args) {
        Circle cirObj = new Circle(2.5); //Instance
        cirObj.calculateArea();
        
        Rectangle recObj = new Rectangle(12, 16.5);
        recObj.calculateArea();
        
        Square squObj = new Square(3.3);
        squObj.calculateArea();
        
        cirObj.printInfo();
        recObj.printInfo();
        squObj.printInfo();
    }
    
}
