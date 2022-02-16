package com.Interface;

import basics.Person;

public class Businessman extends Person implements Richman , SocialWorker{
	private String name;
	private String address;
	@Override
	public void helpToOthers() {
		System.out.println("help To Others");
		
	}
	@Override
	public void earnmoney() {
		System.out.println("earn Money");
		
	}
	@Override
	public void donation() {
		System.out.println("give donation");
	}
	@Override
	public void party() {
		System.out.println("lets party");
		
	}


}
