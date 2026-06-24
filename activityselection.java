import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int[] start={1,2,4,5,6,9};
	int[] end={2,5,5,7,8,11};
	
	int count=1;
	int lastEnd=end[0];
	for(int i=1;i<start.length;i++)
	{
	    if(start[i]>=lastEnd){
	        count++;
	        lastEnd=end[i];

	    }
	}
	System.out.println(count);
	}
}
