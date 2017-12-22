package hive;

import java.util.*;
import hive.QueryData;
import hive.PageData;

public class Calculation{

  
    PageData pp= new PageData();
    List<List<Map>> pageData= pp.getPageValues();
    public Map<String, Integer> queryValidation(String key,Integer value){
        int i=1;
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (List<Map> pages: pageData) {       
            for(Map<String,Integer> pageList: pages) {                
             for(HashMap.Entry<String,Integer> entry:pageList.entrySet()) {
                 if(entry.getKey().equals(key)){                      
                    Integer v= value*entry.getValue();                    
                    m.put("p"+i,v);                                                        
                 }                 
                }
                i++;               
            }                                    
        }       
        return m;
    }

}