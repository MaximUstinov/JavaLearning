package com.maximustinov.seabattle.basic;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.maximustinov.seabattle.Field;
import com.maximustinov.seabattle.Game;
import com.maximustinov.seabattle.Player;
import com.maximustinov.seabattle.Ship.Direction;

public class GameImpl implements Game {
	private Set<Player> players;
	private Map<Player, Field> fields;
	
	@Override
	public void init(String[] players, int fieldWidth, int fieldHeight) throws IllegalArgumentException, WrongArgumentException {
		if(players == null || players.length < 2 || fieldWidth < 5 || fieldHeight < 5 || fieldWidth > 15 || fieldHeight > 15){
			throw new IllegalArgumentException("check input arguments: \n");
		}
		for(int i=0; i < players.length - 1; i++){
			for(int j=i+1; j < players.length; j++){
				if(players[i].equalsIgnoreCase(players[j])){
					throw new IllegalArgumentException("check input arguments");
				}
			}
		}
		initPlayers(players);
		initFields(fieldWidth, fieldHeight);
	}
	
	private void initPlayers(String[] names){
		players = new HashSet<Player>();
		for(String name: names){
			players.add(new PlayerImpl(name));
		}
	}
	
	private void initFields(int width, int height) throws WrongArgumentException{
		for(Player player: players){
			fields.put(player, new FieldImpl(width, height));
		}
	}

	@Override
	public void addShip(String player, int size, int coordinate, Direction direction) throws IllegalArgumentException {
		if(player == null || player.length() == 0 || size < 1 || coordinate < 0 || direction == null){
			throw new IllegalArgumentException("check input arguments");
		}
	}

	@Override
	public void hit(String player, int cellNumber, int bulletSize) {
		try{
			fields.get(player).hit(cellNumber, null);
		}catch(NullPointerException npe){
			
		}
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
