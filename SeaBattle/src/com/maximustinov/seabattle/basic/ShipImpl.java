package com.maximustinov.seabattle.basic;

import com.maximustinov.seabattle.Ship;

public class ShipImpl implements Ship {
	private int size;
	private Direction direction;
	/* количество неподбитых палуб */
	private int lifeDecksCount;
	
	@Override
	public void init(int size, Direction direction) {
		this.size = size;
		this.lifeDecksCount = this.size;
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

	@Override
	public boolean isAlive() {
		/* перепишите реализацию метода, чтобы он возвращал состояние корабля - жив или нет
		 * используйте поле класса lifeDecksCount (см. как оно используется в методе hit() )
		 */
		return false;
	}

	@Override
	public void hit() {
		lifeDecksCount--;
	}

}
