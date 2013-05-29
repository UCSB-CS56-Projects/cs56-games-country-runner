package edu.ucsb.cs56.projects.games.country_runner;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

/**
 * @author Christina Morris, Mathew Glodack
 * @version CS56, S13, project3
 * Draws the runner object on the screen
 */

public class Runner extends GeneralPathWrapper implements Shape {

    private double x;
    private double y;
    private double height;
    private double width;

    public Runner(){
	this.height = 10.0;
	this.width = 10.0; 
	this.x = 500.0;
	this.y = 300.0;

	Rectangle2D.Double runner = 
	    new Rectangle2D.Double(x, y, width,height);
	
	GeneralPath r = this.get();
	r.append(runner, false);
    }
}

    