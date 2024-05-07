package com.logicalprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainDuplicates {
	
	public boolean content(int[] nums) {
   
		
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		Set set = new HashSet(list);
		
		if ( set.size() == list.size()) {
			return true;
		}
		return false;
		
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums1 = {1,2,3,4,5,5};
		ContainDuplicates cs = new ContainDuplicates();
		cs.content(nums1);
		
		
		
	}

	
}
