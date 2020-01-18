class Main {

    // in[]의 수 전부를 대상으로 비교하여 두 수를 더하여 out이 나오는 경우를 출력하시오.
    public static void test01() {
        System.out.println();
        System.out.println("============ test01() Start ============");

        int[] in = {9,3,5,7,9};
        int out = 12;
        
        String result = "result: \n";
        
        /*
            i : j 비교
            0 : 1,2,3,4
            1 : 2,3,4
            2 : 3,4
            3 : 4
        */
        for (int i = 0; i < in.length-1; i++) { //in.length-1 == 4
            for (int j = in.length-1; j>i; j--) {
                if (in[i]+in[j] == out) {
                result += in[i] + "+" + in[j] + "\n";
                }
            }
        }
        System.out.print(result);
        System.out.println("============= test01() End =============");
    }

    // 입력받은 4*3행렬의 각 행과 열의 총합을 5*4행렬의 마지막 열과 행에 표시하시오.
    public static void test02() {
        System.out.println();
        System.out.println("============ test02() Start ============");

        int[][] input = {{100,100,100},
                        {20,20,20},
                        {30,30,30},
                        {40,40,40}};
        
        int[][] result = new int[input.length+1][input[0].length+1]; //[5][4]
        
        int sum = 0;
        
        for (int i=0; i<input.length; i++) {
            for (int j=0; j<input[i].length; j++) {
                result[i][j] = input[i][j];
                sum += input[i][j];
                // System.out.print(input[i][j]+"\t");
            }
            result[i][3] = sum;
            sum = 0;
            //   System.out.println();
        }

        // System.out.println();
        
        for (int j=0; j<result[0].length; j++) {
            for (int i=0; i<result.length; i++) {
                sum += result[i][j];
            }
            result[4][j] = sum;
            sum = 0;
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