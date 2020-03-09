import java.util.ArrayList;


public class Jobs extends Items{
    private ArrayList<String> icon = new ArrayList<String>();
    public void fillArray(){
        icon.add("murder.png");
        icon.add("robber.png");
        icon.add("fortuneCookie.png");
        icon.add("foodTaster.png");
    }
    public Jobs(int x, int y, String f, int v){
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
