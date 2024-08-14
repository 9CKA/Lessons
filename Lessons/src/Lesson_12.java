public class Lesson_12 {

    public class Main {
        static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
            int sum = 0;
            if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(
                                "Неверные данные в ячейке " + (i + 1) + ", столбец " + (j + 1));
                    }
                }
            }
            return sum;
        }
    
        public static void main(String[] args) {
            String[][] array = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };
            try {
                System.out.println(sumArray(array));
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        }
    }
    
}
