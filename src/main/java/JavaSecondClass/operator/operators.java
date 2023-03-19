package JavaSecondClass.operator;

public class operators {
    public static void main(String[] args) {
        String action = "Arithmetic";
        boolean isPerform = false;
        String mathExpression = "sumAndMultiplyAndDivisionAndSubtractionAndModulus";
        //And or logical statement
        if ((action.equals("Arithmetic") && mathExpression.equals("sumAndMultiplyAndDivisionAndSubtractionAndModulus")) || isPerform) {
            System.out.println("Arithmetic Operation");

            System.out.println("Print 1 to n and sum 1 to n and multiply");
            int n = 10, sum = 0, mul = 1, m = n;
            for (int i = 0; i < n; ) {

                System.out.print(++i + " "); //++ operator
                sum += i; // summation
                mul *= i; // multiplication
            }

            System.out.println("");
            System.out.println("Summation--> " + sum + " Multiplication--> " + mul);
            System.out.println("The modulus operation of sum and mul is-->" + mul % sum); //modulus
            System.out.println("The division operation of mul and sum--> " + mul / sum); // division
            System.out.println(mul - sum); //subtraction
            System.out.println("Print 1 to n and sum 1 to n and subtraction division");
            for (int i = 0; i < n; i++) { //++ operator
                System.out.print(--m + " "); //--operator
            }

            System.out.println("");
            //swap mul and sum by /= and /= operator
            sum *= mul;
            mul = sum / mul;
            sum /= mul;
            System.out.println("After the swapping the mul is-->" + mul + " The sum is--> " + sum);

            //ternary operator
            int maxNum = (mul > sum) ? mul : sum;

            System.out.println("The max number between mul and sum is -->" + maxNum);

            //Relational operator
            System.out.println("mul < sum -->" + (mul < sum));
            System.out.println("mul > sum -->" + (mul > sum));
            System.out.println("mul >= sum -->" + (mul >= sum));
            System.out.println("mul <= sum -->" + (mul <= sum));
            System.out.println("mul == sum -->" + (mul == sum));
            System.out.println("mul != sum -->" + (mul != sum));
        }
    }
}
