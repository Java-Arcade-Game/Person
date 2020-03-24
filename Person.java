/**
 * @(#)Person.java
 *
 * Represents each person object which will be controlled by the player
 *
 * @author Erin Li and Shravanika Kumaran
 * @version 1.00 2020/3/24
 */
import javax.swing.*;
import java.awt.*;

public class Person {

    private int centerX, centerY; //image
    private int personCenterX, personCenterY;
    private static int panelWidth;
    private boolean visible;
    private ImageIcon image; //import image from file

    public Person(int x, int y, int stage, String f){ //adjusting each person's center due to different sized drawings
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
        } else if (stage == 5) {
            personCenterX = x + 44;
            personCenterY = y + 56;
        }

    }
    public ImageIcon getImageIcon(){
        return image;
    }

    public void draw(Component c, Graphics g){ //drawing the person for each stage
        if(visible)
            image.paintIcon(c, g, getX(), getY());
    }

    public void hide(){ //hiding the person when it's not the right stage
        visible = false;
    }

    public void show(){ //showing the person when it's the right stage
        visible = true;
    }

    public static void setPanelWidth(int w){
        panelWidth = w;
    }

    public boolean containsPoint(int stage, int x, int y){ //check if the x and y taken in is touching the Person

        //adjusting each picture to the correct size
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
        } else if (stage == 5) {
            rightSide = personCenterX + 38;
            leftSide = personCenterX - 35;
            top = personCenterY - 34;
            bottom = personCenterY + 27;
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

    public void moveMouse(int dx) //changing centerX when the mouse moved the Person
    {
        centerX += dx;
        //dy is not needed because it only moves left and right 
    }
}
