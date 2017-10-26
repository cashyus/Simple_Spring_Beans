package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService{

	//defines the language here on what the fortuneservice method will send to the coach classess
	public String getFortune(){
		return "Today is your lucky day!";
	}
}
