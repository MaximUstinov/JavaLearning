package com.maximustinov.seabattle.basic;

import com.maximustinov.seabattle.Cell;

public class CellImpl implements Cell{
	private int number;
	
	public void init (int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
}
