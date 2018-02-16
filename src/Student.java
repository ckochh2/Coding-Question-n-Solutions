import java.util.Scanner;

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification,int [] testScores) {
                super(firstName, lastName, identification);
             //   for (int i=0;i<testScores.length;i++)
                    this.testScores=testScores;
    }


    char calculate(){
        int sum=0,avg=0;
        for(int i=0;i<testScores.length;i++)
        {
            sum = sum + testScores[i];
        }
        avg =sum/testScores.length;

        if(avg>=90 && avg<=100)
            return 'O';
        else if(avg>=80 && avg<=90)
            return 'E';
        else if(avg>=70 && avg<=80)
        return 'A';
        else if(avg>=55 && avg<=70)
            return 'P';
        else if(avg>=40 && avg<=55)
            return 'D';
        else
            return 'T';
    }

public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for(int i = 0; i < numScores; i++){
        testScores[i] = scan.nextInt();
    }
    scan.close();

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate());
}

}