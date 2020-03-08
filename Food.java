import java.util.ArrayList;


public class Food extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    public void fillArray(){
        icon.add("burger.png");
    }
    public Food(int x, int y, String f, int v){
        super(x,y,f,v);
    }

    public int PointVal() {
        for(int i = 0; i<icon.size(); i++){
            if (super.getF().equals(icon.get(i))){
                return -1;
            } else {
                return 1;
            }
        }
        return 1;
    }
}
