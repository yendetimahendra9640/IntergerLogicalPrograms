package com.logicalprograms;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Startingwithone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,22,33,44,55,66,77,88,99,12,12,13,14,15,16,100,101,103,04);
		
		list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
