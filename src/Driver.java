import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	private Node[][] grid;
	
	
	
	public Driver() {
		
		try {
			
			FileReader fileReader = new FileReader("input.txt");
			Scanner inputReader = new Scanner(fileReader);
			
			int counter = 0;
			int row = 0;
			int column = 0;
			
			while(inputReader.hasNext()) {
				
				String input = inputReader.next();
				if(counter == 0) {
					
					row = Integer.parseInt(input);
					counter++;
					
				} else if(counter == 1){
					
					
					column = Integer.parseInt(input);
					break;
					
				}
				
			}
			
			grid = new Node[row][column];
			
			int rowCounter = 0;
			int columnCounter = 0;
			
			
			for(int i = 0; i < row; i++) {
				
				for(int j = 0; j < column; j++) {
					
					String weight = inputReader.next();
					grid[i][j] = new Node(i,j, Integer.parseInt(weight));
					
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("You dun goofed");
			
		}
		
		for(int i = 0; i < grid.length; i++) {
			
			for(int j = 0; j < grid.length; j++) {
				
				if()
				
				
			}
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver drive = new Driver();
		
	}

}
