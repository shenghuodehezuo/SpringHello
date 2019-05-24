/**
 * <p>Title: speltest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-17  
* @version 1.0  
 */
package com.coffee.spring.s05.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author hp
 *
 */
public class speltest {
public static void main(String[] args) {
	ExpressionParser parser=new SpelExpressionParser();
	Expression expression=parser.parseExpression("('Hello'+'World').concat(#end)");
	EvaluationContext context=new StandardEvaluationContext();
	context.setVariable("end", "liuwei");
	System.out.println(expression.getValue(context));
}
}
