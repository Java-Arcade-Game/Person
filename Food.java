import java.util.ArrayList;

public class Food extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    private int centerX, centerY;
    private void fillArray(){
        icon.add("burger.png");
        icon.add("soda.png");
        icon.add("strawberry.png");
        icon.add("carrot.png");
    }
    public Food(int x, int y, String f, int v){
        super(x,y,f,v);
        fillArray();
    }    
    
    public void setCenters() {
        if (getItemName().equals("burger.png")) {
            centerX = getX() + 44;
            centerY = getY() + 52;
        } else if (getItemName().equals("soda.png")) {
            centerX = getX() + 41;
            centerY = getY() + 57;
        } else if (getItemName().equals("strawberry.png")) {
            centerX = getX() + 38;
            centerY = getY() + 58;
        } else if (getItemName().equals("carrot.png")) {
            centerX = getX() + 46;
            centerY = getY() + 33;
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
