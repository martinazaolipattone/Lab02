package it.polito.tdp.alien;

import java.util.LinkedHashMap;
import java.util.Map;

public class Word  {

		private String alienWord;
		private String translation;
		
		
	   public Word(String alien, String translation) {
		
		this.alienWord = alien;
		this.translation = translation;
}
	   public String compare(String alienW){
		   if(this.alienWord.compareTo(alienW) == 0)
			   return alienWord;
		   return null;
	   }
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
}
