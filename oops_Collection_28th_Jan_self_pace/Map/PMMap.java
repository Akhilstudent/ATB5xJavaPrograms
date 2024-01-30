package oops_Collection_28th_Jan_self_pace.Map;

import java.util.HashMap;
import java.util.Map;

public class PMMap {
    public static void main(String[] args) {

        String msg = "Hi Pramod Dutta, How are you Pramod ?";

        Map<String, Integer> wordMap = new HashMap<>();
        String[] words = msg.split(" ");

        for (String s  : words){
            Integer count = wordMap.get(s);
            if( count == null){
                wordMap.put(s,1);
            }else {
                wordMap.put(s,count+1);
            }
        }

        System.out.println(wordMap);
    }
}
