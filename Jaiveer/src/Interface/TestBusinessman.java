package com.Interface;

public class TestBusinessman {
public static void main(String[] args) {
	Richman r = new Businessman();
	r.donation();
	SocialWorker s = new Businessman();
	s.helpToOthers();
	Businessman b = new Businessman();
	b.earnmoney();
	b.donation();
	b.party();
	b.helpToOthers();
}
}
