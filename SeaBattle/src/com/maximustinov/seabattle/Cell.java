package com.maximustinov.seabattle;

/**
 * Клетка игрового поля
 */
public interface Cell {
	/**
	 * Инициализирует клетку 
	 * @param number - номер клетки на поле
	 */
	public void init(int number);
	
	/**
	 * Возвращает номер клетки на поле
	 * @return номер клетки на поле
	 */
	public int getNumber();
}
