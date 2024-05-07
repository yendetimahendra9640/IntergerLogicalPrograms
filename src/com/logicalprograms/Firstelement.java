package com.logicalprograms;

import java.util.Arrays;
import java.util.List;

public class Firstelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(100,1,2,3,4,5,66,66,66,667,8,90);
		
		int element=list.stream().findFirst().get();
		
		System.out.println(element);
		

	}

}
