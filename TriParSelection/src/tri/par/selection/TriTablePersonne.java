package tri.par.selection;

import tri.par.selection.Personne;

public class TriTablePersonne {

	static public Personne[] tablePersonnes=new Personne[10];
	
	
	public static void main(String[] args){
		
		tablePersonnes[0]=new Personne("Laswed","Mohamed",12);
		tablePersonnes[1]=new Personne("BelAdid","Mouloud",30);
		tablePersonnes[2]=new Personne("Msallem","Amine",2);
		tablePersonnes[3]=new Personne("Abidi","Bassem",9);
		tablePersonnes[4]=new Personne("Majdoub","Semah",45);
		tablePersonnes[5]=new Personne("Guiza","Nadhem",23);
		tablePersonnes[6]=new Personne("Rizg","Walid",39);
		tablePersonnes[7]=new Personne("Sghayir","Bilel",32);
		tablePersonnes[8]=new Personne("Amri","Ahmed",29);
		
		triParSelection(tablePersonnes);
		affiche(tablePersonnes);
		
	}
	
	
	
	
	
	public static void affiche(Personne[]table){
		
		for(int i=0;i<9;i++){
			System.out.println(tablePersonnes[i].toString());
		}
	}
	
	
	 


public static void triParSelection(Personne[]table){
		
		int k;
		boolean change;
		for(int i=0;i<9;i++){
			change=false;
			k=i;
			for(int j=i+1;j<9;j++){
				if(table[k].age>table[j].age){
					k=j;
				    change=true;
				}	
			}
			if(change){
				Personne persChange=table[k];
				table[k]=table[i];
				table[i]=persChange;
			}
		}
	}
 
 
}
