import javax.swing.*;
import java.awt.*;

public class Person {
    private int centerX, centerY; //image
    private int personCenterX, personCenterY;
    private static int panelWidth;
    private boolean visible;
    private ImageIcon image; //import image from file
    public Person(int x, int y, int stage, String f){
        centerX = x;
        centerY = y;
        image = new ImageIcon(f);
        
        if (stage == 1) {
           personCenterX = x + 73; 
           personCenterY = y + 61;
        } else if (stage == 2) {
           personCenterX = x + 62;
           personCenterY = y + 75;
        } else if (stage == 3) {
           personCenterX = x + 60;
           personCenterY = y + 58;
        } else if (stage == 4) {
           personCenterX = x + 52;
           personCenterY = y + 56;
        }
           
    }
    public ImageIcon getImageIcon(){
      return image;
    }
    public void draw(Component c, Graphics g){
         if(visible)
               image.paintIcon(c, g, getX(), getY());
    }
    public void hide(){
        visible = false;
    } 
    public void show(){
       visible = true;
    }
    public static void setPanelWidth(int w){
        panelWidth = w;
    }
    public boolean containsPoint(int stage, int x, int y){
   
         double rightSide = 0, leftSide = 0, top = 0, bottom = 0;
        if (stage == 1){
            rightSide = personCenterX + 50;
            leftSide = personCenterX - 50;
            top = personCenterY - 53;
            bottom = personCenterY + 45;
        } else if (stage == 2) {
            rightSide = personCenterX + 58;
            leftSide = personCenterX - 55;
            top = personCenterY - 66;
            bottom = personCenterY + 44;
        } else if (stage == 3) {
            rightSide = personCenterX + 36;
            leftSide = personCenterX - 39;
            top = personCenterY - 38;
            bottom = personCenterY + 57;
        } else if (stage == 4) {
            rightSide = personCenterX + 35;
            leftSide = personCenterX - 25;
            top = personCenterY - 47;
            bottom = personCenterY + 48;
      }
        
        return x <= rightSide && x >= leftSide && y >= top && y <= bottom;
         
    }
    public int getX(){
        return centerX;
    }
    public int getY(){
        return centerY;
    }
    public void setCenterX(int x) {
        personCenterX = x;
    }
    public void moveLeft()
    {
        centerX-=2;
    }
    public void moveRight()
    {
        centerX+=2;
    }
    public void moveMouse(int dx)
    {
        centerX += dx;
        //dy is not needed
    }
}
