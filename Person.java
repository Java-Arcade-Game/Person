import javax.swing.*;
public abstract class Person {
    private int centerX, centerY;
    private int direction;
    private static int panelWidth;
    private ImageIcon image; //import image from file
    public Person(int x, int y, String f){
        centerX = x;
        centerY = y;
        direction = 0;
        image = new ImageIcon(f);
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
        centerY += dy;
    }
}
