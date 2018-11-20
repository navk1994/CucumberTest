package com.qa.CucumberTest;

import java.util.Stack;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StackSteps {

	private Stack myStack;
	private Object pushed;
	private Object popped;

	@Given("^an empty stack$")
	public void an_empty_stack() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		myStack = new Stack();
	
		
	}

	@When("^I push an item into the stack$")
	public void i_push_an_item_into_the_stack() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		myStack.push("apple");
		
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(1, myStack.size());
		
	}

	@When("^I push another item into the stack$")
	public void i_push_another_item_into_the_stack() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		myStack.push("orange");
		
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(2, myStack.size());
		
	}

	@When("^I pop from the stack$")
	public void i_pop_from_the_stack() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		popped = myStack.pop();

	}

	@Then("^I get the same item back$")
	public void i_get_the_same_item_back() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("apple", popped);
	
	}

	@Given("^a stack with (\\d+) items$")
	public void a_stack_with_items(int arg1) throws Throwable {
		myStack = new Stack();
		for(int i = 0; i <=2; i++) 
		{
			myStack.push(1);
		}
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}