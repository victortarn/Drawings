package a5;

import java.awt.Color;

import a5.commands.ArcCommand;
import a5.commands.CircleCommand;
import a5.commands.Command;
import a5.commands.ForwardCommand;
import a5.commands.PenColorCommand;
import a5.commands.PenRadiusCommand;
import a5.commands.TeleportCommand;
import ca.queensu.cs.cisc124.notes.basics.geometry.Point2;
import princeton.introcs.StdDraw;

/* Draws an iPhone
 * 
 */

public class IPhone {
	
	public static void main(String[] args) {
		StdDraw.clear(new Color(250, 250, 250));
		Turtle t = new Turtle(new Point2(0.75, 0.85), 0, Color.RED);
	    Command c = new PenRadiusCommand(t, 2); 
	    c.execute();
	    c = new ArcCommand(t, 0.1, 90);
	    c.execute();
	    c = new ForwardCommand(t, 0.5);
	    c.execute();
	    c = new ArcCommand(t, 0.1, 90);
	    c.execute();
	    c = new ForwardCommand(t, 0.2);
	    c.execute();
	    c = new ArcCommand(t, 0.1, 90);
	    c.execute();
	    c = new ForwardCommand(t, 0.5);
	    c.execute();
	    c = new ArcCommand(t, 0.1, 90);
	    c.execute();
	    c = new ForwardCommand(t, 0.2);
	    c.execute();
	    c = new PenColorCommand(t, Color.BLACK);
	    c.execute();
	    c = new PenRadiusCommand(t, (float) 0.5);
	    c.execute();
	    c = new TeleportCommand(t, new Point2(0.45, 0.75));
	    c.execute();
	    c = new ForwardCommand(t, 0.4);
	    c.execute();
	    c = new TeleportCommand(t, new Point2(0.45, 0.25));
	    c.execute();
	    c = new ForwardCommand(t, 0.4);
	    c.execute();
	    c = new TeleportCommand(t, new Point2(0.65, 0.225));
	    c.execute();
	    c = new CircleCommand(t, 0.025);
	    c.execute();
	    c = new TeleportCommand(t, new Point2(0.55, 0.8));
	    c.execute();
	    c = new CircleCommand(t, 0.0075);
	    c.execute();
	    c = new TeleportCommand(t, new Point2(0.6, 0.8));
	    c.execute();
	    c = new ForwardCommand(t, 0.075);
	    c.execute();
	    c = new ArcCommand(t, 0.005, 180);
	    c.execute();
	    c = new ForwardCommand(t, 0.075);
	    c.execute();
	    c = new ArcCommand(t, 0.005, 180);
	    c.execute();
	    
	}
}
