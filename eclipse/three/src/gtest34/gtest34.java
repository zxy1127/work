package gtest34;

import java.util. Arrays;
import java.util.Scanner;

public class gtest34 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 String a=input.next();
		 char[] arrayCh=a.toCharArray();
		 Arrays.sort(arrayCh);
		 String sortedStr=new String(arrayCh);
		 System.out.println(sortedStr);
		 input.close();

	}

}
