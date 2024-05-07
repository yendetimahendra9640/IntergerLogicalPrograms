package com.logicalprograms;

import java.util.Arrays;
import java.util.List;

public class Fibdtotalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2,1,3,4,4,54,5,5,3,44,55,66,77,11);
		
		long count =list.stream().count();
		System.out.println(count);

	}

}
