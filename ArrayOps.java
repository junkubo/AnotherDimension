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
        for (int j = 0; j < matrix[i].length; j++) {
            total[i] += matrix[i][j];
        }
      }
    return total;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] largest = new int[2];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] > largest[i]) largest[i] = matrix[i][j];
        }
      }
    return largest;
  }

  public static int sum (int[][] matrix) {
    int total =0;

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            total += matrix[i][j];
        }
      }
    return total;
  }


  public static int[] sumCols (int[][] matrix) {
    int[] total = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        total[i] = matrix[0][i] + matrix[1][i];
        }
      }
    return total;
  }

  public static boolean isRowMagic (int[][] matrix) {
    int total1 = sum(matrix[0]);
    int total2 = sum(matrix[1]);

    return total1 == total2;

  }
  public static boolean isColMagic (int[][] matrix) {

    int[] total = new int[matrix[0].length];
    for (int j = 0; i < matrix[0].length; j++) {
      for (int i = 0; i < matrix.length; i++) {
        total[j] += matrix[i][j];
      }
    }
    for (int i = 1; i < total.length; i++) {
      if (total[i] != total[i-1]) return false;
    }
    return true;
  }

  public static boolean isColMagic (int[][] matrix) {

    int[] total = new int[matrix[0].length];
    for (int j = 0; i < matrix[0].length; j++) {
      for (int i = 0; i < matrix.length; i++) {
        total[j] += matrix[i][j];
      }
    }
    for (int i = 1; i < total.length; i++) {
      if (total[i] != total[i-1]) return false;
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int sumCol = 0;
    int sumRow = 0;

    sumRow = sum(matrix[row]);
    sumCol = sumCol(matrix);

    return sumRow == sumCol; 
  }

}
