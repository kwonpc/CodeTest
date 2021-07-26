package skb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		int[] posA = {1, 18, 30, 44, 58};
		int[] posB = {23, 50, 60};
		int[] posC = {35, 42, 54, 63};
	
		System.out.println(solution(posA, posB, posC));
	}
	
    public static String solution(int[] posA, int[] posB, int[] posC) {
    	
    	int[] posAll = new int[posA.length+posB.length+posC.length];
    	HashMap map = new HashMap();
    	HashMap posanddist = new HashMap();
    	
    	int seq=0;
    	for(int i:posA){
    		map.put(i, "A");
    		posAll[seq]=i;
    		seq++;
    	}
    	for(int i:posB){
    		map.put(i, "B");
    		posAll[seq]=i;
    		seq++;
    	}
    	for(int i:posC){
    		map.put(i, "C");
    		posAll[seq]=i;
    		seq++;
    	}
    	    	
    	Arrays.sort(posAll);
        for(int i=2;i<posAll.length;i++){
        	if(!map.get(posAll[i-2]).equals(map.get(posAll[i-1])) && !map.get(posAll[i-1]).equals(map.get(posAll[i]))){
        		System.out.println(posAll[i-2] +", " +posAll[i]);
        		System.out.println(posAll[i]-posAll[i-2]);
        		posanddist.put(posAll[i]-posAll[i-2], posAll[i-2] +", " +posAll[i]);
        	}
        }
    	
        Collection cols = posanddist.keySet();
        List temps = new ArrayList(cols);        
        Collections.sort(temps);

    	return (String)posanddist.get((Integer)temps.get(0))+"에 있고 거리는 "+(Integer)temps.get(0)+"이다";        
    }    	
}
