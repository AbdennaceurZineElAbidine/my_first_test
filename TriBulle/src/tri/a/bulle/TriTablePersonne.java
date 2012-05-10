package tri.a.bulle;

import tri.a.bulle.Personne;

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
		
		triABulle(tablePersonnes);
		affiche(tablePersonnes);
		
	}
	
	public static void affiche(Personne[]table){
		
		for(int i=0;i<9;i++){
			System.out.println(tablePersonnes[i].toString());
		}
	}

	public static void triABulle(Personne[] table)
    {
    int longueur=8;
    boolean inversion;
    
    do
        {
        inversion=false;

        for(int i=0;i<longueur-1;i++)
            {
            if(table[i].age>table[i+1].age)
                {
                echanger(table,i,i+1);
                inversion=true;
                }
            }
         longueur--;
         }
    while(inversion);
    }

	private static void echanger(Personne[] table, int x, int y) {
		Personne persChange=table[x];
		table[x]=table[y];
		table[y]=persChange;
		
	}
 
 
}
