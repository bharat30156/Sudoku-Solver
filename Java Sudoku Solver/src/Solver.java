import java.util.Arrays;
import java.util.HashSet;
public class Solver {

	int [][]arr;
	Solver(){
		
	}
	Solver(int [][]arr){
		this.arr = arr;
	}
	
	public boolean solve(){
		
		boolean flag = solveSudoku(0,0);
		flag = valid();
		return flag;
	}
	public boolean solve(int [][]arr){
		this.arr=arr;

		boolean flag = solveSudoku(0,0);
		flag = valid();
		return flag;
	}
	
	private boolean solveSudoku(int i, int j){
		
		if(i==9){
			i=0;
			if(++j==9) return true;
		}
		if(arr[i][j]!=0) return solveSudoku(i+1, j);
		
		for(int num=1;num<=9;num++){
			if(isLegal(i,j,num)){
				arr[i][j]=num;
			
			if(solveSudoku(i+1,j)) 
			return true;
			}
		}
		arr[i][j]=0;
		return false;
	}
	
	private boolean isLegal(int x,int y, int num){

		// row check
		for(int i=0;i<9;i++){
			if(arr[x][i]==num) return false;
		}
		// column check
		for(int i=0;i<9;i++){
			if(arr[i][y]==num) return false;
		}
		
		int row =(x/3)*3;
		int col =(y/3)*3;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(arr[row+i][col+j]==num) return false;
			}
		}
		
		return true;
	}
	
	public boolean valid(){
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(arr[i][j]!=0){
					if(isLegal(i,j)==false) 
						return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean isLegal(int x, int y){
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<9;i++){
			if(hs.contains(arr[x][i])){
				return false;
			}
			if(arr[x][i]>0 || arr[x][i]<10){
				hs.add(arr[x][i]);
			}
		}
		hs.clear();
		for(int i=0;i<9;i++){
			if(hs.contains(arr[i][y])){
				return false;
			}
			if(arr[i][y]>0 || arr[i][y]<10){
				hs.add(arr[i][y]);
			}
		}
		hs.clear();
		
		int row =(x/3)*3;
		int col =(y/3)*3;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(hs.contains(arr[row+i][col+j]))
					return false;
				if(arr[row+i][col+j]>0 || arr[row+i][col+j]<10){
					hs.add(arr[row+i][col+j]);
				}
			}
		}
		return true;
	}
	
}