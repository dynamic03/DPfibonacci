import java.util.Hashtable;
public class DPfibonacci {
	public static Hashtable<Long,Long> memo=new Hashtable<Long,Long>();
	public static long fib(Long num){
		if(!memo.containsKey(num)){
			memo.put(num, fib(num-1)+fib(num-2));
		}
		return memo.get(num);
	}
public static void main(String args[]){
	
	memo.put((long)0,(long)0); 
	memo.put((long)1,(long)1);
	for(long i=0;i<50;i++)
	System.out.println(fib((long)i));
}	
}
