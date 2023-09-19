package chess;
import java.util.*;
import java.io.*;

public class chess {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int scnum = sc.nextInt();
		int scnum2 = sc.nextInt();
		
		String[][] list = new String[scnum][scnum2];
		
		int sum = 0;
		
		for(int i = 0; i < scnum; i++) {
			String[] name = sc.next().split("");
			for(int j = 0; j < scnum2; j++) {
				list[i][j] = name[j];
			}
		}
		
		String[] li =  { "WBWBWBWB" , "BWBWBWBW" , "WBWBWBWB" , "BWBWBWBW" , "WBWBWBWB" , "BWBWBWBW" , "WBWBWBWB" , "BWBWBWBW"};
		
		String[] li2 =  { "BWBWBWBW" , "WBWBWBWB" , "BWBWBWBW" , "WBWBWBWB" , "BWBWBWBW" , "WBWBWBWB" , "BWBWBWBW", "WBWBWBWB"};
		
        String[][] list2 = new String[8][8];
		
		for(int i = 0; i < 8; i++) {
			String[] name = li[i].split("");
			for(int j = 0; j < 8; j++) {
				list2[i][j] = name[j];
			}
		}
		
        String[][] list3 = new String[8][8];
		
		for(int i = 0; i < 8; i++) {
			String[] name = li2[i].split("");
			for(int j = 0; j < 8; j++) {
				list3[i][j] = name[j];
			}
		}
		
		ArrayList<Integer> number  = new ArrayList<Integer>();
		
		for(int t = 0; t < scnum-7; t++) {
			for(int e = 0; e < scnum2-7; e++) {
				
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(list[i+t][j+e].equals(list2[i][j])) {
							++sum;
						}
					}
				}
				int numm = 64-sum;
				sum = 0;
				
				number.add(numm);
				
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(list[i+t][j+e].equals(list3[i][j])) {
							++sum;
						}
					}
				}
				numm = 64-sum;
				sum = 0;
				number.add(numm);
			}
		}
		
		int result = 0;
		
		for(int i = 0; i < number.size(); i++) {
			 result = number.get(0);
			if(number.get(i) < result) {
				result = number.get(i);
			}
		}
		
		System.out.print(result);
		
		
		
	}
}