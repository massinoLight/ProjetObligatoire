package matrice;



public class Matrice extends TraitementMatrice{
	
	
	
	//afficher les element de la diagonale d'une matrice passé en paramétre 
	void affiche_diagonale(int[][]mat ) {
		
		for (int i = 0; i < mat.length; i++) {
			
			
			System.out.print(mat[i][i]+" ");
			
		}
		
		
	}
	
	     
	     /**
	      * les deux conditions inutiles ont été supprimées 
	      * **/
	     
	     //afficher le contenu de la partie supperieur a la dagonale	     
	     
	     void affiche_partie_sup_NEW(int[][]mat) {
		 		
		 		for (int i = 0; i < mat.length; i++) {
		 			
		 			for (int k = 0; k < i; k++) {
		 				System.out.print("   ");	
					}
		 			
		 			for (int j = i+1; j < mat.length; j++) {
		 				
		 				
		 					System.out.print(mat[i][j]+"  ");
		 				
			 		}
		 			
		 			System.out.println();
		 		}
		 	}
	     
	     
    //afficher le contenu de la partie inferieur a la dagonale 	     
	     
	     void affiche_partie_inf_NEW(int[][]mat ) {
		 		
		 		for (int i = 0; i < mat.length; i++) {
		 			
		 			for (int j = 0; j < i; j++) {
		 				
		 				
		 					
		 					System.out.print(mat[i][j]+"  ");
		 				
			 		}
		 			System.out.println();
		 		}	
		 	}
	     
	     
	     
	   
	     
	     
	
}
