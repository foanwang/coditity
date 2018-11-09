import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leecode {
	
	public int numJewelsInStones(String J, String S) {
        int reply = 0;
        Set<Character> jset = new HashSet<Character>();
        for(int i = 0;i < J.length();i++){
            jset.add(J.charAt(i));
        }
        for(int i = 0; i < S.length();i++){
            if(jset.contains(S.charAt(i))){
                reply+=1;
            }
        }
        return reply; 
    }
  
  	public int numUniqueEmails(String[] emails) {
  		Set<String> check =  new HashSet<String>();
  		for(int i = 0; i < emails.length; i++) {
  			String localname = emails[i].substring(0, emails[i].indexOf('@'));
  			String domain = emails[i].substring(emails[i].indexOf('@'), emails[i].length());
  			if(localname.contains("+")) {
  				localname=localname.substring(0, localname.indexOf("+"));
  			}
  			localname = localname.replace(".","");
  			check.add(localname+domain);
  		}
  		for(String parm: check) {
  			System.out.println(parm);
  		} 
  		return check.size();
    }
	public String toLowerCase(String str) {
		
  		return str.toLowerCase();
    }
	
    public int uniqueMorseRepresentations(String[] words) {
    	String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	Set<String> reply = new HashSet<String>();
    	for(String str: words) {
    		char[] chararray = str.toCharArray();
    		String tes ="";
    		for(int i = 0; i< chararray.length; i++) {
    			tes += morse[(int)chararray[i]-(int)'a'];
    		}
    		reply.add(tes);
    	}
    	return reply.size();
    }
    
    public int[] sortArrayByParity(int[] A) {
    	int pos = 0;
    	for(int i = 0;i < A.length; i++){
    		if(A[i] % 2 == 0) {
    			int temp = A[i];
    			A[i] = A[pos];
    			A[pos] = temp;
    			pos+=1;
    		}
    	}
    	return A;
    }
    
    public int hammingDistance(int x, int y) {
    	int reply = 0;
		int value = x ^ y;
		while(value != 0) {
			count+=1;
			value &= value -1;
		}
    	return reply;
    }
    
    
    
    public static void ShowfunctionForInt(int[] input) {
    	int count = 0;
    	for(int temp: input) {
    		System.out.println("input["+count+"]: "+ temp);
    		count+=1;
    	}
    }
    
    public static < T > void Showfunction(T[] input) {
    	int count = 0;
    	for(T temp:input) {
    		System.out.println("input["+count+"]: "+ temp);
    		count+=1;
    	}
    }
    
	public static void main(String[] args) {
		leecode temp = new leecode();
		Integer[] intarry = new Integer[]{3,1,2,4};
		System.out.println("reply:"+hammingDistance(1, 4));
	}
}
