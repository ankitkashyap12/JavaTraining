package com.training.utils;

@FunctionalInterface
public interface Converter<T,R>{
	
	public R convert(T t);

}
