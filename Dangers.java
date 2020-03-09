import java.util.ArrayList;


public class Dangers extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    public void fillArray(){
        icon.add("pineapple.png");
        icon.add("lightning.png");
        icon.add("laughing.png");
        icon.add("exercise.png");
    }
    public Dangers(int x, int y, String f, int v){
        super(x,y,f,v);
    }

    public int PointVal() {
        for(int i = 0; i<icon.size(); i++){
            if (super.getF().equals(icon.get(i)) ){
                if(i==0 || i ==1 || i==2){
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 1;
    }
}
