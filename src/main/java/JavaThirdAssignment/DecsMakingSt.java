package JavaThirdAssignment;

public class DecsMakingSt {
    int height = 0, width = 0;
    int age = 0;

    public DecsMakingSt(int height, int width, int age) {
        this.height = height;
        this.width = width;
        this.age = age;
    }

    public void getPhysicalState() {
        // Simple if statement
        if (height == 0 && width == 0) {
            System.out.println("Height and width can not be zero. Please check again");
        }
        //if-else statements
        if (height < 2 && width < 20) {
            System.out.println("Not eligible to checking physical state");
        } else {
            // ladder
            if ((height >= 5 && height < 6) && (width >= 75 && width < 80)) {
                System.out.println("Good physical state");

            } else if ((height >= 4 && height < 5) && (width >= 60 && width < 70)) {
                System.out.println("Good physical state");
            } else {
                //nested if
                if (height > 0 && width > 0) {
                    if (age > 10) {
                        System.out.println("need to improve yourselves");
                    } else {
                        System.out.println("Age should not below 10");
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        DecsMakingSt dst = new DecsMakingSt(10, 54, 12);
        dst.getPhysicalState();
    }
}
