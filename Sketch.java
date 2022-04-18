import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  // Declare global image cariable
  PImage imgShell;
  PImage imgBackground;
  
  float fltShellX = random(0, 1000);
  float fltShellY = random(0, 1000);

  // The amount that the x and y values increase or decrease by
  float fltSpeedX = 4;
  float fltSpeedY = 4;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 1000);
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
    fltShellX += fltSpeedX;
    fltShellY += fltSpeedY;

  
  // define other methods down here.
}