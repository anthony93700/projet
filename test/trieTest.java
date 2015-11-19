import junit.framework.TestCase;


public class trieTest extends TestCase {

	public void tableauNonVide(int tab[],int val) {
		recherche r = new recherche(tab);
		for(int i = 0;i<tab.length;i++)
		if(tab!= null){
			fail("ERREUR LA CASE"+i+"est vide");
		}
		
		}
	public void BienTrier(int tab[]){
		boolean a = true;
		for(int i = 1;i<tab.length;i++){
			if(tab[i-1]<tab[i]){
				a =false;
			}
		}
		if(a){
			fail("bien trier");
		}else{
			fail("mal trier");
		}
	}

}
