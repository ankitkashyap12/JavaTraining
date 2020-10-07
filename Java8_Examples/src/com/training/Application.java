package com.training;

import com.training.utils.Converter;
import com.training.utils.LambdaService;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Application {

	public static void main(String[] args) {
		LambdaService lm=new LambdaService();
		lm.usingWithoutLambda();
		lm.usingWithLambda();
		
		Converter<Double, Double> usdToInr=(usd->usd*70);
		System.out.println(usdToInr.convert(88.00));
		
		Consumer<String> consumer=(val)->{System.out.println(val);};
		Consumer<Integer> consumer1=(val)->{System.out.println(val);};
		
		List<Integer> ageList= Arrays.asList(50,60,30,20,70);
		ageList.forEach(System.out::println);
	}

}
