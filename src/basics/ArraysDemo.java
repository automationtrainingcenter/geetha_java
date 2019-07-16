package basics;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 *  
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public interface ArraysDemo {
	public static void main(String[] args) {

		// array declaration
		int[] numbers = new int[6];
		// store the data
		numbers[0] = 18;
		numbers[1] = 17;
		numbers[2] = 16;
		numbers[3] = 17;
		numbers[4] = 19;
		numbers[5] = 15;
//		numbers[6] = 12;

		// retrieve the data
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
//		System.out.println(numbers[5]);
		// Retrieve data using for loop
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

		// retrieve data using for each loop
		for (int number : numbers) {
			System.out.println(number);
		}

		// initialzation
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

//		System.out.println(vowels[0]);
//		System.out.println(vowels[1]);
//		System.out.println(vowels[2]);
//		System.out.println(vowels[3]);
//		System.out.println(vowels[4]);

		for (char vowel : vowels) {
			System.out.println(vowel);
		}

		// Two dimensional arrays
		// declaration
		int[][] matrix1 = new int[2][2];

		// assignment
//		first row data
		matrix1[0][0] = 1; // first column
		matrix1[0][1] = 2; // second column
		// second row data
		matrix1[1][0] = 3; // first column
		matrix1[1][1] = 4; // second column

		// retrieve the data
//		System.out.print(matrix1[0][0] + "\t");
//		System.out.print(matrix1[0][1] + "\n");
//		System.out.print(matrix1[1][0] + "\t");
//		System.out.print(matrix1[1][1] + "\n");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}

		// initialization
		int[][] matrix2 = { { 9, 8, 7, 11 }, { 6, 5, 4, 12 }, { 3, 2, 1} };
		// first row
//		System.out.print(matrix2[0][0] + "\t"); // first column
//		System.out.print(matrix2[0][1] + "\t"); // second column
//		System.out.print(matrix2[0][2] + "\n"); // third column
//
//		// second row
//		System.out.print(matrix2[1][0] + "\t"); // first column
//		System.out.print(matrix2[1][1] + "\t"); // second column
//		System.out.print(matrix2[1][2] + "\n"); // third column
//
//		// third row
//		System.out.print(matrix2[2][0] + "\t"); // first column
//		System.out.print(matrix2[2][1] + "\t"); // second column
//		System.out.print(matrix2[2][2] + "\n"); // third column
		System.out.println("number of rows "+matrix2.length);
		System.out.println("number of columns in first row "+matrix2[0].length);
		for(int i = 0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
