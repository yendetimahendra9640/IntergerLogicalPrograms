package com.logicalprograms;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,89,100,159,0);
		
		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);
		

	}

}
