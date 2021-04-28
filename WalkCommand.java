package a5.commands;

import a5.Turtle;

/**
 * Abstract base class for all commands that cause a turtle to
 * walk in a straight line.
 *
 */
public abstract class WalkCommand extends Command {
	
	protected double distance;
	
	WalkCommand(Turtle t, double distance){
		super(t);
        if (distance < 0.0) {
			throw new IllegalArgumentException("distance is negative: " + distance);
		}
        
        this.distance = distance;
	}
	
	public double getDistance() {
		return this.distance;
	}
}
