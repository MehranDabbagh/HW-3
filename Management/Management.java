package Management;

import Entities.Course;
import Entities.Employee;
import Entities.Prof;
import Entities.Student;

import java.util.Objects;
import java.util.Scanner;

public class Management {
    private Student[] students;
    private Employee[] employees;
    private Prof[] profs;
    private Course[] courses;
    private int studentIndex;
    private int profIndex;
    private int employeeIndex;
    private int courseIndex;
    Scanner input=new Scanner(System.in);
    public Management() {
        students=new Student[20];
        employees=new Employee[20];
        profs=new Prof[20];
        courses=new Course[20];
        employees[0]=new Employee("ali","ahmadi","admin","admin");
        studentIndex=0;
        profIndex=0;
        courseIndex=0;
        employeeIndex=1;

    }
    public void registerStudent() {
        System.out.println("please enter firstname:");
        String firstname=input.next();
        System.out.println("please enter lastname:");
        String lastname=input.next();
        System.out.println("please enter username:");
        String username=input.next();
        System.out.println("please enter password:");
        String password=input.next();
        students[studentIndex]=new Student(firstname,lastname,username,password);
        studentIndex++;
        System.out.println("done!");
    }
    public void deletingStudent(){
        System.out.println("please enter student's username:");
        String username=input.next();
        for (int i=0;i<studentIndex;i++){
            if(students[i]!=null){
            if(Objects.equals(students[i].getUsername(), username)){
                students[i]=null;
                return;
            }
        }}
        System.out.println("there is no Entities.Student with this username!");

    }
    public void editingStudent(){
        System.out.println("please enter student's username:");
        String username=input.next();
        for (int i=0;i<studentIndex;i++){
            if(students[i]!=null){
            if(Objects.equals(students[i].getUsername(), username)){
                System.out.println("please enter 0 for editing firstname,1 for last name,2 for username,3 for password");
               int operator=input.nextInt();
                System.out.println("enter the new value:");
               String newvalue=input.next();
               switch (operator){
                   case 0:students[i].setFirstname(newvalue);return;
                   case 1:students[i].setLastname(newvalue);return;
                   case 2: students[i].setUsername(newvalue);return;
                   case 3: students[i].setPassword(newvalue);return;
               }
            }}
        }
        System.out.println("there is no student with this username!");
    }
    public void registerProf(){
        System.out.println("please enter firstname:");
        String firstname=input.next();
        System.out.println("please enter lastname:");
        String lastname=input.next();
        System.out.println("please enter username:");
        String username=input.next();
        System.out.println("please enter password:");
        String password=input.next();
        System.out.println("please enter type(hagholtadris/heyatelmi):");
        String type=input.next();
        profs[profIndex]=new Prof(firstname,lastname,username,password,type);
        profIndex++;
        System.out.println("done!");
    }
    public void deletingProf(){
        System.out.println("please enter prof's username:");
        String username=input.next();
        for (int i=0;i<profIndex;i++){
            if(profs[i]!=null){
            if(Objects.equals(profs[i].getUsername(), username)){
                profs[i]=null;
                return;
            }
        }}
        System.out.println("there is no prof with this username!");
    }
    public void editingProf(){
        System.out.println("please enter prof's username:");
        String username=input.next();
        for (int i=0;i<profIndex;i++){
            if(profs[i]!=null){
            if(Objects.equals(profs[i].getUsername(), username)){
                System.out.println("please enter 0 for editing firstname,1 for last name,2 for username,3 for password,4 for type");
                int operator=input.nextInt();
                System.out.println("enter the new value:");
                String newvalue=input.next();
                switch (operator){
                    case 0:profs[i].setFirstname(newvalue);
                    case 1:profs[i].setLastname(newvalue);
                    case 2:profs[i].setUsername(newvalue);
                    case 3:profs[i].setPassword(newvalue);
                    case 4:profs[i].setType(newvalue);
                }
            }}
        }
        System.out.println("there is no prof with this username!");
    }
    public void registerEmployee(){
        System.out.println("please enter firstname:");
        String firstname=input.next();
        System.out.println("please enter lastname:");
        String lastname=input.next();
        System.out.println("please enter username:");
        String username=input.next();
        System.out.println("please enter password:");
        String password=input.next();
        employees[employeeIndex]=new Employee(firstname,lastname,username,password);
employeeIndex++;
    }
    public void deletingEmployee(){
        System.out.println("please enter employee's username:");
        String username=input.next();
        for (int i=0;i<employeeIndex;i++){
            if(employees[i]!=null){
            if(Objects.equals(employees[i].getUsername(), username)){
                employees[i]=null;
                return;
            }
        }}
        System.out.println("there is no employee with this username!");
    }
    public void editingEmployee(){
        System.out.println("please enter employee's username:");
        String username=input.next();
        for (int i=0;i<employeeIndex;i++){
            if(employees[i]!=null){
            if(Objects.equals(employees[i].getUsername(), username)){
                System.out.println("please enter 0 for editing firstname,1 for last name,2 for username,3 for password");
                int operator=input.nextInt();
                System.out.println("enter new value:");
                String newvalue=input.next();
                switch (operator){
                    case 0:employees[i].setFirstname(newvalue);return;
                    case 1:employees[i].setLastname(newvalue);return;
                    case 2: employees[i].setUsername(newvalue);return;
                    case 3: employees[i].setPassword(newvalue);return;
                }
                return;
            }
        }}
        System.out.println("there is no employee with this username!");
    }
    public void registerCourse(){
        System.out.println("please enter coursename:");
        String coursename=input.next();
        System.out.println("please enter profname:");
        String profname=input.next();
        System.out.println("please enter term(like 1395/1):");
        String term=input.next();
        System.out.println("please enter unit:");
        int unit=input.nextInt();
        courses[courseIndex]=new Course(coursename,profname,term,unit);
        courseIndex++;
        System.out.println("done!");
    }
    public void deleteCourse(){
        System.out.println("enter the course's name:");
        String name=input.next();
        for (int i=0;i<courseIndex;i++){
            if(courses[i]!=null){
                if(Objects.equals(courses[i].getName(), name)){
                    courses[i]=null;
                    return;
                }
            }
        }
        System.out.println("there is no course with this name!");
    }
    public void editingCourse(){
        System.out.println("enter the course's name:");
        String name=input.next();
        for (int i=0;i<courseIndex;i++){
            if(courses[i]!=null){
                if(Objects.equals(courses[i].getName(), name)){
                    System.out.println("please enter 0 for editing coursename,1 for  profname,2 for term(like 1395-1),3 for unit");
                    int operator=input.nextInt();
                    System.out.println("enter new value:");
                    String newvalue=input.next();
                    switch (operator){
                        case 0:courses[i].setName(newvalue);return;
                        case 1:courses[i].setProfname(newvalue);return;
                        case 2: courses[i].setTerm(newvalue);return;
                        case 3: courses[i].setUnit(Integer.parseInt(newvalue));return;
                    }
                    return;
                }
            }
        }
        System.out.println("there is no course with this name!");
    }
    public void showingEmployeePayment(String username){
        for (int i=0;i<employeeIndex;i++){
            if(employees[i]!=null){
                if(Objects.equals(employees[i].getUsername(), username)){
                    System.out.println("firstname:"+employees[i].getFirstname()+" lastname:"+employees[i].getLastname()+" payment:"+employees[i].getPayment());
                    return;
                }
            }}
    }
    public void showingStudentDetail(String username){
        for (int i=0;i<studentIndex;i++){
            if(students[i]!=null){
                if(Objects.equals(students[i].getUsername(), username)){
                    System.out.println("firstname:"+students[i].getFirstname()+" lastname:"+students[i].getLastname());
                }
            }
        }
    }
    public void showingCourses(){
        for (int i=0;i<courseIndex;i++){
          if(courses[i]!=null){
              System.out.println(i+"."+"course name:"+courses[i].getName()+" profname:"+courses[i].getProfname()+" term:"+courses[i].getTerm()+" unit:"+courses[i].getUnit());
          }
        }
    }
    public void entekhabvahed(String username){
for(int i=0;i<studentIndex;i++){
    if(students[i]!=null){
        if(Objects.equals(students[i].getUsername(), username)){
            showingCourses();
            System.out.println("please enter course's id:");
            int course=input.nextInt();
            if(course<courseIndex && courses[course]!=null){
                String[] lastterm=courses[course].getTerm().split("/");
                if(Objects.equals(lastterm[1], "1")){
                    lastterm[0]=String.valueOf(Integer.parseInt(lastterm[0])-1);
                    lastterm[1]="2";
                }else if(Objects.equals(lastterm[1], "2")){
                    lastterm[1]="1";
                }
                String exTerm=lastterm[0]+"/"+lastterm[1];
                if(students[i].averageScorePerTerm(exTerm)>18){
                   if(students[i].unitPerTerm(courses[course].getTerm())<(24-courses[course].getUnit())){
                       students[i].entekhabvahed(courses[course]);
                   }else System.out.println("you can not pick this course it is gonna be more than 24 unit!");
                }else{
                    if(students[i].unitPerTerm(courses[course].getTerm())<(20-courses[course].getUnit())){
                        students[i].entekhabvahed(courses[course]);
                    }else System.out.println("you can not pick this course it is gonna be more than 20 unit!");
                }
            }else System.out.println("this number is invalid please try again!");


        }
    }
}
    }
    public void showingProfDetail(String username){
        for(int i=0;i<profIndex;i++){
            if(profs[i]!=null){
                if(Objects.equals(profs[i].getUsername(), username)){
                    System.out.println("firstname:"+profs[i].getFirstname()+" lastname:"+profs[i].getLastname()+" type:"+profs[i].getType());
                }
            }
        }
    }
    public void submitingScores(String username){
        System.out.println("please enter the student's username:");
        String student=input.next();
        System.out.println("please enter the course's username:");
        String course=input.next();
        System.out.println("please enter th score (0-20)");
        int score=input.nextInt();
        if(score<0 || score >20){
            System.out.println("undefined!");
            return;
        }
        for(int i=0;i<studentIndex;i++){
            if(students[i]!=null){
                if(Objects.equals(students[i].getUsername(), student)){
                    if(students[i].submitingScore(course,username,score)){
                        System.out.println("done");
                    }else System.out.println("undefined!");
                }
            }
        }

    }
    public void showingProfPayment(String  username,String term){
        for(int i=0;i<profIndex;i++){
            if(profs[i]!=null){
              if(Objects.equals(profs[i].getUsername(), username)){
                  int sum=0;
                 for(int j=0;j<courseIndex;j++){
                     if(Objects.equals(courses[j].getProfname(), profs[i].getLastname()) && Objects.equals(courses[j].getTerm(), term)){
                         sum+=courses[j].getUnit();
                     }
                 }
                  if(Objects.equals(profs[i].getType(), "hagholtadris")){
                      System.out.println("MR/MS"+profs[i].getFirstname()+" "+profs[i].getLastname()+" your salary is:"+(sum*1000000)+"TOOMAN");
                  } else if(Objects.equals(profs[i].getType(), "heyatelmi")){
                      System.out.println("MR/MS"+profs[i].getFirstname()+" "+profs[i].getLastname()+" your salary is:"+((sum*1000000)+5000000)+"TOOMAN");

                  }
              }
            }
        }
    }
    public String login(String username,String password){
        for(int i=0;i<profIndex;i++){
            if(profs[i]!=null){
            if(Objects.equals(profs[i].getUsername(), username) && Objects.equals(profs[i].getPassword(), password)){
                return "prof";
            }
        }}
        for(int i=0;i<employeeIndex;i++){
            if(employees[i]!=null){
            if(Objects.equals(employees[i].getUsername(), username) && Objects.equals(employees[i].getPassword(), password)){
                return "employee";
            }
        }}
        for(int i=0;i<studentIndex;i++){
            if(students[i]!=null){
            if(Objects.equals(students[i].getUsername(), username) && Objects.equals(students[i].getPassword(), password)){
                return "student";
            }
        }}
        return "undefined";
    }
    public void showingStudentCourses(String username){
        for(int i=0;i<studentIndex;i++){
            if(students[i]!=null){
                if(Objects.equals(students[i].getUsername(), username)){
                    students[i].showingCourses();
                }
            }
        }
    }
}

