package com.logicalprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,1,1,0,98,98,88,90);
		
		Set set = new HashSet();
		
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

	}

}
