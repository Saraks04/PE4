package com.stackroute.pe4;
import java.util.HashSet;
import java.util.Set;
public class LongestString 
{
	    public static final int CHAR_RANGE = 128;
		public String func(String s) 
		{

			if(s==null) {
				return null;}
			
		    	int k=2;
		        int end = 0, begin = 0;

		        Set<Character> window = new HashSet();

		        int[] freq = new int[CHAR_RANGE];

		        for (int low = 0, high = 0; high < s.length(); high++)
		        {
		            window.add(s.charAt(high));
		            freq[s.charAt(high)]++;
		            while (window.size() > k)
		            {

		                if (--freq[s.charAt(low)] == 0) 
		                {
		                    window.remove(s.charAt(low));
		                }

		                low++;       
		            }
		            
		            if (end - begin < high - low)
		            {
		                end = high;
		                begin = low;
		            }
		        }

		        return s.substring(begin, end + 1);
			
		}

}
