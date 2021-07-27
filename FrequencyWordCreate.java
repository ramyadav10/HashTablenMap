package com.hashing;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyWordCreate {
	
	static Map<String,Integer> mp=new TreeMap<>();

	public static void main(String[] args) {
		String str = "To be or not to be"; 
	    countFreq(str);
	}
	   
	static void countFreq(String str){
		
        String[] words=str.toLowerCase().split(" ");
 
        // Loop to iterate over the words
        for(int i=0;i<words.length;i++){
        	
            if(mp.containsKey(words[i]))
            {
                mp.put(words[i], mp.get(words[i])+1);
            }
            else
            {
                mp.put(words[i],1);
            }
        }
        
        for(Map.Entry<String,Integer> freq:mp.entrySet())
        {
            System.out.println(freq.getKey()+" - "+freq.getValue());
        }
    }
 
}