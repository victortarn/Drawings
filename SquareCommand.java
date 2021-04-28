package a5.commands;

import a5.Turtle;

/**
 * Commands a turtle to draw a square of non-zero length.
 * The square edges are drawn in clockwise order with the
 * turtle moving forward from its current position and heading.
 *
 */
public class SquareCommand extends CompositeCommand {
	
	protected double length;
	
	public SquareCommand(Turtle t, double length){
		super(t);
		
        if ((length <= 0)) {
        	throw new IllegalArgumentException("length is zero or negative: " + length);
		} 
        
        this.length = length;
        
        TurnRightCommand turnRight;
        ForwardCommand forward;
                
        turnRight = new TurnRightCommand(this.turtle, 90);
        forward = new ForwardCommand(this.turtle, this.length);
        
        int i = 0;
        
        while (i < 4) {
        	addCommand(forward);
	        addCommand(turnRight);
	        i++;  
        }
	}
	
	public double getLength() {
		return this.length;
	}
	
}
