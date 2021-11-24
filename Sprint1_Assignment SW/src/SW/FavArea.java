package SW;

import java.util.ArrayList;


abstract class FavArea {
    ArrayList <String> a=new ArrayList<String>();
    Driver d;
void AddingFavArea(String areas){
    a.add(areas);
    }
    String search(String area){
    if(a.contains(area)){
       d.notify();

    }else{
        //AddingFavArea(area);
    }
        return area;
    }
}
