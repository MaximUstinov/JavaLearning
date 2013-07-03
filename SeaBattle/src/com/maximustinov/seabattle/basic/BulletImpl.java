package com.maximustinov.seabattle.basic;

import com.maximustinov.seabattle.Bullet;

public class BulletImpl implements Bullet{
	private int size;
	
	public void init (int size){
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}
}
