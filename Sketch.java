import processing.core.PApplet;
import processing.core.PImage;

  /**
  * A program that uses an image as a background, animates an image that uses basic edge detection, and animates a shape that moves in a non-linear path.
  * @author: B. Chan
  */

public class Sketch extends PApplet {
	
  // Declare global image cariable
  PImage imgShell;
  PImage imgBackground;
  
  float fltShellX = random(0, 1000);
  float fltShellY = random(0, 600);
  float fltCircleX = 25;
  float fltCircleY = 375;

  // The amount that the x and y values increase or decrease by
  float fltShSpeedX = 10;
  float fltShSpeedY = 10;
  float fltCSpeedX = 5;
  float fltCSpeedY = 5;

  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    // Load images: Green shell and white background
    // Shell dimensions: 160 x 140
    imgShell = loadImage("shell.png"); 
    imgBackground = loadImage("white.jpg");   
    
    }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Draw White background
    image(imgBackground, 0, 0);

    // Draw Green Shell
    image(imgShell, fltShellX, fltShellY);

    // Animate Green Shell
    fltShellX += fltShSpeedX;
    fltShellY += fltShSpeedY;

    // if Shell touches right edge of screen, reverse X animation motion
    if (fltShellX >= 840) {
      fltShSpeedX = -fltShSpeedX;
      fltShellX = 840;   
    } 

    // if Shell touches left edge of screen (x <= 0), change X animation motion and to opposite direction
    else if (fltShellX <= 0) {
      fltShSpeedX = -fltShSpeedX;
      fltShellX = 0;
    }

    // if Shell touches bottom edge of screen, reverse Y animation motion
    if (fltShellY >= 460) {
      fltShSpeedY = -fltShSpeedY;
      fltShellY = 460;
    }

    // if Shell touches top edge of screen (y <= 0), change Y animation motion and to opposite direction
    else if (fltShellY <= 0) {
      fltShSpeedY = -fltShSpeedY;
      fltShellY = 0;
    }

    // Draw Circle shape
    fill(0, 0, 0);
    ellipse(fltCircleX, fltCircleY, 50, 50);

    // Animate Black Circle
    fltCircleX += fltCSpeedX;

    // if Circle touches right edge of screen, reverse X animation motion
    if (fltCircleX >= 975) {
      fltCSpeedX = -fltCSpeedX;
      fltCircleX = 975;   
    } 

    // if Circle touches left edge of screen (x <= 0), change X animation motion and to opposite direction
    else if (fltCircleX <= 25) {
      fltCSpeedX = -fltCSpeedX;
      fltCircleX = 25;
    }

  }
  
  // define other methods down here.
}