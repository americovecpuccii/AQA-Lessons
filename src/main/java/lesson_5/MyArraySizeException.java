package lesson_5;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(int actualRows, int actualCols) {
        super(String.format("Неверный размер массива: %dx%d. Ожидается: 4x4",
                actualRows, actualCols));
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(int row, int col, String value) {
        super(String.format("Неверные данные в ячейке [%d][%d]: '%s' не является числом",
                row, col, value));
    }
}

