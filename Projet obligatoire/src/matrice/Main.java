package matrice;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Matrice m=new Matrice();
		MatriceCreuse mc=new MatriceCreuse();
		int T=5;
		
		int matrice[][]=new int[T][T];
		int matricenull[][]=new int[T][T];
		int matricSimple[][];
		int matric2dess[][];
		int matricSimple2[][];
		
		int matricdess2[][] = new int[T][T];
		
		int trans[][] = new int[T][T];
		
		
		
		matrice=m.initMatrice(matrice);
		System.out.println("---------------------une Matrice-----------------------------------");
		m.afficherMatrice(matrice);
		System.out.println("---------------------la diagonale de la matrice--------------------");
		System.out.println();
		m.affiche_diagonale(matrice);
		System.out.println();	
		
		System.out.println("\n-------------------la partie sup de la matrice NEW-------------------");
		System.out.println();
		m.affiche_partie_sup_NEW(matrice);
		
		
		System.out.println("\n-------------------la partie inf de la matrice NEW-------------------");
		m.affiche_partie_inf_NEW(matrice);
		System.out.println();
		
		
		matricenull=mc.initMatriceazero(matricenull);
		//mc.afficherMatrice(matricenull);
		mc.init_Quelque_Valeurs_de_Matrice(matricenull);
		System.out.println("-----------------une matrice creuse ------------------------------");
		
		mc.afficherMatrice(matricenull);
		
		System.out.println("-----------------une matrice simplifié de la matrice creuse-------");
		System.out.println("V  L  C");
		matricSimple=mc.passage_dune_matricecreuse_aune_matrice_simple(matricenull);
		mc.afficherMatrice(matricSimple);
		System.out.println("-----------------repassage a la matrice creuse------------------------");

		matric2dess=mc.passage_dune_matricesimple_aune_matricecreuse_(matricSimple,matricenull.length);
		mc.afficherMatrice(matric2dess);
		System.out.println("----------------------------la 2eme methode de simplification-----------------------------------");
		System.out.println("Pos V");
		matricSimple2=mc.passage_dune_matricecreuse_aune_matrice_simple_Methode2(matricenull);
		mc.afficherMatrice(matricSimple2);
		
		System.out.println("--------on repasse a la matrice creuse avec la methode2--------------------------------------");
		matricdess2=mc.initMatriceazero(matricdess2);
		matricdess2=mc.passage_dune_matriceSimple_aune_matrice_creuse_Methode2(matricSimple2, matricdess2,T);
		mc.afficherMatrice(matricdess2);
		
		
		
		System.out.println("--------la transposition de la matrice précedante est--------------------------------------");
		
		trans=mc.transpose(matricdess2);
		mc.afficherMatrice(trans);
		
		
		
		
	}

}
