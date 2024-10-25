package com.Unit_Testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MyMathTest {

	@Test
	void test() {
		int[] numbers ={1,2,3};
		MyMath myMath = new MyMath();
		int result  = myMath.calculateSum(numbers);
		int expectResult = 6;
		assertEquals(expectResult,result);
		System.out.println(result);
	}

	MyMath myMath = new MyMath();
	@Test
	void test_calculate_Three_Np() {
        assertEquals(6, myMath.calculateSum(new int[]{1,2,3}));
	}

	@Test
	void test_calculate_Zero_no() {
		int[] numbers ={};
		int result  = myMath.calculateSum(numbers);
		int expectResult = 0;
		assertEquals(expectResult,result);
		System.out.println(result);
	}



}
