
package Task01_2;

/**
 *
 * @author TristanGavina
 */
public class Rectangle extends Shape{
    
    double length;
    double width;
    
    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void calculateArea(){
        this.area = length * width;
    }
}
