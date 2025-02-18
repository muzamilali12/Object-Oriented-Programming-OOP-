class matrix{
	int rows;
	int columns;
	int [][] matx;

	matrix(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.matx = new int[rows][columns];
	}
	void get_matrix(){
		for(int i = 0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.print(matx[i][j] + " ");
			}
				System.out.println();
		}
	}
	void set_element(int row, int column, int value){
		if(row>=0 && row<rows && column>=0 && column<columns){
			matx[row][column] = value;
		}else{
			System.out.println("Wrong row and column index value ");
		}

	}
	 public static void main (String[] args){
	 	matrix matrix1 = new matrix(3,4);
	 	matrix matrix2 = new matrix(3,3);

	 	matrix1.set_element(0,0,1);
	 	matrix1.set_element(1,1,2);
	 	matrix1.set_element(2,2,3);


	 	matrix2.set_element(0,0,4);
	 	matrix2.set_element(1,1,5);
	 	matrix2.set_element(2,2,6);

	 	matrix1.set_element(1,2,3);

	 	System.out.println("Matrix 1: ");
	 	matrix1.get_matrix();

        System.out.println("Matrix 2: ");
	 	matrix2.get_matrix();

   }
}