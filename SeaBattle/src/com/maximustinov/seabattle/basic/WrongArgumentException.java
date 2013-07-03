package com.maximustinov.seabattle.basic;

public class WrongArgumentException extends Exception {
	private static final long serialVersionUID = 8473364850013072597L;
	
	public WrongArgumentException(String message){
		super(message);
	}
}
