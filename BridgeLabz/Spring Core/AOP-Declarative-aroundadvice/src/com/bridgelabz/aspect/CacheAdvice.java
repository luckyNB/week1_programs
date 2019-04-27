package com.bridgelabz.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor{

	Map<String,Object> cache=new HashMap<String,Object>();
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
	String key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
	Object retValue=null;
	if(!cache.containsKey(key)) {
 cache.put(key, retValue);
 System.out.println("CacheAdvice.invoke()::from target method");
	return retValue;
	}
	retValue=cache.get(key);
	System.out.println("CacheAdvice.invoke()::From cache");
		
		
		return retValue;
	}

}
