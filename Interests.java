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
