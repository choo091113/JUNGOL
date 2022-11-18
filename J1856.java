import java.util.Scanner;

public class J1856 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 높이
		int m = sc.nextInt(); // 너비
	    int num = 0; 
	    int count = 0; // 줄
	    sc.close();
	    
	    while (true) {
	    	
	    	count++;
	    	for (int i = 0; i < m; i++) {
	    		System.out.print(++num + " ");
	    	}
	    	
	    	if (count == n) break;
	    	num = num + m;
	    	System.out.println();
	    	
	    	
	    	count++;
	    	for (int j = 0; j < m; j++) {
	    		System.out.print(num-- + " ");
	    	} 
	    	
	    	if (count == n) break;
	    	num = num + m;
	    	System.out.println();
	    }
}
}
