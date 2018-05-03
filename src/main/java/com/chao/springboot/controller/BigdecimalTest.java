package com.chao.springboot.controller;

import java.math.BigDecimal;

public class BigdecimalTest {

	public static void main(String[] args) {
		Double num = 2.525;
		BigDecimal bd =  new BigDecimal(num);
		System.out.println("num:"+bd.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());
	}
}
