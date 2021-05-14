import java.util.Scanner;
public class GradeBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String names[] = new String[5];
        String letterGrades[] = {"A", "B", "C", "D", "F"};
        double[] person1 = new double[4];
        double[] person2 = new double[4];
        double[] person3 = new double[4];
        double[] person4 = new double[4];
        double[] person5 = new double[4];
        //double average1;
        //char [] GradeLetter = new char[5];

        System.out.print("Enter student 1 name? ");  //1
        names[0] = in.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person1[i] = in.nextDouble();
        }
        System.out.print("Enter student 2 name? "); //2
        names[1] = in.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person2[i] = in.nextDouble();
        }

        System.out.print("Enter student 3 name? "); //3
        names[2] = in.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person3[i] = in.nextDouble();
        }
        System.out.print("Enter student 4 name? "); //4
        names[3] = in.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person4[i] = in.nextDouble();
        }
        System.out.print("Enter student 5 name? "); //5
        names[4] = in.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("What are their 4 grades? " + (i + 1) + " grade is: ");
            person5[i] = in.nextDouble();
        }
        /*public static void double avarageScore(double total){
            double total1 = 0.0;

            for(int i = 0; i < person1.length; i++){
                total1 += person1[i];
            }
            double avarage1 = total1 / person1.length;

            return avarage1;
        }
        public static void letterGrade(double studentGrade){
            if (studentGrade >= 90.0 || studentGrade <= 100) {
                System.out.print('A');
            } else if (studentGrade >= 90.0 || studentGrade <= 80)
            {
                System.out.print('B');
            } else if (studentGrade >= 70.0 || studentGrade <= 60.0)
            {
                System.out.print('C');
            } else if (studentGrade >= 60.0)
            {
                System.out.print('D');
            }
            else {
                System.out.print('F');
            }
        }*/
    }
}
