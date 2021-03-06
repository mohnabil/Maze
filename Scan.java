import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Scan {
	
	private char[][][] grid= new char[100][100][100];
	private Scanner scan = null;
	private int x, y, z;
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getZ(){
		return z;
	}
	
	public Scan(String path){
		
		File file= new File(path);
		try{
			scan= new Scanner(file);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
	}
	
	
	public char[][][] scanning(){
	
		x= scan.nextInt();
		y= scan.nextInt();
		z= scan.nextInt();
		
		
		for(int k= 0; k< z; k++){
			for(int i= 0; i< x; i++){
				String str= scan.next();
				for(int j= 0; j< y; j++){
					grid[i][j][k]= str.charAt(j);
				}
			}
		}
		
		return grid;
	}
	
	public void printGrid(){
		System.out.println("x= " + x + " y= " + y + " z= " + z);
		for(int k= 0; k< z; k++){
			for(int i= 0; i< x; i++){
				for(int j= 0; j< y; j++){
						System.out.print(grid[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
