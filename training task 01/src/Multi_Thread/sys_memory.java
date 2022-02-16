package Multi_Thread;
import java.util.*;

public class sys_memory {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			Runtime r = Runtime.getRuntime();
			String[] temp;
			System.out.println("Before gc():");
			System.out.println("Max Memory: "+r.maxMemory());
			System.out.println("Total Memory: "+r.totalMemory());
			System.out.println("Free Memory: "+r.freeMemory());
			System.out.println("Actual Free Memory: "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));
			System.gc(); // corrects values
			System.out.println("After gc():");
			System.out.println("Max Memory: "+r.maxMemory());
			System.out.println("Total Memory: "+r.totalMemory());
			System.out.println("Free Memory: "+r.freeMemory());
			System.out.println("Actual Free Memory: "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));
			temp = new String[10000000];
			for(int i=0; i<10000000; i++) {
				temp[i] = UUID.randomUUID().toString();
			}
			System.out.println("After 10000000 instance:");
			System.out.println("Max Memory: "+r.maxMemory());
			System.out.println("Total Memory: "+r.totalMemory());
			System.out.println("Free Memory: "+r.freeMemory());
			System.out.println("Actual Free Memory: "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));
			temp = null;
			System.out.println("After null:");
			System.out.println("Max Memory: "+r.maxMemory());
			System.out.println("Total Memory: "+r.totalMemory());
			System.out.println("Free Memory: "+r.freeMemory());
			System.out.println("Actual Free Memory: "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));
			System.gc();
			System.out.println("After gc():");
			System.out.println("Max Memory: "+r.maxMemory());
			System.out.println("Total Memory: "+r.totalMemory());
			System.out.println("Free Memory: "+r.freeMemory());
			System.out.println("Actual Free Memory: "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));
	}

}
