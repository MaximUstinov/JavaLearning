package com.maximustinov.seabattle;

public interface Bullet {
	/**
	 * Инициализирует ядро
	 * @param size - размер ядра
	 * @throws IllegalArgumentException
	 */
	public void init(int size) throws IllegalArgumentException;
	
	/**
	 * Возвращает размер ядра
	 * @return размер ядра
	 */
	public int getSize();
	
	
}
