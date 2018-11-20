package com.qa.CucumberTest;

import java.util.Stack;

public class StackExample {

	private Stack stack = new Stack();
	
	public StackExample() {
		
	}

	public Object pop() {
		return stack.pop();
	}

	public void push(Object o) {
		stack.push(o);
	}

	public int size() {
		return stack.size();
	}
}
