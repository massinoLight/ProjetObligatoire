package matrice;

import java.util.concurrent.ThreadLocalRandom;

public class MatriceCreuse extends TraitementMatrice {
	
	
			
			//fonction qui permet d'initialiser une matice aléatoirement avec des valeurs aléatoires 
			int[][] init_Quelque_Valeurs_de_Matrice(int [][] mat){
				int random,random2;
				
				
					for (int j = 0; j < mat.length; j++) {
						random = (int) ThreadLocalRandom.current().nextDouble(0, mat.length);
						

						for (int i = 0; i <= random; i++) {
							random2 = (int) ThreadLocalRandom.current().nextDouble(0, mat.length);
							mat[random][random2]=random+random2;
							
						}
						
						
					}
					
				
				
				return mat;
			}
	
			
			/**une fonction qui prend une matrice creuse
			 * et la valeur qui se répéte a plusieurs reprise en paramétre
			 * et qui la transforme en
			 *  une matrice simplifier
             **/			


			int[][] passage_dune_matricecreuse_aune_matrice_simple(int [][] mat){
				
				
				int nb=0;
				//connaitre le nombre de valeurs non null pour allouer notre matrice
				for (int i = 0; i < mat.length; i++) {
					
					for (int j = 0; j < mat.length; j++) {
						if (mat[i][j]!=0) {
							nb++;
						}
					}
				}
				
				int [][] matSimple=new int[nb][3];
				int ligne=0;
				
               for (int i = 0; i < mat.length; i++) {
					
					for (int j = 0; j < mat.length; j++) {
						if (mat[i][j]!=0) {
							
							
							matSimple[ligne][0]=mat[i][j];
							matSimple[ligne][1]=i;
							matSimple[ligne][2]=j;
							ligne++;
							
						}
						
					}
					
					
					
				}
				
				
				return matSimple;
			}
			
			
			
			/***
			 * 
			 * une fonction qui prend en paramétre une matrice simplifié
			 * et qui va faire un passage a une matrice creuse avec un valeur
			 * 
			 * ici on ne peut pas savoir la taille de la matrice e déstination 
			 * car les valeurs présentes dans la matrice simple 
			 * 
			 * ***/
			int[][] passage_dune_matricesimple_aune_matricecreuse_(int [][] matsimple,int taille){
				
				int [][] mat = new int[taille][taille];;
				
				for (int i = 0; i < matsimple.length; i++) {
					
					mat[matsimple[i][1]][matsimple[i][2]]=matsimple[i][0];
				}
				
				
				
				return mat;
			}
			
			
			/***
			 * le passage d'une matrice creuse a une matrice simple 
			 * avec la 2eme methode 
			 * 
			 * 
			 * **/
			
	int[][] passage_dune_matricecreuse_aune_matrice_simple_Methode2(int [][] mat){
				
				
				int nb=0;
				//connaitre le nombre de valeurs non null pour allouer notre matrice
				for (int i = 0; i < mat.length; i++) {
					
					for (int j = 0; j < mat.length; j++) {
						if (mat[i][j]!=0) {
							nb++;
						}
					}
				}
				
				int [][] matSimple=new int[25][2];
				int indice=0;
				
               for (int i = 0; i < mat.length; i++) {
					
					for (int j = 0; j < mat.length; j++) {
						if (mat[i][j]!=0) {
							
							
							matSimple[indice][0]=indice;
							matSimple[indice][1]=mat[i][j];
							
							
							
						}
						indice++;
						
					}
				
				}
               indice=0;
               int [][] matResultat=new int[nb][2];
               
               for (int i = 0; i < matSimple.length; i++) {

            	   if (matSimple[i][0]!=0) 
            	   {
            		   matResultat[indice][0]=matSimple[i][0];
            		   matResultat[indice][1]=matSimple[i][1];
            		   indice++;
            		   
				}
            	   
			}
				
				
				return matResultat;
			}
	
	
	
	
	
	int[][] passage_dune_matriceSimple_aune_matrice_creuse_Methode2(int [][] mat,int [][] mat2,int T){
		
		int R=0,D=0;
		int dd=T;
		
		
		
		
		
		
		
		
		for (int i = 0; i < mat.length; i++) {
			
			R=mat[i][0]%dd;
			D=mat[i][0]/dd;
			//System.out.println(mat[i][0]+"="+dd+"x"+D+"+"+R);
			//System.out.println(D +" "+R);
			mat2[D][R]=mat[i][1];
			
			
		}
		
		
		
		
		
		return mat2;
		
	}
	

}
