package com.hashing;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyWordRemoval {
	
	static Map<String,Integer> mp=new TreeMap<>();

	public static void main(String[] args) {
		String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations"; 
		String[] words=str.toLowerCase().split(" ");
		//countFreq(words);
	    removeWord(words);
	}
	   
	public static void countFreq(String[] words){
		
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
	public static void removeWord(String[] words) {
		String rw="avoidable";
		String[] str1 = new String[words.length-1];
		for(int j=0,i=0;j<words.length;j++){
			if(words[j].equals(rw)){
				words[j]=" ";
			//	str1[i]=words[j];
			}else {
				str1[i]=words[j];
			i++;	
			}
		}	
		for(int k=0;k<str1.length;k++) {
			System.out.print(str1[k]+" ");
			}
		
		
	}
}