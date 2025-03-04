
package Task01_2;

/**
 *
 * @author TristanGavina
 */
public class Square extends Rectangle{
    

    public Square(double side) {
        super(side, side);
        super.shapeName = "Square";
    }
    
    
    @Override
    public void calculateArea(){
        this.area = super.length * super.length;
    }
}
