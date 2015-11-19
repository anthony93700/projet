
public class trie {
private int tb[];
private int x;
public trie(int tb[]){
	this.tb =tb;
}
 public void trier(){
	 for (int i=0 ;i<=(tb.length-2);i++){ 
		 for (int j=(tb.length-1);i < j;j--){ 
			 if (tb[j] < tb[j-1]) 
			 { 
			 x=tb[j-1];
			 tb[j-1]=tb[j]; 
			 tb[j]=x;
			 }
		}
	}
	 
 }


 



}
