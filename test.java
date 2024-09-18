import java.util.Scanner;



public class test {
    public static void main(String[] args) {

        //Quistion1
//        for(int i=2;i<=20;i++){
//            if(i % 2 == 0)
//                System.out.println(i );
//
//        }
        //Quistion2

/*
        for (int dayNumber = 1; dayNumber <= 7; dayNumber++) {

            String dayName;
            switch (dayNumber) {
                case 1:
                    dayName = "Sunday";
                    break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Tuesday";
                    break;
                case 4:
                    dayName = "Wednesday";
                    break;
                case 5:
                    dayName = "Thursday";
                    break;
                case 6:
                    dayName = "Friday";
                    break;
                case 7:
                    dayName = "Saturday";
                    break;
                default:
                    dayName = "Invalid day";
                    break;
            }
            // Print the day name
            System.out.println(dayName);
        }
*/
        //Quistion3
        /*
        Scanner in = new Scanner(System.in);
        int num = 0;

        while (num >= 0) {
            System.out.println("enter positive number");

            num = in.nextInt();

            if (num < 0) {
                System.out.println("Negative number entered. ");
                break;
            }
            System.out.println("you enter number:"+num);

        }
       */

        //Quistion4
       /*
        int h = 5;

        for (int i = 1; i <= h; i++) {
            int mid = (h + 1) / 2;

            if (i == mid) {
                continue;
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
        */

        //Quistion5

/*
        Scanner in = new Scanner(System.in);
        int num;
        int sum=0;
        do {
            // Prompt the user to enter a number
            System.out.print("Enter a positive number : ");
            num = in.nextInt();


            if (num > 0) {
                sum =sum+num;
            }

        } while (num != 0);

        System.out.println("The sum of all positive integers is: " + sum);
        in.close();

        }
*/

        //Quistion6
/*
        for (int month = 1; month<= 12; month++) {

            String monthName;
            switch (month) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = "Invalid month";
                    break;
            }

            System.out.println("Month " + month + ": " + monthName);
        }

 */
        //Quistion7
        /*
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            if (i == 8) {
                break;
            }

            System.out.print(i + " ");
        }

         */
        //Quistion8
       /*
        Scanner in = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a number : ");
            num = in.nextInt();

            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
        in.close();

        */
        //Quistion9
/*
        for (int i = 1; i <= 15; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

 */
        /*
        //Quistion10
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        
         */
        // Sum of Even Numbers
/*
        int num;
        int sum=0;
        for (int i =1;i<=50;i++){
            if (i%2==0){
                sum=sum+i;
            }


        }
        System.out.println("the sum of all numbers:"+sum);
*/
//Multiplication Table
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("please enter number from 1 to 10");

        int num = in.nextInt();

        if (num>1&&num<10){
            System.out.println("Multiplication Table for " + num);
            for (int i = 1; i <= 10; i++) {
                int result = num* i;
                System.out.println(num+ " x " + i + " = " + result);
            }
        }
        in.close();

         */
/*
        //Factorial Calculation
        Scanner in = new Scanner(System.in);
        System.out.println("please enter number");
        int num = in.nextInt();

        int fact=1;
        int i =num;
        while (i>0){
            fact=fact*i;
            i--;

        }
        System.out.println("the factorial is:"+fact);

 */
        //Finding Maximum in Array
        /*
        int[] numbers = {2, 6, 5, 1, 20, 12, 9};
        int max=numbers[0];
        for (int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];

            }
        }
        System.out.println("the maximum:"+max);


         */

        //Counting Vowels in a String
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String st = in.nextLine();

        int count=0;

        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);

            switch (ch){
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case'i':
                    count++;
                    break;
                case'o':
                    count++;
                    break;
                case'u':
                    count++;
                    break;
                default:
                    break;


            }
        }
        System.out.println("the number of Volwels is :"+count);
        in.close();
        
    }
}

