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

      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i]; j++) {
            total[i] += arr[i][j];
        }
      }
    return total;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] largest = new int[2];

      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i]; j++) {
            if (arr[i][j] > largest[i]) largest[i] = arr[i][j];
        }
      }
    return largest;
  }









}
