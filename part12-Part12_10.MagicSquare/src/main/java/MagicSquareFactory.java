public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int row = 0, col = square.getWidth() / 2;

        for (int count = 1; count <= size * size; count++) {

            if (count == 1) {
                square.placeValue(col, row, count);
                continue;
            }

            col++;
            if (col > square.getWidth() - 1) {
                col = 0;
            }
                

            row--;
            if (row < 0) {
                row = square.getHeight() - 1;
            }

            while (true) {
                int value = square.readValue(col, row);
                if (value != 0) {
                    row+=2;
                    col--;
                    if (row > square.getHeight() - 1) {
                        row -= square.getHeight();
                    }
                    if(col < 0) {
                        col += square.getWidth();
                    }
                } else if (value == 0) {
                    square.placeValue(col, row, count);
                    break;
                }
            }
        }
        return square;
    }

    // implement the creation of a magic square with the Siamese method algorithm
    // here
}
