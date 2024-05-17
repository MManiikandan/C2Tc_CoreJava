package com.tnsif.dayten;

public class ArrayOperations {
      public static int[] oddEvenArray(int[] array) {
    	  int oddcount=0;
    	  int evencount=0;
    	  for(int i=0;i<array.length;i++) {
    		  if(array[i]%2==0) {
    			  evencount++; 
    		  }
    		  else {
    		  oddcount++; 
    		  }
    	  }
    	  return new int[] {oddcount,evencount};
      }
}
