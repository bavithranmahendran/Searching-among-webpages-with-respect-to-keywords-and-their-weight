package hive;

import java.util.*;
import hive.PageData;
import hive.QueryData;
import hive.Calculation;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Controller{

    //final static int MAX_PAGE_KEYWORDS=3;
    //final static int MAX_QUERY_KEYWORDS=3;    
     
    
    public static void main(String []args){

        int i=0;
        int j=1;
        List<Map> Q = new ArrayList<Map>();
        
        PageData pp= new PageData();
        QueryData qq= new QueryData();
        Calculation calc= new Calculation();
        pp.setPageValues();
        qq.setQueryValues();
        List<List<Map>> pageData= pp.getPageValues(); 
        List<List<Map>> queryData= qq.getQueryValues(); 
        
        
        System.out.println("/-------------------------------------/");
               
        
        for (List<Map> quries: queryData) {           
            Map<String, Integer> m= new HashMap<String, Integer>();
            for(Map<String,Integer> qureyList: quries) {
                for(HashMap.Entry<String,Integer> entry:qureyList.entrySet()) {
                    Map<String, Integer> map= new HashMap<String, Integer>();
                    map= calc.queryValidation(entry.getKey(),entry.getValue());
                    
                    
                        for(HashMap.Entry<String,Integer> ent:map.entrySet()){
                            String key = ent.getKey();
                            Integer value = ent.getValue();
                            if(m.get(key)!=null){
                               value+=m.get(key);
                            }m.put(key,value);
                        }
                }
            
            }
            m = m
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                    toMap(e ->e.getKey(),e->e.getValue(), (e1,e2) ->e2,
                        LinkedHashMap::new));
            m = m
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                    toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) ->e2,
                        LinkedHashMap::new));
            Q.add(m); 
        }         
        for(Map<String, Integer> r:Q){
            System.out.print("Q"+j+": ");
            for(HashMap.Entry<String, Integer> entry:r.entrySet()){
                if(j>5){
                    break;
                }else{
                System.out.print(entry.getKey()+" ");
                }
            }
            j++;
            System.out.println();
        }
    }

}

