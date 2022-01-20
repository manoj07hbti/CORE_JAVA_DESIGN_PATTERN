package com.example.strategy.strategy;

import com.example.strategy.strategy.model.AdditionStrategy;
import com.example.strategy.strategy.model.Context;
import com.example.strategy.strategy.model.MultiplicationStrategy;
import com.example.strategy.strategy.model.SubstractStrategy;

public class StrategyApplication {

	public static void main(String[] args) {

		Context additionContext = new Context(new AdditionStrategy());
		System.out.println("Addition Context: 10 + 2 = " + additionContext.execute(10, 2));

		Context substractContext = new Context(new SubstractStrategy());
		System.out.println("Substract Context: 10 - 2 = " + substractContext.execute(10, 2));

		Context multiplicationContext = new Context(new MultiplicationStrategy());
		System.out.println("Multiplication Context: 10 * 2 = " + multiplicationContext.execute(10, 2));
	}

}
