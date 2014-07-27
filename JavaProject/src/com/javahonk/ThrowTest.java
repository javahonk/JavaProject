package com.javahonk;

public class ThrowTest {

	public static void main(String[] args) {
		
		try {
			int i = 3/0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			System.out.println("finally");
		}

	}

}
