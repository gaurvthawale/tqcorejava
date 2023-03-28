package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"gaurav","pratik","omkar","milind"};
		
		List<String> al = Arrays.asList(arr);
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<>();
		Collections.addAll(al3, arr);
		System.out.println(al3);
		
		System.out.println("*********************ArrayList to Array ***************");
		
		Object[] arr1 = al2.toArray();
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = new String[al2.size()];
		al2.toArray(arr2);
		System.out.println(Arrays.toString(arr1));
		

	}

}
