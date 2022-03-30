package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	private SpellChecker spellChecker;
	
	@Autowired
	public void setSpellChecker(SpellChecker _spellChecker) {spellChecker = _spellChecker;}

	public SpellChecker getSpellChecker(){return spellChecker;}
	
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
