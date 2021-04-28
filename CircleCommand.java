package a5.commands;

import a5.Turtle;

/**
 * Commands a turtle to draw a circle of non-zero radius.
 * The circle is drawn in clockwise order starting from the
 * turtle's current position. After drawing the circle, the
 * turtle returns to its position and heading that it had
 * immediately before drawing the circle.
 * 
 * <p>
 * A turtle can draw only straight lines so drawing a circle
 * involves drawing a sequence of straight lines to approximate
 * a circle. 
 *
 */
public class CircleCommand extends CompositeCommand {
	
	protected double radius;
	
	public CircleCommand(Turtle t, double radius){
		super(t);
		
        if ((radius <= 0)) {
        	throw new IllegalArgumentException("radius is zero or negative: " + radius);
		} 
     
        this.radius = radius;
        
        //An angle change of 1 degrees draws a much better circle than 5 degrees while still drawing it quickly
        double angle = 1;
        double length = Math.sqrt((2 * Math.pow(radius, 2)) * (1 - Math.cos(Math.toRadians(angle))));
    	
    	TurnRightCommand turnRight;
        ForwardCommand forward;
                
        turnRight = new TurnRightCommand(this.turtle, angle);
        forward = new ForwardCommand(this.turtle, length);
       
        int i = 0;
        
        while (i < 360 / angle) {
        	addCommand(turnRight);
        	addCommand(forward);
            i++; 
        }
	}
	
	public double getRadius() {
		return this.radius;		
	}

}
