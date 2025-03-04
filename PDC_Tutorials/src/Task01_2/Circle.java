
package Task01_2;

/**
 *
 * @author TristanGavina
 */
public class Circle extends Shape{
    
    double radius;
    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }
    
    @Override
    public void calculateArea(){
        this.area = radius * radius * Math.PI;
    }
    
}
