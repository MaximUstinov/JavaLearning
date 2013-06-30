package com.maximustinov.seabattle.basic;

import com.maximustinov.seabattle.Bullet;
import com.maximustinov.seabattle.Field;

public class FieldImpl implements Field {
	private int width = Integer.MIN_VALUE;
	private int height = Integer.MIN_VALUE;
	
	public FieldImpl(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void hit(int cellNumber, Bullet bullet) throws NullPointerException {
		if(bullet == null){
			throw new NullPointerException("no bullet");
		}
	}

	@Override
	public int getInstantiatedShipsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAvailableShipsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWoundedShipsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
