package com.levon.algorithms.datastructures;

public class PrefixEvl {
	static String expr = "7 4 * 3 +";
	Stack2<String> stack = new Stack2<>();
	
	public static void main(String[] args) {
		System.out.println(new PrefixEvl().evaluate(expr));
	}
	
	public int evaluate(String expr) {
		String[] chars = expr.split(" ");
		for (int i = 0; i < chars.length; i++) {
			if(isOperator(chars[i])) {
				String operand1 = stack.top();
				stack.pop();
				String operand2 = stack.top();
				stack.pop();
				String result = performOperation(operand2, operand1, chars[i]);
				stack.push(result);
			} else {
				stack.push(chars[i]);
			}
		}
		return Integer.parseInt(stack.top());
	}

	private String performOperation(String operand2, String operand1,
			String operator) {
		Integer result;
		switch (operator) {
		case "+":
			result = Integer.parseInt(operand2) + Integer.parseInt(operand1);
			break;
		case "-":
			result = Integer.parseInt(operand2) - Integer.parseInt(operand1);
			break;
		case "*":
			result = Integer.parseInt(operand2) * Integer.parseInt(operand1);
			break;
		case "/":
			result = Integer.parseInt(operand2) / Integer.parseInt(operand1);
			break;
		default:
			throw new AssertionError();
		}
		System.out.println("temporary result is: "+result);
		return result.toString();
		
	}

	private boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*")  || s.equals("/") ;
	}
	
}
