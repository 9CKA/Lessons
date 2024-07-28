public class Lesson_7 {

  public static void main(String[] args) {
    printThreeWords(); // задание1
    checkSumSign(); // задание2
    printColor(); // задание3
    compareNumbers(); // задание4
    System.out.println(between10And20(3, 13)); // задание5
    zeroPlus(33); // задание6
    System.out.println(zeroPlus1(22)); //задание7
    printLine("lineString", 3); // задание8
    System.out.println(years4Else(401)); //задание9
    int[] binaryArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }; // задание10
    invertBinaryArray(binaryArray);
    printArray(binaryArray);
    int[] array100 = new int[100]; // задание11
    fillArray(array100);
    printArray(array100);
    int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; // задание12
    multiplyIfLessThanSix(array);
    printArray(array);
    int[][] squareArray = new int[5][5]; // задание13
    fillDiagonals(squareArray);
    print2DArray(squareArray);
    int[] customArray = createArray(5, 7); // задание14
    printArray(customArray);

  }

  public static void printThreeWords() {
    System.out.println("Orange\nBanana\nApple");
  }

  public static void checkSumSign() {
    int a = 2;
    int b = -4;
    if (a + b >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  public static void printColor() {
    int value = 5;
    if (value <= 0) {
      System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
      System.out.println("Жёлтый");
    } else {
      System.out.println("Зелёный");
    }

  }

  public static void compareNumbers() {
    int a = 6;
    int b = 7;
    if (a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }

  }

  public static boolean between10And20(int a, int b) {
    if ((a + b) >= 10 && (a + b) <= 20) {
      return true;
    } else {
      return false;
    }
  }

  public static void zeroPlus(int a) {
    if (a >= 0) {
      System.out.println("Положительное");
    } else {
      System.out.println("Отрицательное");
    }
  }

  public static boolean zeroPlus1(int a) {
    if (a >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void printLine(String lineString, int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(lineString);
    }
  }

  public static boolean years4Else(int year) {
    if (!(year % 4 == 0 || ((year % 100 == 0) && !(year % 400 == 0)))) {
      return true;
    } else {
      return false;
    }
  }

  public static void invertBinaryArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (array[i] == 0) ? 1 : 0;
    }
  }

  public static void fillArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
  }

  public static void multiplyIfLessThanSix(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 6) {
        array[i] *= 2;
      }
    }
  }

  public static void fillDiagonals(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      array[i][i] = 1; 
    }
  }

  public static int[] createArray(int len, int initialValue) {
    int[] array = new int[len];
    for (int i = 0; i < len; i++) {
      array[i] = initialValue;
    }
    return array;
  }

  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void print2DArray(int[][] array) {
    for (int[] row : array) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }

}
