package com.tnsif.streamAPI;

import java.util.Arrays;
public class ArrayStream {
	ArrayStream(){
		int arr[]= {10,8,4,5,6};
		System.out.println(Arrays.stream(arr).count());
		Arrays.stream(arr).sorted().forEach(no->System.out.print(no+" "));      
	}
}
