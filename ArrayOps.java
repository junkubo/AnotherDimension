class ArrayOps {

  public static int sum(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }
    return total;
  }
  public static  int largest(int[]arr) {
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] total = new int[2];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < [i]; j++) {
            total[i] += matrix[i][j];
        }
      }
    return total;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] largest = new int[2];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < arr[i]; j++) {
            if (matrix[i][j] > largest[i]) largest[i] = matrix[i][j];
        }
      }
    return largest;
  }

  public static int[] sum (int[][] matrix) {
    int[] total = new int[2];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i]; j++) {
            total[i] += matrix[i][j];
        }
      }
    return total;
  }







}
