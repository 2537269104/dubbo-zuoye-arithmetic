package com.liuhao.service.impl;

import com.liuhao.service.ArithmeticService;

public class ArithmeticServiceImpl implements ArithmeticService {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		
		return a-b;
	}

}
