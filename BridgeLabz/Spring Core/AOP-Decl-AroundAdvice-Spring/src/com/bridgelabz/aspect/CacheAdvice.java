package com.bridgelabz.aspect;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import MethodI

public class CacheAdvice  implements MethodInterceptor{
	Map<String, Object> cache = new HashMap<String, Object>();

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
