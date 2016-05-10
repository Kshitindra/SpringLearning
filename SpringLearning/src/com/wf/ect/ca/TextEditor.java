package com.wf.ect.ca;

public class TextEditor {
	SpellChecker spellChecker;
	
	public TextEditor(){
		System.out.println("In textEditor Construtor");
	}
	public void setSpellChecker(SpellChecker spellChecker){
		System.out.println("In setSpellChecker");
		this.spellChecker=spellChecker;
	}
	
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}

	public void checkSpelling(){
		
		spellChecker.checkSpelling();
	}
}
