package com.maximustinov.seabattle;

import com.maximustinov.seabattle.basic.WrongArgumentException;

/**
 * Игровое поле.
 * У каждого игрока в игре Морской бой есть свое поле, на котором расставлены его корабли
 */
public interface Field {	
	/* public abstract is ommited while presented anyway through out a compilation process */
	int getWidth();
	
	public int getHeight();
	
	/**
	 * Добавить корабль на поле
	 * @param cells - номера ячеек, на которые установить корабль. Определяют длину корабля
	 * @throws WrongArgumentException
	 */
	public void addShip(int[] cells) throws WrongArgumentException;
	
	/**
	 * Ударить по клетке поля указанной пулей
	 * @param cellNumber - номер клетки, по которой наносить удар
	 * @param bullet - пуля, которой наносят удар
	 */
	public void hit(int cellNumber, Bullet bullet);
	
	/**
	 * Возвращает число установленных кораблей на поле
	 * @return  число установленных кораблей на поле
	 */
	public int getInstantiatedShipsCount();
	
	/**
	 * Возвращает число оставшихся (непотопленных) кораблей на поле
	 * @return число оставшихся (непотопленных) кораблей на поле
	 */
	public int getAvailableShipsCount();
}
