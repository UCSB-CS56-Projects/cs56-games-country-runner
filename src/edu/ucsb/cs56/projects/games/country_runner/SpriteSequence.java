package edu.ucsb.cs56.projects.games.country_runner;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

/**SpriteSequence is an abstract class for looping
 * through a sequence of images loaded from a spriteSheet.
 * Every class that inherits from sprite will have an instance
 * of this class, for example "running" or "jumping".
 * All the looping happens in this class, so the sprite
 * children can easily just move the next image in the sequence
 *
 * This is esentially a glorified arrayList with an index to
 * save the current position
 * @author Sidney Rhoads, Tom Craig
 * @version CS56, W14
 */

public class SpriteSequence extends ArrayList<BufferedImage>
{
	//Index to "remember" where we are in the array
	//Meaning the lat image we pulled from the array
	private int currentIndex;

	//Constructor just sets the index to 0
	public SpriteSequence()
	{
		currentIndex = 0;
	}

	/** addImage
	 * Adds an image to the array. 'nuff said
	 */
	public boolean addImage(BufferedImage newImage)
	{
		add(newImage);
		return true;
	}

	/** getNextImage
	 * Has looping logic, finds the next image in the
	 * array and returns it.  If we are at the end,
	 * it goes to the beginning
	 */
	public BufferedImage getNextImage()
	{
		currentIndex++;
		if(currentIndex == this.size())
		{
			currentIndex = 0;
		}

		return this.get(currentIndex);
	}

	/** resetIndex
	 * Makes the index 0, should we need to start
	 * over the animation sequence
	 */
	public void resetIndex()
	{
		currentIndex = 0;
	}
}