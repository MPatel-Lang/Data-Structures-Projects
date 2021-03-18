// Program: Sudoku
// Written by: Mehul Patel
// Program Description: A program that creates a working sudoku board
// File name:  Sudoku.c
// File description: A program that creates a working sudoku board
// Challenges:  inputing numbers where there is -1 and occation it will cause error for no reason
// Time Spent:    23 hours 30 mins
//
//               Revision History
// Date:                   By:                  Action:

// ---------------------------------------------------

// 5/9/20    mp       created the file     
// 5/10/20   mp       created the matrix
// 5/12/20   mp       created the random generator
// 5/14/20   mp       Finished the assignment

package sudoku;

  
public class Sudoku 
{ 

    
    int[] matrix[]; 
    int N; // number of columns/rows. 
    int srn; // square root of N 
    int M; // Number Of missing digits 
  
    // Constructor 
    Sudoku(int N, int M) 
    { 
        this.N = N; 
        this.M = M; 
  
        // Compute square root of N 
        Double SqNd = Math.sqrt(N); 
        srn = SqNd.intValue(); 
  
        matrix = new int[N][N]; 
    } 
  
    // Sudoku Generator 
    public void fillValues() 
    { 
        // Fill the diagonal of SRN x SRN matrices 
        FillDiagonal(); 
  
        // Fill remaining blocks 
        FillRemaining(0, srn); 
  
        // Remove Randomly K digits to make game 
        RemoveKDigits(); 
    } 
  
    // Fill the diagonal SRN number of SRN x SRN matrices 
    void FillDiagonal() 
    { 
  
        for (int i = 0; i<N; i=i+srn) 
  
            // for diagonal box, start coordinates->i==j 
            fillBox(i, i); 
    } 
  
    // Returns false if given 3 x 3 block contains num. 
    boolean unUsedInBox(int rowStart, int colStart, int num) 
    { 
        for (int i = 0; i<srn; i++) 
            for (int j = 0; j<srn; j++) 
                if (matrix[rowStart+i][colStart+j]==num) 
                    return false; 
  
        return true; 
    } 
  
    
    void fillBox(int row,int col) 
    { 
        int num; 
        for (int i=0; i<srn; i++) 
        { 
            for (int j=0; j<srn; j++) 
            { 
                do
                { 
                    num = randomGenerator(N); 
                } 
                while (!unUsedInBox(row, col, num)); 
  
                matrix[row+i][col+j] = num; 
            } 
        } 
    } 
  
    // Random generator 
    int randomGenerator(int num) 
    { 
        return (int) Math.floor((Math.random()*num+1)); 
    } 
  
    // Check if safe to put in cell 
    boolean CheckIfSafe(int i,int j,int num) 
    { 
        return (unUsedInRow(i, num) && 
                unUsedInCol(j, num) && 
                unUsedInBox(i-i%srn, j-j%srn, num)); 
    } 
  
    // check in the row for existence 
    boolean unUsedInRow(int i,int num) 
    { 
        for (int j = 0; j<N; j++) 
           if (matrix[i][j] == num) 
                return false; 
        return true; 
    } 
  
    // check in the row for existence 
    boolean unUsedInCol(int j,int num) 
    { 
        for (int i = 0; i<N; i++) 
            if (matrix[i][j] == num) 
                return false; 
        return true; 
    } 
  
    // A recursive function to fill remaining  
    // matrix 
    boolean FillRemaining(int i, int j) 
    { 
        //  System.out.println(i+" "+j); 
        if (j>=N && i<N-1) 
        { 
            i = i + 1; 
            j = 0; 
        } 
        if (i>=N && j>=N) 
            return true; 
  
        if (i < srn) 
        { 
            if (j < srn) 
                j = srn; 
        } 
        else if (i < N-srn) 
        { 
            if (j==(int)(i/srn)*srn) 
                j =  j + srn; 
        } 
        else
        { 
            if (j == N-srn) 
            { 
                i = i + 1; 
                j = 0; 
                if (i>=N) 
                    return true; 
            } 
        } 
  
        for (int num = 1; num<=N; num++) 
        { 
            if (CheckIfSafe(i, j, num)) 
            { 
                matrix[i][j] = num; 
                if (FillRemaining(i, j+1)) 
                    return true; 
  
                matrix[i][j] = 0; 
            } 
        } 
        return false; 
    } 
  
    // Remove the K no. of digits to 
    // complete game 
    public void RemoveKDigits() 
    { 
        int count = M; 
        while (count != 0) 
        { 
            int cellId = randomGenerator(N*N); 
  
            // System.out.println(cellId); 
            // extract coordinates i  and j 
            int i = (cellId/N); 
            int j = cellId%9; 
            if (j != 0) 
                j = j - 1; 
  
            // System.out.println(i+" "+j); 
            if (matrix[i][j] != -1) 
            { 
                count--; 
                matrix[i][j] = -1; 
            } 
        } 
    } 
  
    // Print sudoku 
    public void printSudoku() 
    { 
        for (int i = 0; i<N; i++) 
        { 
            for (int j = 0; j<N; j++) 
                System.out.print(matrix[i][j] + " "); 
            System.out.println(); 
        } 
        System.out.println(); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 9, K = 20; 
        Sudoku sudoku = new Sudoku(N, K); 
        sudoku.fillValues(); 
        sudoku.printSudoku(); 
        
        
        
        
        
      
        
    } 

   
}

