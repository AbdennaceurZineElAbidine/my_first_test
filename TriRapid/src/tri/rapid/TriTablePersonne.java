package tri.rapid;

import tri.rapid.Personne;

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
		tablePersonnes[8]=new Personne("Amri","Ahmed",30);
		
		triRapide(tablePersonnes,0,8);
		affiche(tablePersonnes);
		
	}
	
	
	
	
	 private static void triRapide(Personne[] table,int deb,int fin)
     {
     if(deb<fin)
         {
         int positionPivot=partition(table,deb,fin);
         triRapide(table,deb,positionPivot-1);
         triRapide(table,positionPivot+1,fin);
         }
     }
	
	 private static int partition(Personne[] table,int deb,int fin)
     {
     int compt=deb;
     Personne pivot=table[deb];
     
     for(int i=deb+1;i<=fin;i++)
         {
         if (table[i].age<pivot.age)
             {
             compt++;
             echanger(table,compt,i);
             }
         }
     echanger(table,deb,compt);
     return(compt);
     }

	 
	 
	
	private static void echanger(Personne[] table, int x, int y) {
		Personne persChange=table[x];
		table[x]=table[y];
		table[y]=persChange;
		
	}




	public static void affiche(Personne[]table){
		
		for(int i=0;i<9;i++){
			System.out.println(tablePersonnes[i].toString());
		}
	}
	
}
