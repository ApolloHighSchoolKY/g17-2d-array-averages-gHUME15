import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    for(int row=0; row<ray.length; row++)
    {
        int sum = 0;
        for(int col=0; col<ray[row].length; col++)
        {
            sum += ray[row][col];
        }
        int average = sum / ray[row].length;
        System.out.println("Average of row " + row + " " + average);
    }
  }

  public void columnAverages(){
    // Top down to left right 
    // Use 0 insteed of row in the brakets
    for(int col=0; col<ray[0].length; col++)
    {
        int sum = 0;
        for(int row=0; row<ray.length; row++)
        {
            sum += ray[row][col];
        }
        int average = sum / ray.length;
        System.out.println("Average of column " + col + " " + average);
    }
  }

  public void arrayAverage(){
    int sum = 0;
    int count = 0;
    for(int row=0; row<ray.length; row++)
    {
        for(int col=0; col<ray[row].length; col++)
        {
            sum += ray[row][col];
            count++;
        }
    }
    int average = sum / count;
    System.out.println("Average of the entire array " + average);
  }
  

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
