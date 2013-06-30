package com.maximustinov.seabattle;

/**
 * Игрок
 */
public interface Player {
	/**
	 * Возвращает имя игрока
	 * @return имя игрока
	 */
	public String getName();
	
	/**
	 * Задает рейтинг игрока
	 * @param value - рейтинг
	 */
	public void setRating(int value);
	
	/**
	 * Возвращает рейтинг игрока
	 * @return рейтинг
	 */
	public String getRating();
}
