
String name01 = "Andam Apfel";
String name02 = "Bert Astmann";
String name03 = "Cristoph Bierne";

String number01 = "0152 111111111";
String number02 = "0134 33333333";
String number03 = "0257 22222222";

void setup()
{
  size(400,800);

}



void draw()
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
