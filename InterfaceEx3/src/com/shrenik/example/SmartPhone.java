package com.shrenik.example;

public class SmartPhone extends Gadget{

	@Override
	public void create() {
		System.out.println("Smart Phone Object Created..");
	}

	@Override
	public void remove() {
		System.out.println("Smart Phone Deleted..");
	}

	@Override
	public void show() {
		System.out.println("Smart Phone Object using show Function..");
	}
}
