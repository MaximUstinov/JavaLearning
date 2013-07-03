package com.maximustinov.seabattle;

public interface Ship {
	public enum Direction { horizontal, vertical };
	
	/**
	 * Инициализирует корабль
	 * @param size - размер корабля, количество палуб
	 * @param direction - расположение: горизонтальное или вертикальное
	 */
	public void init(int size, Direction direction);
	
	/**
	 * Возвращает размер корабля
	 * @return размер корабля
	 */
	public int getSize();
	
	/**
	 * Возвращает располодение корабля
	 * @return расположение
	 */
	public Direction getDirection();
	
	/**
	 * Нанести удар по кораблю
	 */
	public void hit();
	
	/**
	 * Возвращает состояние корабля - потоплен или нет
	 * @return состояние корабля
	 */
	public boolean isAlive();
}
