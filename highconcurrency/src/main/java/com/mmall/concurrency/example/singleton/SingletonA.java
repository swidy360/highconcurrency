package com.mmall.concurrency.example.singleton;

//双重入锁方式
public class SingletonA {

	private SingletonA() {

	} 
	private volatile static SingletonA instance = null;

	public static SingletonA getInstance() {
		if (instance == null) {
			synchronized (SingletonA.class) {
				if (instance == null) {
					instance = new SingletonA();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		System.out.println(getInstance().hashCode());
		System.out.println(getInstance().hashCode());
		System.out.println(TestA());
		
	}
	
	public static int  TestA(){
		try {
			int a = 234;
			return a;
			
		} catch (Exception e) {
			System.out.println("1343");
		}finally{
			System.out.println("finally");
		}
		return 13;
	}
}
