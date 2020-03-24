/* The Grades class extends Items and it contains 4 items. The F and tardy are worth -1 point 
if collected and the A and B are worth 1 point. 

Authors: Erin Li & Shravanika Kumaran

Version: 1.0 03/24/2020
*/

import java.util.ArrayList;


public class Grades extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    private int centerX, centerY;
    private void fillArray(){
        icon.add("F.png");
        icon.add("tardy.png");
        icon.add("A.png");
        icon.add("B.png");
    }
    public Grades(int x, int y, String f, int v){
        super(x,y,f,v);
        fillArray();
    }
    
    //These are the hard coded centers of all the four items. This method is called inside UserPanel as the item falls, so the center is adjusted accordingly.
    public void setCenters() {
        if (getItemName().equals("F.png")) {
            centerX = getX() + 36;
            centerY = getY() + 51;
        } else if (getItemName().equals("tardy.png")) {
            centerX = getX() + 48;
            centerY = getY() + 46;
        } else if (getItemName().equals("A.png")) {
            centerX = getX() + 44;
            centerY = getY() + 48;
        } else if (getItemName().equals("B.png")) {
            centerX = getX() + 43;
            centerY = getY() + 50;
        }
    }
    
    public int getItemCenterX() {
        return centerX;
    }
    public int getItemCenterY() {
        return centerY;
    }

    public int PointVal() {
        for(int i = 0; i < 4; i++){
            if (getItemName().equals(icon.get(i)) ){
                if(i==0 || i ==1){
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
