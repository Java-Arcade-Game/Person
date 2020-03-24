/* The Dangers class extends Items and it contains 4 items. The pinapple, lightning and laughing are 
worth -1 point if collected and the exercise is worth 1 point. 

Authors: Erin Li & Shravanika Kumaran

Version: 1.0 03/24/2020
*/


import java.util.ArrayList;


public class Dangers extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    private int centerX, centerY;
    public void fillArray(){
        icon.add("pineapple.png");
        icon.add("lightning.png");
        icon.add("laughing.png");
        icon.add("exercise.png");
    }
    public Dangers(int x, int y, String f, int v){
        super(x,y,f,v);
        fillArray();
    }
    
    //These are the hard coded centers of all the four items. This method is called inside UserPanel as the item falls, so the center is adjusted accordingly.
    public void setCenters() {
        if (getItemName().equals("pineapple.png")) {
            centerX = getX() + 50;
            centerY = getY() + 51;
        } else if (getItemName().equals("lightning.png")) {
            centerX = getX() + 45;
            centerY = getY() + 46;
        } else if (getItemName().equals("laughing.png")) {
            centerX = getX() + 48;
            centerY = getY() + 45;
        } else if (getItemName().equals("exercise.png")) {
            centerX = getX() + 49;
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
        for(int i = 0; i<icon.size(); i++){
            if (super.getItemName().equals(icon.get(i)) ){
                if(i==0 || i ==1 || i==2){
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
