package lesson_5;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
       this message = message;
    }

    public MyArraySizeException(int rows, int columns, int expectedSize) {
        super(String.format("Неверный размер массива: %dx%d. Ожидается: %dx%d",
                rows, columns, expectedSize, expectedSize));

