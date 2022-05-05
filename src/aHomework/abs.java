package aHomework;

import amyself.zzz;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public  class abs {
    public  void main(String[] args) {
    Map<Integer,String> a = new HashMap<>();
    a.put(1,"a");
    a.put(2,"b");
    a.put(3,"c");
    a.put(4,"d");
    int df = 'c';

    for(Integer key : a.keySet()){
        if(key % 2 == 0 ){
            System.out.println(a.get(key));
        }
    }

    }



    }

