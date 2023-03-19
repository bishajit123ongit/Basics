package JavaThirdAssignment;

public class LoopStatement {
    int number;

    public LoopStatement(int number) {
        this.number = number;

    }

    public void printEvenNumberForLoop() {
        System.out.println("\nThe even numbers by for loop");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n================");
    }

    public void printEvenNumberWhileLoop() {
        System.out.println("The even numbers by while loop");
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("\n================");
    }

    public void printEvenNumberDoWhileLoop() {
        System.out.println("\nThe even numbers by Do while loop");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= number);
    }


    public void ForEachLoop() {
        System.out.println("The even numbers by for each loop");
        int array[] = {1, 2, 3, 4, 5, 6};
        for (int number : array) {
            System.out.printf(" number-> " + number);
        }
    }

    public static void main(String[] args) {
        LoopStatement ls = new LoopStatement(10);
        ls.printEvenNumberDoWhileLoop();
        ls.printEvenNumberForLoop();
        ls.printEvenNumberForLoop();
        ls.ForEachLoop();
    }
}
