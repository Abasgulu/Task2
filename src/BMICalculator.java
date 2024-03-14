import java.util.Scanner;



    public class BMICalculator {

        static void CalculateBMI(float weight, float height) {

            float BMI = weight / (height * height);


            System.out.println("\nYour BMI value: " + BMI);

            if(BMI <=16.0)
                System.out.println("starvation!");
            else if(BMI > 16.00 && BMI <= 16.99)
                System.out.println("emaciation)");
            else if(BMI > 17.00 && BMI <= 14.99)
                System.out.println("inderweight)");
            else if(BMI > 18.50 && BMI <= 22.99)
                System.out.println("nomral,low range)");
            else if(BMI > 23.00 && BMI <= 14.99)
                System.out.println("nomral,high range)");
            else if(BMI > 25.00 && BMI <= 27.49)
                System.out.println("overweight,low range)");
            else if(BMI > 27.50 && BMI <= 29.99)
                System.out.println("overweight,high range)");
            else if(BMI > 30.00 && BMI <= 34.9)
                System.out.println("1st degree obesity)");
            else if(BMI > 35.00 && BMI <= 39.9)
                System.out.println("2nd degree obesity)");
            else
                System.out.println("3nd degree obesity");

        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("BMI CALCULATOR");
            System.out.print("Enter your weight in kg: ");
            float weight = sc.nextFloat();
            System.out.print("Enter your height in cm: ");
            float height = sc.nextFloat();

            CalculateBMI(weight, height);
        }

    }

