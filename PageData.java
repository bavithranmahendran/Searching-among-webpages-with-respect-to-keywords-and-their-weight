package hive;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class PageData {
            
    static List<List<Map>> p = new ArrayList<List<Map>>();

    public void setPageValues() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<Map> p1 = new ArrayList<Map>();
        map.put("ford", 3);
        map.put("car", 2);
        map.put("review", 1);
        p1.add(map);
        p.add(p1);

        map = new HashMap<String, Integer>();
        List<Map> p2 = new ArrayList<Map>();
        map.put("review", 3);
        map.put("car", 2);
        p2.add(map);
        p.add(p2);

        map = new HashMap<String, Integer>();
        List<Map> p3 = new ArrayList<Map>();
        map.put("review", 3);
        map.put("ford", 2);
        p3.add(map);
        p.add(p3);

        map = new HashMap<String, Integer>();
        List<Map> p4 = new ArrayList<Map>();
        map.put("toyota", 3);
        map.put("car", 2);
        p4.add(map);
        p.add(p4);

        map = new HashMap<String, Integer>();
        List<Map> p5 = new ArrayList<Map>();
        map.put("honda", 3);
        map.put("car", 2);
        p5.add(map);
        p.add(p5);

        map = new HashMap<String, Integer>();
        List<Map> p6 = new ArrayList<Map>();
        map.put("car", 3);
        p6.add(map);
        p.add(p6);

        
    }

    public List<List<Map>> getPageValues(){
        return p;
    }

}