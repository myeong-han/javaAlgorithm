import java.util.List;

class Main {
  public static void test01() {
    System.out.println();
    System.out.println("============ test01() Start ============");

    int[] in = {9,3,5,7,9};
    int out = 12;
    
    String result = "result: \n";
    
    for (int i = 0; i <= 3; i++) {
      for (int j=4; j>i; j--) {
        if (in[i]+in[j] == out) {
          result += in[i] + "+" + in[j] + "\n";
        }
      }
    }
    System.out.print(result);
    System.out.println("============= test01() End =============");
  }

  public static void test02() {
    System.out.println();
    System.out.println("============ test02() Start ============");

    int[][] input = {{100,100,100},
                      {20,20,20},
                      {30,30,30},
                      {40,40,40}};
    
    int[][] result = new int[5][4];
    
    int sumi = 0;
    int sumj = 0;
    
    for (int i=0; i<input.length; i++) {
      for (int j=0; j<input[i].length; j++) {
        result[i][j] = input[i][j];
        sumi += input[i][j];
        System.out.print(input[i][j]+"\t");
      }
      result[i][3] = sumi;
      sumi = 0;
      System.out.println();
    }
    
    System.out.println();
    
    for (int j=0; j<result[0].length; j++) {
      for (int i=0; i<result.length; i++) {
        sumj += result[i][j];
      }
      result[4][j] = sumj;
      sumj = 0;
    }
    
    for (int i=0; i<result.length; i++) {
      for (int j=0; j<result[i].length; j++) {
        System.out.print(result[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println("============= test02() End =============");
  }

  public static void main(String[] args) {
    Main.test01();
    Main.test02();
  }
}