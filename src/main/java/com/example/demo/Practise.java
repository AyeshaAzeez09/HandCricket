package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practise {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b= 60;
		
		System.out.println(a+b);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(1);
		
		
		System.out.println(list.stream().filter(x -> x >10).collect(Collectors.toMap(x->x, x->x*x)));

	}

}
