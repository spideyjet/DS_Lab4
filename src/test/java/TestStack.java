import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {
	
	private MyStack<String> stack;
	
	@BeforeEach
	void setUp() {
		stack = new MyStack<>();
	}

	@Test
	void testPop() {
		
		assertTrue(stack.isEmpty());
		
		stack.push("A");
		stack.push("B");
		assertEquals("B", stack.top());
		stack.push("C");
		assertEquals("C", stack.top());
		
		assertFalse(stack.isEmpty());
		
		assertEquals("C", stack.pop());
		assertEquals("B", stack.pop());
		assertEquals("A", stack.pop());
		
		assertTrue(stack.isEmpty());
		
		assertThrows(StackUnderFlowException.class, () ->
		{
			stack.pop();
		});
		
		assertThrows(StackUnderFlowException.class, () ->
		{
			stack.top();
		});
			
	}
	
}
