public class PrintTable {
    static void printTable(int num, int i) {
        if (i == 0) {
            return;
        }
        printTable(num, i - 1);
        System.out.println(num + " * " + i + " = " + (num * i));
    }

    static String table(int num, int i) {
        if (i == 0) {
            return "";
        }
        String str = table(num, i - 1);

        str += num + " * " + i + " = " + (num * i) + "\n";
        return str;
    }

    public static void main(String[] args) {
        printTable(5, 10);
        System.out.print(table(5, 10));
    }
}
