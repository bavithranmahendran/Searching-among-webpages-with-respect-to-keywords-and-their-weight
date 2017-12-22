package hive;

import java.util.*;

public class QueryData{

    static List<List<Map>> q = new ArrayList<List<Map>>();

    public void setQueryValues(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<Map> q1 = new ArrayList<Map>();
        map.put("ford",3);
        q1.add(map);
        q.add(q1);

        map = new HashMap<String, Integer>();
        List<Map> q2 = new ArrayList<Map>();
        map.put("car",3);
        q2.add(map);
        q.add(q2);

        map = new HashMap<String, Integer>();
        List<Map> q3 = new ArrayList<Map>();
        map.put("review",3);
        q3.add(map);
        q.add(q3);

        map = new HashMap<String, Integer>();
        List<Map> q4 = new ArrayList<Map>();
        map.put("ford",3);
        map.put("review",2);
        q4.add(map);
        q.add(q4);

        map = new HashMap<String, Integer>();
        List<Map> q5 = new ArrayList<Map>();
        map.put("ford",3);
        map.put("car",2);
        q5.add(map);
        q.add(q5);

        map = new HashMap<String, Integer>();
        List<Map> q6 = new ArrayList<Map>();
        map.put("cooking",3);
        map.put("french",2);
        q6.add(map);
        q.add(q6);        
    }

    public List<List<Map>> getQueryValues(){
        return q;
    }

}