public class Lesson_12 {

    public static int sumArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + ", " + j + ": " + array[i][j] + " - это не число");
                }
            }
        }
        return result;
    }

    class MyArrayException extends Exception {
    }
    
    class MyArrayDataException extends MyArrayException {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
    
    class MyArraySizeException extends MyArrayException {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public class Main {
        public static void main(String[] args) {
            String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                
}
