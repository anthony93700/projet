
public class recherche {
	private int tab[];
	public recherche(int tb[]){
		this.tab =tb;
	}
public int recherch(int val){
for(int i = 0;i<tab.length;i++){
	if(tab[i]==val){
		return i;
	}
}
return -1;

}
public void affichage(int tb[]){
	 for(int i = 1;i<tb.length;i++){
		 System.out.println(tb[i]);
		 }
	 }
}
