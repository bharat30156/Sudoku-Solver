import java.util.Arrays;
public class Manual {

	public static void main(String[] args) {
		
		/*
		 *  Enter your 9*9 sudoku grid
		 *  Blank spaces should be initialised with 0
		 */
		int [][]arr1 =  {{0,0,0,0,0,0,0,0,0},
				         {0,0,0,0,0,3,0,8,5},
				         {0,0,1,0,2,0,0,0,0},
				         {0,0,0,5,0,7,0,0,0},
				         {0,0,4,0,0,0,1,0,0},
				         {0,9,0,0,0,0,0,0,0},
				         {5,0,0,0,0,0,0,7,3},
				         {0,0,2,0,1,0,0,0,0},
				         {0,0,0,0,4,0,0,0,9}};
		int [][]arr2 = {{5,3,0,0,7,0,0,0,0},
		                {6,0,0,1,9,5,0,0,0},
		                {0,9,8,0,0,0,0,6,0},
		                {8,0,0,0,6,0,0,0,3},
		                {4,0,0,8,0,3,0,0,1},
		                {7,0,0,0,2,0,0,0,6},
		                {0,6,0,0,0,0,2,8,0},
		                {0,0,0,4,1,9,0,0,5},
		                {0,0,0,0,8,0,0,7,9}};
		
		Solver sv = new Solver(arr1);
   
		if(sv.solve()){
			System.out.println(Arrays.deepToString(arr1).replace("],", "],\n"));

		}else{
			System.out.println("Solution doesn't exist");
		}
		
		Solver sv1 = new Solver();
		if(sv1.solve(arr2)){
			System.out.println(Arrays.deepToString(arr2).replace("],", "],\n"));

		}else{
			System.out.println("Solution doesn't exist");
		}

	}

}