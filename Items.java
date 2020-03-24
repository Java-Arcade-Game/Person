/*The items class is an abstract class that defines a general item that fall from the top of the screen, so the
player can catch it. Some items are worth positive points and others negative. The constructor takes in the 
initial location of the image that the item object represents, the image's file name, and desired velocity.
The abstract methods are getItemCenterX, getItemCenterY, setCenters, and PointVal.

Authors: Erin Li & Shravanika Kumaran

Version: 1.0 03/24/2020
*/


import javax.swing.*;
import java.awt.*;

public abstract class Items {
    private int centerX, centerY;
    private int velocity;
    private String itemName;
    private boolean visible;
    private static int panelWidth;
    private ImageIcon image; //imports image from file
    public Items(int x, int y, String f, int v){
        centerX = x;
        centerY = y;
        velocity = v;
        itemName = f;
        visible=true;
        image = new ImageIcon(f);
    }
    public abstract int getItemCenterX(); //Centers of the actual item inside image boundaries cause it's not centered exactly
    public abstract int getItemCenterY();
    public abstract void setCenters();
    public abstract int PointVal();
    
    public ImageIcon getImageIcon(){
      return image;
    }
    public void draw(Component c, Graphics g){
         if(visible)
               image.paintIcon(c, g, getX(), getY());
    }
    
    //Used to control when we can see the image
    public void hide(){
        visible = false;
    } 
    public void show(){
       visible = true;
    }
    public static void setPanelWidth(int w){
        panelWidth = w;
    }
    public String getItemName(){
        return itemName;
    }
    
    //The centers of the image
    public int getX(){
        return centerX;
    }
    public int getY(){
        return centerY;
    }
    public void setX(int x){
        centerX = x;
    }
    public void setY(int y){
        centerY = y;
    }
    public void setVelocity(int v){
        velocity = v;
    }
    public int getVelocity(){
        return velocity;
    }
    public boolean containsPoint(int x, int y){ //If the mouse with the person touches food item then disappears
        int xSquared = (x - centerX) * (x - centerX);
        int ySquared = (y - centerY) * (y - centerY);
        int area = image.getIconWidth() * image.getIconHeight();
        return xSquared + ySquared - area <= 0;
    }
    public void move(){ //Moves down with a set velocity
        int yVal = getY();
        if(yVal + image.getIconWidth() > panelWidth){  //include getWidth() so we bounce off on the right edge				
            yVal+=velocity; //Going down
        }
        centerY = yVal;
    }
}
