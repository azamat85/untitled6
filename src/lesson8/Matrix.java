package lesson8;


public class Matrix implements IMatrix {
    private int[][] matrix;

    public Matrix() {
        this.matrix = new int[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {

        if (rowIndex > matrix.length || colIndex > matrix[0].length)
            return -1;
        return this.matrix[rowIndex - 1][colIndex - 1];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || colIndex > matrix[0].length) {

        } else {
            this.matrix[rowIndex - 1][colIndex - 1] = (int) value;
        }
    }

    @Override

    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        metka:
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.getRows() != otherMatrix.getRows() && this.getColumns() != otherMatrix.getColumns()) {
                    System.out.println("ошибка");
                    break metka;
                }
            }
        }
        IMatrix mm = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
//                this.getValueAt(i, j);
//                otherMatrix.getValueAt(i, j);
                mm.setValueAt(i + 1, j + 1, getValueAt(i + 1, j + 1) + otherMatrix.getValueAt(i + 1, j + 1));
            }
        }
        return mm;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        metka:
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.getRows() != otherMatrix.getRows() && this.getColumns() != otherMatrix.getColumns()) {
                    System.out.println("ошибка");
                    break metka;
                }
            }
        }
        IMatrix mm = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                mm.setValueAt(i + 1, j + 1, getValueAt(i + 1, j + 1) - otherMatrix.getValueAt(i + 1, j + 1));
            }
        }
        return mm;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        metka:
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.getRows() != otherMatrix.getColumns() && this.getColumns() != otherMatrix.getRows()) {
                    System.out.println("ошибка");
                    break metka;
                }
            }
        }
        IMatrix mm = new Matrix(this.getRows(), this.getColumns());
        for (int i =0; i < this.getRows(); i++) {
            for (int u = 0; u < otherMatrix.getColumns(); u++) {
                for (int j = 0; j < otherMatrix.getRows(); j++) {
                    mm.setValueAt(i + 1, u + 1, getValueAt(i + 1, j + 1) * otherMatrix.getValueAt(j + 1, u + 1)
                            + mm.getValueAt(i + 1, u+1 ));
                }
//                mm.setValueAt(i + 1, j + 1, getValueAt(i + 1, j + 1) * otherMatrix.getValueAt(i + 1, j + 1));
            }
        }
        return mm;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrix mm = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.matrix.length - 1; i++) {
            for (int j = 0; j < this.matrix[i].length - 1; j++) {
                this.getValueAt(i, j);
                mm.setValueAt(i, j, getValueAt(i, j) * value);
            }
        }
        return mm;
    }

    @Override
    public IMatrix transpose() {
        IMatrix mm = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                mm.setValueAt(j + 1, i + 1, getValueAt(i + 1, j + 1));
            }
        }
        return mm;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.setValueAt(i + 1, j + 1, value);
            }
        }
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        int count3 = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                count3++;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (i == j && this.matrix[i][j] == 1) {
                    count1++;
                } else if (this.matrix[i][j] == 0) {
                    count2++;
                }
            }
        }
        if (count1 == this.matrix.length && count3 - count1 == count2) {

            return true;
        }
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.matrix.length == this.matrix[i].length) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
