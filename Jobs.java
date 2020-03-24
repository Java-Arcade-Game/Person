/* The Jobs class extends Items and it contains 4 items. The murderer and robber are worth -1 point 
if collected and the fortune cookie writer and traveler are worth 1 point. 

Authors: Erin Li & Shravanika Kumaran

Version: 1.0 03/24/2020
*/

import java.util.ArrayList;


public class Jobs extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    private int centerX, centerY;
    public void fillArray(){
        icon.add("murderer.png");
        icon.add("robber.png");
        icon.add("fortuneCookie.png");
        icon.add("traveler.png");
    }
    public Jobs(int x, int y, String f, int v){
        super(x,y,f,v);
        fillArray();
    }
    
    //These are the hard coded centers of all the four items. This method is called inside UserPanel as the item falls, so the center is adjusted accordingly.
    public void setCenters() {
        if (getItemName().equals("murderer.png")) {
            centerX = getX() + 49;
            centerY = getY() + 51;
        } else if (getItemName().equals("robber.png")) {
            centerX = getX() + 51;
            centerY = getY() + 61;
        } else if (getItemName().equals("fortuneCookie.png")) {
            centerX = getX() + 45;
            centerY = getY() + 42;
        } else if (getItemName().equals("traveler.png")) {
            centerX = getX() + 46;
            centerY = getY() + 52;
        }
    }
    
    public int getItemCenterX() {
        return centerX;
    }
    public int getItemCenterY() {
        return centerY;
    }

    public int PointVal() {
        for(int i = 0; i<icon.size(); i++){
            if (super.getItemName().equals(icon.get(i)) ){
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
