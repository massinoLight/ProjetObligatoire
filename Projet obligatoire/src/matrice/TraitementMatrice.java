package matrice;

import java.util.concurrent.ThreadLocalRandom;

public class TraitementMatrice {
	
	
	
	
	//afficher le contenu d'une matrice
    public  void afficherMatrice(int monTab2[][]) {
   	 for(int i = 0 ; i < monTab2.length; i++ ){  
   	     for(int j = 0; j< monTab2[i].length; j++){   
   	         System.out.print(monTab2[i][j]+"  "); 
   	     } 
   	System.out.println(); 
   	}   
   	 }  
    
    
    
  //fonction qui permet d'initialiser une matice a zero 
	int[][] initMatriceazero(int [][] mat){
		int random;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				random = (int) ThreadLocalRandom.current().nextDouble(0, 5);

				mat[i][j]=0;
			}
			
		}
		
		return mat;
	}
	
	
	//fonction qui permet d'initialiser une matice  avec des veleurs aléatoires 
		int[][] initMatrice(int [][] mat){
			int random;
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					random = (int) ThreadLocalRandom.current().nextDouble(0, 5);

					mat[i][j]=i+j+random;
				}
				
			}
			
			return mat;
		}
	

		
		//fonction qui permet de faire la transposition d'une matrice passé en paramétre
		public  int[][] transpose(int mm[][]){
		    int m = mm.length;
		    int n = mm[0].length;
		    int ret[][] = new int[n][m];

		    for (int i = 0; i < m; i++) {
		        for (int j = 0; j < n; j++) {
		            ret[j][i] = mm[i][j];
		        }
		    }

		    return ret;
		}
		
		
		
		
		
		
		
		
}
