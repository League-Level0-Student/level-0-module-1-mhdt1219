void setup() {
    size(500, 500);
}
void draw() {
    
    background(255,255,255);
    
    noStroke();
    fill(#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#4CCE02);
    rect(176, 103, 12, 32);
    
    if(mousePressed) {
    noStroke();
    fill(#FFFFFF);
    ellipse(75,200,35,35);
    
    
    }
}
