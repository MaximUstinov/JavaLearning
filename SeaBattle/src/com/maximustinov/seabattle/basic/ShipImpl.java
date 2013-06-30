package com.maximustinov.seabattle.basic;

import com.maximustinov.seabattle.Ship;

public class ShipImpl implements Ship {
	private int size;
	private Direction direction;
	
	@Override
	public void init(int size, Direction direction) {
		this.size = size;
		this.direction = direction;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

}
