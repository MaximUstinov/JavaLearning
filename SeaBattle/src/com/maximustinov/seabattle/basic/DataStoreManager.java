package com.maximustinov.seabattle.basic;
import java.io.*;
import java.io.IOException;
import com.maximustinov.seabattle.Player;

public class DataStoreManager {
	/** имя файла со списком игроков */
	private final String playersListFile;

	public DataStoreManager(String playersListFile){
		this.playersListFile = playersListFile;
	}

	/**
	 * Сохраняет список игроков в файл
	 * @param players
	 */
	public void storePlayersList(Player[] players){
		Writer writer = null;
		// хочу сделать проверку "если файл не пустой, то можно звписывать, в противном случае удалить все данные и записывать" - как это реализовать?
		/* проверку, что файл не пустой можно сделать так */
		File file = new File(playersListFile);
		if(file.exists()){
			//файл существует
		}
		/*
		 * Но, при записи через Writer (как ниже)
		 * данные будут стерты автоматически
		 */
		try {
			writer = new BufferedWriter(new FileWriter (playersListFile));
			String aString = "";
			/*
			 * количество игроков можно узнать из свойства length массива 
			 * for (int i=0; i < 2; i++) { // хотелось бы заменить фиксированное количество игроков на переменную, но не понятно куда ввести переменную с количеством игроков и как вызывать?
			 */
			for(int i=0; i < players.length; i++){
				aString += players[i].toString() + '\n';
			}
			writer.write(aString);
		/*
		 * 
		} finally {
			writer.flush();
		} catch (IOException e){ // не понимаю почему выдает синтаксическую ошибку?
			e.printStackTrace();
		}
		тут имеет смысл порядок
		сначала catch,
		потом finally
		и вызов writer.flush(); надо обернуть в блок try-catch
		только вместо flush() здесь уже нужно вызывать иетод close()
		вот так:
		*/
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Возвращает список игроков - их имена
	 * @return возвращает строку с двумя именами игроков - каждый на своей строчке.
	 */
	public String getPlayersList(String playersListFile){
		StringBuffer sb = null;
		BufferedReader br = null;
		try {
			sb = new StringBuffer();
			FileReader reader = new FileReader (playersListFile);
			br = new BufferedReader (reader);
			String str;
			while((str = br.readLine()) != null) {
				sb.append(str);
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		//return sb; // чего-то я где-то напутал судя по выдаваемой ошибки?
		/*
		 * Причина синтексической ошибки в том, что метод должен возвращать переменную типа String,
		 * а sb - переменная типа StringBuffer
		 * поэтому надо делать так (с проверкой, что не пустой адрес sb)
		 */
		if(sb == null){
			return null;
		}else{
			return sb.toString();
		}
	}


}
