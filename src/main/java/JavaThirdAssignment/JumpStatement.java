package JavaThirdAssignment;

public class JumpStatement {
    int number;

    public JumpStatement(int number) {
        this.number = number;
    }

    public void jumpStatement() {
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0)
                continue;
            if (i == 31)
                break;
            System.out.printf(" " + i);

        }
    }

    public static void main(String[] args) {
        JumpStatement js = new JumpStatement(50);
        js.jumpStatement();
    }
}
