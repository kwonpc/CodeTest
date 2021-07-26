package skb;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		int count = 5;
		int[][] gPoint = {{8, 3}, {7, -4}, {8, 1}, {-2, 1}, {6, -2}};
		
		System.out.println(solution(gPoint, count));		
	}
	
    public static int solution(int[][] gPoint, int count) {
    	
    	int total = 0;
    	
    	int x = 0;
    	int y = 0;
    	for(int[] nextPoint:gPoint){
    		
    		int[] tempDistance = new int[2];
    		tempDistance[0] = Math.abs(nextPoint[0]-x);
    		tempDistance[1] = Math.abs(nextPoint[1]-y);
    		
    		Arrays.sort(tempDistance);
    		total += tempDistance[0];
    		
    		x=nextPoint[0];
    		y=nextPoint[1];
    	}
    	
    	return total;
    }
    
    public static double getDistance(int x, int y, int x1, int y1){

    	return Math.sqrt(Math.pow(Math.abs(x1-x), 2) + Math.pow(Math.abs(y1-y), 2));

   	}


}
