package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
// Creating instance of bean 'binarySearchImple'
// Creating instance of bean 'bubbleSortAlgorithm'
//Finished creating instance of bean 'bubbleSortAlgorithm' via Contructor
//Autowiring by type from bean name 'binarySearch' and bean name 'bubbleSortAlgorithm'

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
	//	BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		//BinarySearchImpl binarySearch = new BinarySearchImpl( bubbleSortAlgorithm);

		int[] numbers = {2,8,3,7};
		int result = binarySearch.binarySearch(numbers,8);
		System.out.println(result);
	}

}
