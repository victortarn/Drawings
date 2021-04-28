package a5.commands;

import a5.Turtle;

/* Command that creates arc of a positive radius and positive angle in degrees.
 * Used in IPhone.java
 */

public class ArcCommand extends CompositeCommand {

	protected double radius;
	protected double arcAngle; //In degrees
	
	public ArcCommand(Turtle t, double radius, double arcAngle) {
		super(t);
		
		if (radius <= 0 || arcAngle <= 0 || arcAngle > 360) {
        	throw new IllegalArgumentException("The radius or arcAngle are invalid. Radius: " + radius + " arcAngle: " + arcAngle);
		} 
     
        this.radius = radius;
        this.arcAngle = arcAngle;
        
        double length = Math.sqrt((2 * Math.pow(radius, 2)) * (1 - Math.cos(Math.toRadians(1))));
        
        ForwardCommand forward;
        forward = new ForwardCommand(this.turtle, length);
        
    	TurnRightCommand turnRight;
    	turnRight = new TurnRightCommand(this.turtle, 1);
        
        int i = 0;
        
        while (i < arcAngle) {
        	addCommand(turnRight);
        	addCommand(forward);
            i++; 
        }
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArcAngle() {
		return this.arcAngle;
	}
}
