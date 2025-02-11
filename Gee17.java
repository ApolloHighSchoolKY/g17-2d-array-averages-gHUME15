public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];


    ray[0][0] = 0;
    ray[0][1] = 1;
    ray[0][2] = 2;
    ray[0][3] = 3;
    ray[0][4] = 4;
    ray[0][5] = 5;
    ray[0][6] = 6;
    ray[1][0] = 7;
    ray[1][1] = 8;
    ray[1][2] = 9;
    ray[1][3] = 10;
    ray[1][4] = 11;
    ray[1][5] = 12;
    ray[1][6] = 13;
    ray[2][0] = 14;
    ray[2][1] = 15;
    ray[2][2] = 16;
    ray[2][3] = 17;
    ray[2][4] = 18;
    ray[2][5] = 19;
    ray[2][6] = 20;
    ray[3][0] = 21;
    ray[3][1] = 22;
    ray[3][2] = 23;
    ray[3][3] = 24;
    ray[3][4] = 25;
    ray[3][5] = 26;
    ray[3][6] = 27;
    ray[4][0] = 28;
    ray[4][1] = 29;
    ray[4][2] = 30;
    ray[4][3] = 31;
    ray[4][4] = 32;
    ray[4][5] = 33;
    ray[4][6] = 34;
    ray[5][0] = 35;
    ray[5][1] = 36;
    ray[5][2] = 37;
    ray[5][3] = 38;
    ray[5][4] = 39;
    ray[5][5] = 40;
    ray[5][6] = 41;
    ray[6][0] = 42;
    ray[6][1] = 43;
    ray[6][2] = 44;
    ray[6][3] = 45;
    ray[6][4] = 46;
    ray[6][5] = 47;
    ray[6][6] = 48;

    ArrayAverages twoDee = new ArrayAverages(ray);
    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}