  PImage pepperoni;
  PImage olive;
  PImage mushroom;
  PImage pizzaBox;
  
void setup() {
  size(500,500);
  
  pepperoni = loadImage("pepperoni.png");
  olive = loadImage("olive.png");
  mushroom = loadImage("mushroom.png");
  pizzaBox = loadImage("box.jpg");
  pizzaBox.resize(500,500); 
}
void draw() {
background(pizzaBox); 



fill(#FFA51C);
ellipse(250,250,300,300);
fill(#FF0000);
ellipse(250,250,275,275);
fill(#FFF700);
ellipse(250,250,250,250);

if(mousePressed) {
  
pepperoni.resize(65,65);
image(pepperoni,160,160);
image(pepperoni,280,280);
image(pepperoni,280,160);
image(pepperoni,160,280);
image(pepperoni,220,220);

olive.resize(30,30);
image(olive,160,160);
image(olive,280,280);
image(olive,280,160);
image(olive,160,280);
image(olive,220,220);

mushroom.resize(45,45);
image(mushroom,230,160);
image(mushroom,160,230);
image(mushroom,230,300);
image(mushroom,300,230);
}
}
    
