package it.polito.tdp.alien;

import java.util.*;


public class AlienDictionary {

	private List<Word> Dictionary = new LinkedList<Word>();
	
	
	public List<Word> getDictionary() {
		return Dictionary;
	}

	public void addWord(String alienWord,String translation){
		boolean trovato = false;
		
		for(Word temp: Dictionary){
			if(temp.compare(alienWord) != null){
				temp.setTranslation(translation);
				trovato = true;
			}
		}
		if(trovato == false && alienWord.matches("[a-zA-Z]*") && translation.matches("[a-zA-Z]*")){
			
			Word w = new Word(alienWord,translation);
			Dictionary.add(w);}
	}
	
	public String translateWord(String alienWord){
	
		String traduzione="";
		boolean trovato = false;
		for(Word temp: Dictionary){
			if(temp.compare(alienWord) != null){
				trovato = true;
				traduzione=  temp.getTranslation(); 
				break;
		}
			}
		if(trovato == true)
			return traduzione;
		
		else return  null;
	}
	}
