/* The Interests class extends Items and it contains 4 items. The phone and gaming are worth -1 point 
if collected and the sports and music are worth 1 point. 

Authors: Erin Li & Shravanika Kumaran

Version: 1.0 03/24/2020
*/

import java.util.ArrayList;


public class Interests extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    private int centerX, centerY;
    private void fillArray(){
        icon.add("phone.png");
        icon.add("gaming.png");
        icon.add("sports.png");
        icon.add("music.png");
    }
    public Interests(int x, int y, String f, int v){
        super(x,y,f,v);
        fillArray();
    }
    
    //These are the hard coded centers of all the four items. This method is called inside UserPanel as the item falls, so the center is adjusted accordingly.
    public void setCenters() {
        if (getItemName().equals("phone.png")) {
            centerX = getX() + 44;
            centerY = getY() + 43;
        } else if (getItemName().equals("gaming.png")) {
            centerX = getX() + 45;
            centerY = getY() + 39;
        } else if (getItemName().equals("sports.png")) {
            centerX = getX() + 52;
            centerY = getY() + 49;
        } else if (getItemName().equals("music.png")) {
            centerX = getX() + 49;
            centerY = getY() + 47;
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
