import java.util.Random;

public class MineFieldTester {
   
   public static void main(String[] args) {
      
      MFT(3,3,2);
      MFT(6,6,10);
      MFT(9,9,30);

   }
   
   public static void MFT(int row, int col, int numMines){
      System.out.println("*******************************************************************************************************************");
      System.out.println("Create a empty mine field");
      MineField my_Mines = new MineField(row, col, numMines);
      System.out.println(my_Mines.toString());
      System.out.println("Print numRows: " + my_Mines.numRows());
      System.out.println("Print numCols: " + my_Mines.numCols());
      System.out.println("");
      
      
      System.out.println("PopulateMineField with given num of Mines (would be deduct if numMines > area/3)");
      Random random = new Random();
      my_Mines.populateMineField(random.nextInt(row), random.nextInt(col));
      System.out.println(my_Mines.toString());
      System.out.println("");
      
      System.out.println("Print adjacent num of Mines");
      System.out.println(my_Mines.toString_numAdj());
      System.out.println("");
      
      System.out.println("Is row,col in range? expected false, result: "+ my_Mines.inRange(row,col));
      System.out.println("Is row+3,col in range? expected false, result: "+ my_Mines.inRange(row+3,col));
      System.out.println("Is row-1,col-1 in range? expected true, result: "+ my_Mines.inRange(row-1,col-1));
      System.out.println("Is 0,-1 in range? expected false, result: "+ my_Mines.inRange(0,-1));
      System.out.println("");
      
      System.out.println("Print numMines: "+ my_Mines.numMines());
      System.out.println("");
      
      System.out.println("Test hasMine(), should be same as populate minefield");
      System.out.println(my_Mines.toString_hasMine());
      System.out.println("");
      
      System.out.println("Test reset Empty");
      my_Mines.resetEmpty();
      System.out.println(my_Mines.toString());
         
      System.out.println("*******************************************************************************************************************");
   }
}
