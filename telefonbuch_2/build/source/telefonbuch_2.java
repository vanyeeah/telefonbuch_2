import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class telefonbuch_2 extends PApplet {


String name01 = "Andam Apfel";
String name02 = "Bert Astmann";
String name03 = "Cristoph Bierne";

String number01 = "0152 111111111";
String number02 = "0134 33333333";
String number03 = "0257 22222222";

public void setup()
{
  

}



public void draw()
{
background(255);


fill(0);
textSize(25);
text("Telefonbuch: ", 20, 40);

textSize(14);
text(name01 + ": " + number01, 20, 80);
text(name02 + ": " + number02, 20, 110);
text(name03 + ": " + number03, 20, 140);
}
  public void settings() {  size(400,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "telefonbuch_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
