package com.mmall.concurrency.example.singleton;

public class SingletonB {

	private SingletonB(){
		
	}
	
	public static SingletonB getInstance(){
		return Singleton.INSTANCE.getInstance();
	}
	
	public enum Singleton{
		INSTANCE;
		
		private SingletonB instance = null;
		
		Singleton(){
			instance = new SingletonB();
		}
		
		public SingletonB getInstance(){
			return instance;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonB.getInstance().hashCode());
		System.out.println(SingletonB.getInstance().hashCode());
	}
	
}
