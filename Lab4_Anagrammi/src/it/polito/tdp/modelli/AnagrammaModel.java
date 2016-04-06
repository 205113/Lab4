package it.polito.tdp.modelli;

import java.util.*;

public class AnagrammaModel {
	private List<String> soluzione;

	public AnagrammaModel() {
		soluzione= new ArrayList<String>();
	}
	 public List<String> permuta(String parola){
		 List<String> lettere= new ArrayList<String>();
		 for(int i=0;i<parola.length();i++){
			 lettere.add(parola.charAt(i)+"");
		 }
		 permutaRic(lettere,"",0);
		 return soluzione;
	 }
	 public void permutaRic(List<String>lettere,String soluzione,int passo){
		 if(lettere.size()==0)
			 this.soluzione.add(soluzione);
		 else{if(!this.soluzione.contains(soluzione)){
			 for(String lettera: lettere){
				 List<String> rimanenti=new ArrayList<String>(lettere);
				 rimanenti.remove(lettera);
				 this.permutaRic(rimanenti, soluzione+lettera, passo+1);
			 }
		 }	
		 }

		 }
	 
	/*public static void main(String[]args){
		AnagrammaModel m= new AnagrammaModel();
		List<String> s=m.permuta("ciao");
		for(int i=0;i<s.size();i++){
			System.out.println(s.get(i));
		}
	}*/
}
