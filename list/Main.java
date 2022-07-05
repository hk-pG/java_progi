package list;

import java.util.ArrayList;
import java.util.stream.IntStream;

class Main {
    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        // Integer list test
        List<Integer> list = new List<Integer>(1);
        IntStream.range(2, 10).forEach(list::insertCellHead);
        list.printAllCells();

        // remove test
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(list.removeCell(1));
        test.add(list.removeCell(3));
        test.add(list.removeCell(5));
        list.printAllCells();

        test.forEach(System.out::println);
    }

    public static void Log(String message) {
        if (DEBUG) {
            System.out.println(message);
        }
    }
}