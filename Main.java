import java.util.Scanner;

public class Main {
    static Management management=new Management();
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {


        while(true){
            System.out.println("please enter your username");
            String username=input.next();
            System.out.println("please enter your password");
            String password=input.next();
            switch (management.login(username,password)){
                case "prof":profMenu(username,password);break;
                case "employee":employeeMenu(username,password);break;
                case "student":studentMenu(username,password);break;
                case "undefined":
                    System.out.println("there is no acc with this username and password please try again!");
            }
        }
    }
public static void employeeMenu(String username,String password){
        boolean condition=true;
        while(condition){
            System.out.println("please enter 10 for adding student 11 for deleting student 12 for editing student");
            System.out.println("please enter 20 for adding prof 21 for deleting prof 22 for editing prof");
            System.out.println("please enter 30 for adding employee 31 for deleting employee 32 for editing employee");
            System.out.println("please enter 40 for adding course 41 for deleting course 42 for editing course");
            System.out.println("please enter 50 for showing your payment");
            System.out.println("please enter 60 for exit");
            int operator=input.nextInt();
            switch (operator){
                case 10:management.registerStudent();break;
                case 11:management.deletingStudent();break;
                case 12:management.editingStudent();break;
                case 20:management.registerProf();break;
                case 21:management.deletingProf();break;
                case 22:management.editingProf();break;
                case 30:management.registerEmployee();break;
                case 31:management.deletingEmployee();break;
                case 32:management.editingEmployee();break;
                case 40:management.registerCourse();break;
                case 41:management.deleteCourse();break;
                case 42:management.editingCourse();break;
                case 50:management.showingEmployeePayment(username);break;
                case 60:condition=false;break;
            }
        }
}
public static void studentMenu(String username,String password){
       boolean condition=true;
        while(condition){
            System.out.println("enter 1 for showing you details");
            System.out.println("enter 2 for showing courses");
            System.out.println("enter 3 for showing unit selection");
            System.out.println("enter 4 for showing your corses");
            System.out.println("enter 5 for exit");
            int operator=input.nextInt();
            switch (operator){
                case 1:management.showingStudentDetail(username);break;
                case 2:management.showingCourses();break;
                case 3:management.entekhabvahed(username);break;
                case 4:management.showingStudentCourses(username);break;
                case 5:condition=false;
            }
        }
}
public static void profMenu(String username,String password){
    boolean condition=true;
    while(condition){
        System.out.println("enter 1 for showing you details");
        System.out.println("enter 2 for submiting scores");
        System.out.println("enter 3 for showing your payment");
        System.out.println("enter 4 for exit");
        int operator=input.nextInt();
        switch (operator){
            case 1:management.showingProfDetail(username);break;
            case 2:management.submitingScores(username);break;
            case 3:
                System.out.println("enter your term for seeing your payment(like 1395/1)");
                management.showingProfPayment(username,input.next());break;
            case 4:condition=false;
        }
    }
}
}
