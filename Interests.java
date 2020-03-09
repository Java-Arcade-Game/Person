import java.util.ArrayList;


public class Interests extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    public void fillArray(){
        icon.add("phone.png");
        icon.add("gaming.png");
        icon.add("sports.png");
        icon.add("music.png");
    }
    public Interests(int x, int y, String f, int v){
        super(x,y,f,v);
    }

    public int PointVal() {
        for(int i = 0; i<icon.size(); i++){
            if (super.getF().equals(icon.get(i)) ){
                if(i==0 || i ==1){
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 1;
    }
}
