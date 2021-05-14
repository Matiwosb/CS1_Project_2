import java.util.Scanner;

public class GradeScaleAvarage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String names[] = new String[5];
        double[] person1 = new double[4];
        double[] person2 = new double[4];
        double[] person3 = new double[4];
        double[] person4 = new double[4];
        double[] person5 = new double[4];
        //double average1;
        //char [] GradeLetter = new char[5];

        System.out.print("What is student 1 name? ");  //1
        names[0] = in.next();

        for(int i=0; i < 4;i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person1[i] = in.nextDouble();
        }
        System.out.print("What is student 2 name? "); //2
        names[1] = in.next();

        for(int i=0; i < 4; i++){
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person2[i] = in.nextDouble();
        }

        System.out.print("What is student 3 name? "); //3
        names[2] = in.next();

        for(int i=0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person3[i] = in.nextDouble();
        }
        System.out.print("What is student 4 name? "); //4
        names[3] = in.next();

        for(int i=0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person4[i] = in.nextDouble();
        }
        System.out.print("What is student 5 name? "); //5
        names[4] = in.next();

        for(int i=0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person5[i] = in.nextDouble();
        }
        double total1 = 0.0; //1
        for (int i = 0; i < person1.length; i++){
            total1 += person1[i];
        }
        double average1 = total1 / person1.length;
        System.out.println("Student Name: " + names[0] + " Grade: " + average1);

        double total2 = 0.0; //2
        for (int i = 0; i < person1.length; i++){
            total2 += person2[i];
        }
        double average2 = total2 / person2.length;
        System.out.println("Student Name: " + names[1] + " Grade: " + average1);

        double total3 = 0.0; //3
        for (int i = 0; i < person3.length; i++){
            total3 += person3[i];
        }
        double average3 = total3 / person3.length;
        System.out.println("Student Name: " + names[2] + " Grade: " + average1);

        double total4 = 0.0; //4
        for (int i = 0; i < person4.length; i++){
            total4 += person4[i];
        }
        double average4 = total4 / person4.length;
        System.out.println("Student Name: " + names[3] + " Grade: " + average1);

        double total5 = 0.0;
        for (int i = 0; i < person5.length; i++){
            total5 += person5[i];
        }
        double average5 = total5 / person5.length;
        System.out.println("Student Name: " + names[4] + " Grade: " + average1);

        if (average1 >= 90.0) {
            System.out.print('A');
        } else if (average1 >= 80.0)
        {
            System.out.print('B');
        } else if (average1 >= 70.0)
        {
            System.out.print('C');
        } else if (average1 >= 60.0)
        {
            System.out.print('D');
        }
        else {
            System.out.print('F');
        }




    }
}
