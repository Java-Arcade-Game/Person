import javax.swing.*;

public class Person {
    private int centerX, centerY;
    private static int panelWidth;
    private ImageIcon image; //import image from file
    public Person(int x, int y, String f){
        centerX = x;
        centerY = y;
        image = new ImageIcon(f);
    }
    public ImageIcon getImageIcon(){
      return image;
    }
    public static void setPanelWidth(int w){
        panelWidth = w;
    }
    public boolean containsPoint(int x, int y){
        int xSquared = (x - centerX) * (x - centerX);
        int ySquared = (y - centerY) * (y - centerY);
        int area = image.getIconWidth() * image.getIconHeight();
        return xSquared + ySquared - area <= 0;
    }
    public int getX(){
        return centerX;
    }
    public int getY(){
        return centerY;
    }
    public void moveLeft()
    {
        centerX-=2;
    }
    public void moveRight()
    {
        centerX+=2;
    }
    public void move(int x, int w){//moves side to side
        centerX = x - w; //setX(x - w);
    }
    public void moveMouse(int dx, int dy)
    {
        centerX += dx;
        //dy is not needed
    }
}
