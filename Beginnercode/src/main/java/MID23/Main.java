/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MID23;


 class Calculator {
    public int a;
    public int b;

    public Calculator(int firstNumber, int secondNumber) {
        this.a = firstNumber;
        this.b = secondNumber;
    }

    public int sum() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }


    public static class AdvancedCalculator extends Calculator {
        private int[] numbers;

        AdvancedCalculator(int firstNumber, int secondNumber, int[] numbers) {
            super(firstNumber, secondNumber);
            this.numbers = numbers;
        }

        @Override
        public int sum() {
            int sum = super.sum(); // Calling the sum() method from the parent class

            for (int number : numbers) {
                sum += number; // Adding each element of numbers[] to the sum
            }

            return sum;
        }
    }

    public class Main {
        public static void main(String[] args) {
            AdvancedCalculator c = new AdvancedCalculator(1, 2, new int[]{3, 4, 5});
            System.out.println("Subtraction result: " + c.subtract());
            System.out.println("Summation result: " + c.sum());
        }
    }
}
