package com.tnsif.lamndaexpression;

@FunctionalInterface
//only one abstract method 
public interface Message {
     public String greet(String name);
}
