package com.maximustinov.seabattle.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.maximustinov.seabattle.Bullet;
import com.maximustinov.seabattle.Field;
import com.maximustinov.seabattle.Cell;
import com.maximustinov.seabattle.Ship;

public class FieldImpl implements Field {
	public final int MAX_ALLOWED_FIELD_SIDE_SIZE = 100;
	private int width = Integer.MIN_VALUE;
	private int height = Integer.MIN_VALUE;
	
	/* ячейки поля */
	private List<Cell> cells;
	/* корабли на поле 
	 * ключ - номер ячейки на поле
	 * значение - корабль, который стоит на этой ячейке
	 * */
	private Map<Integer, Ship> shipsMap = new HashMap<Integer, Ship>();
	/* множество, которое хранит объекты кораблей для быстрого доступа к ним */
	private Set<Ship> ships = new HashSet<Ship>();
	
	public FieldImpl(int width, int height) throws WrongArgumentException {
		if(width < 1 || height < 1){
			throw new WrongArgumentException("Слишком маленькие размеры поля");
		}
		if(width > MAX_ALLOWED_FIELD_SIDE_SIZE || height > MAX_ALLOWED_FIELD_SIDE_SIZE){
			throw new WrongArgumentException("Слишком большие размеры поля");
		}
		this.width = width;
		this.height = height;
		createCells();
	}
	
	/**
	 * Создание списка ячеека
	 */
	private void createCells(){
		final int size = this.width * this.height;
		cells = new ArrayList<Cell>(size);
		Cell cell = null;
		for(int i=0; i < size; i++){
			cell = new CellImpl();
			cell.init(i + 1);
			cells.add(cell);
		}
	}

	@Override
	public int getWidth() {
		/* перепишите реализацию метода, чтобы он возвращал ширину поля */
		return 0;
	}

	@Override
	public int getHeight() {
		/* перепишите реализацию метода, чтобы он возвращал высоту поля */
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
		/* перепишите реализацию метода, чтобы он возвращал число установленных на поле кораблей 
		 * см. реализацию метода getAvailableShipsCount() 
		 * */
		return 0;
	}

	@Override
	public int getAvailableShipsCount() {
		int count = 0;
		for(Ship ship: ships){
			if(ship.isAlive()){
				count++;
			}
		}
		return count;
	}

	@Override
	public void addShip(int[] cells) throws WrongArgumentException {
		/* перепишите реализацию метода, чтобы он позволял добавить корабль на поле. Используйте поле класса ships */		
	}

}
