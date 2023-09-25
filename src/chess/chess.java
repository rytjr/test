package chess;
import java.util.*;
import java.io.*;

public class chess {
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int min =0;
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i = 0; i < num1-7; i++) {
			s = bf.readLine();
			for(int j = 0; j < num2-7; j++) {
				for(int t = 0+i; t < 8+i; t++) {
					for(int e = 0+j; e < 8+j; e++) {
						if(j%2 == 0 && s.charAt(e) == 'B') {
							++min;
						}
						if(j%2 == 1 && s.charAt(e) == 'W') {
							++min;
						}
					}
				}
				int mm = 64-min;
				ar.add(mm);
				min = 0;
				for(int t = 0+i; t < 8+i; t++) {
					for(int e = 0+j; e < 8+j; e++) {
						if(j%2 == 0 && s.charAt(e) == 'W') {
							++min;
						}
						if(j%2 == 1 && s.charAt(e) == 'B') {
							++min;
						}
					}
				}
				mm = 64-min;
				ar.add(mm);
				min = 0;
			}
		}
		
		int result =Integer.MAX_VALUE;
		for(int i =0 ; i < ar.size(); i++) {
			result = Math.min(result, ar.get(i));
		}
		
		System.out.print(result);
		
	}
}