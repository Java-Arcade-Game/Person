import javax.swing.*;
public abstract class Items {
    private int centerX, centerY;
    private int velocity;
    private static int panelWidth;
    private ImageIcon image; //import image from file
    public Items(int x, int y, String f, int v){
        centerX = x;
        centerY = y;
        velocity = v;
        image = new ImageIcon(f);
    }
    public static void setPanelWidth(int w){
        panelWidth = w;
    }
    public int getX(){
        return centerX;
    }
    public int getY(){
        return centerY;
    }
    public void setVelocity(int v){
        velocity = v;
    }
    public int getVelocity()
    {
        return velocity;
    }
    public void move(){ //need smth that moves down with a set velocity
        /**int xVal = getX();

        if(xVal + radius > panelWidth){  //include getWidth() so we bounce off on the right edge

            direction=0; //negative;				
            xVal-=velocity;
        }
        else if(xVal - radius < 0){

            xVal+=velocity;
            direction = 1; //positive
        }
        else
        {
            if(direction == 1)
                xVal+=velocity;
            else
                xVal-=velocity;
        }
        centerX = xVal;*/
    }
}
