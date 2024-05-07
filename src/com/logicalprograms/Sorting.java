package com.logicalprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list  = Arrays.asList(1,200,200,2,3,4,5,6,7,8,90,0);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

// Added some comments

	}

}
