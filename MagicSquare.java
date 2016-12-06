//App Name: Magic Squares Generator - Java
//App Description: Odd Numbers Magic Squares Generator - Console Application 
//Developper: Larry Georges Muala

public class Magic_Square
{
	public static void main (String[] args)
	{
		System.out.println("\nMagic Squares Generator \n");
		
		//Replace size by the value of your desired magic square
		int size = 5;
				
		int[][] magic_list = new int[size][size];
			
		
		//loops to assign magic square values to each entry in magic_list
		//using formula:
		// for Ith row and Jth column
		// value = { n*[(I + J - 1 + (n//2)) % n)] } + { [(I + 2*J - 2) % n] + 1 }, n = size

		for (int row_s = 0; row_s < size; row_s++){
			
			for (int column_s = 0; column_s < size; column_s++){
			
				int row_value = row_s + 1;
				int column_value = column_s + 1;

				int value = ( size * ((row_value + column_value - 1 + (size/2)) % size) ) + ( ((row_value + 2 * column_value - 2) % size) + 1 );
				
				magic_list[row_s][column_s] = value;
			}
		}
		
		System.out.println("\nTop Middle Alignment \n");
		
		for (int row_s = 0; row_s < size; row_s++){
			
			for (int column_s = 0; column_s < size; column_s++){
				
				if (magic_list[row_s][column_s] < 10)  System.out.print(" "); 
                if (magic_list[row_s][column_s] < 100) System.out.print(" ");
				
              	System.out.print(String.valueOf(magic_list[row_s][column_s])); 
				
              	System.out.print(" ");
			}
			System.out.println("\n"); 
		}
		
		System.out.println("\nBottom Middle Alignment \n");
		
		for (int row_s = size - 1; row_s >= 0; row_s--){
			
			for (int column_s = size - 1; column_s >= 0; column_s--){
				
				if (magic_list[row_s][column_s] < 10)  System.out.print(" "); 
                if (magic_list[row_s][column_s] < 100) System.out.print(" ");
				
              	System.out.print(String.valueOf(magic_list[row_s][column_s])); 
              	System.out.print(" ");
			}
			System.out.println("\n"); 
		}
		
		System.out.println("\nLeft Middle Alignment \n");
		
		for (int row_s = 0; row_s < size; row_s++){
			
			for (int column_s = 0; column_s < size; column_s++){
				
				if (magic_list[column_s][row_s] < 10)  System.out.print(" "); 
                if (magic_list[column_s][row_s] < 100) System.out.print(" ");
				
              	System.out.print(String.valueOf(magic_list[column_s][row_s])); 
              	System.out.print(" ");
			}
			System.out.println("\n"); 
		}
		
		System.out.println("\nRight Middle Alignment \n");
		
		for (int row_s = size - 1; row_s >= 0; row_s--){
			
			for (int column_s = size - 1; column_s >= 0; column_s--){
				
				if (magic_list[column_s][row_s] < 10)  System.out.print(" "); 
                if (magic_list[column_s][row_s] < 100) System.out.print(" ");
				
              	System.out.print(String.valueOf(magic_list[column_s][row_s])); 
              	System.out.print(" ");
			}
			System.out.println("\n"); 
		}

	}
}