package com.maximustinov.seabattle;

public interface Game {
	public void init(String[] players, int fieldWidth, int fieldHeight);
	
	/**
	 * Добавить корабль на поле
	 * @param player - имя игрока владеющего полем
	 * @param size - размер корабля
	 * @param coordinate - координата корабля, номер ячейки на поле
	 * @param direction - направление корабля: горизонтальное или вертикальное
	 */
	public void addShip(String player, int size, int coordinate, Ship.Direction direction);
	
	/**
	 * Ударить по полю игрока
	 * @param player - игрок, чье поле подвергается атаке
	 * @param cellNumber - номер ячейки на атакуемом поле
	 * @param bulletSize - размер пули
	 */
	public void hit(String player, int cellNumber, int bulletSize);
	
	/**
	 * Получить состояние игры: представление игроков, расстановка кораблей, бой, игра завершена
	 * @return текущее состояние игры
	 */
	public String getState();
}
