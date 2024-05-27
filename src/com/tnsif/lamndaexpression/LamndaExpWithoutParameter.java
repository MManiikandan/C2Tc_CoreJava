package com.tnsif.lamndaexpression;
/*

 */
public class LamndaExpWithoutParameter {
   public static void main(String args[]) {
	   Statement st=()->"This is LamndaExpWithoutParameter";
	   System.out.println(st.show());
   }
}
