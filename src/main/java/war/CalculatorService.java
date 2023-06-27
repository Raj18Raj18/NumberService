package war;

public class CalculatorService {
        public boolean checkPositive(int inputNumber) {
                boolean isPositive = false;

                // Lets include 0 as it is
                // neither positive nor negative
                if (inputNumber >= 0) {
                        isPositive = true;
                }
                return isPositive;
        }

        public boolean checkNegative(int inputNumber) {

                boolean isNegative = false;

                // Lets include 0 as it is
                // neither positive nor negative
                if (inputNumber <= 0) {
                        isNegative = true;
                }
                return isNegative;

        }

        public boolean checkEvenNumber(int inputNumber) {
                boolean isEven = false;
                if (Math.abs(inputNumber) % 2 == 0) {
                        isEven = true;
                }
                return isEven;
        }

        public boolean checkOddNumber(int inputNumber) {
                boolean isOdd = false;
                if (Math.abs(inputNumber) % 2 == 1) {
                        isOdd = true;
                }
                return isOdd;
        }

        // Similarly we can write so many methods to check
        // whether is it divisible by 6, 9 etc.,
        public boolean checkWhetherPrimeOrNot(int inputNumber) {
                boolean isPrime = true;
                int checkingNumber = Math.abs(inputNumber) / 2;
                for (int idx = 2; idx <= checkingNumber; idx++) {
                        if (inputNumber % idx == 0) {
                                isPrime = false;
                                // Once we get the satisfying condition,
                                // we need to come out of the loop
                                break;
                        }
                }
                return isPrime;
        }
}
