/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.*;


record Employee(String first, String last, String position, String sepDate) {
    //getters/setters
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public String getPos() {
        return position;
    }
    public String getSepDate() {
        return sepDate;
    }
}

//class to sort by employee last name
//this is so much easier than how I did it before
class LastSort implements Comparator<Employee>{
    //sonarLint said I needed this override but idk what it does tbh
    @Override

    //uses a comparator to compare last names of Employee objects
    public int compare(Employee o1, Employee o2){
        //returns whichever last name comes first
        return o1.getLast().compareTo(o2.getLast());
    }
}

public class Solution40{
    //main method
    public static void main(String[] args){
        //initialize input scanner
        Scanner input = new Scanner(System.in);

        //creating list of all Employee objects (employees, their positions, and their separation dates)
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        //compares all last names using LastSort class comparator and sort method combined
        employeeList.sort(new LastSort());

        //output requesting user input for a search
        System.out.print("Enter a search string: ");
        String search = input.nextLine();

        //output sequence for search results
        System.out.println("\nResults:\n");
        System.out.printf("%-20s | %-20s | %-20s%n", "Name", "Position", "Seperation Date");
        System.out.printf("%s|%s|%s%n", "-".repeat(21), "-".repeat(22), "-".repeat(21));
        //for loop for employee parameter output if the first or last name contain search criteria
        for(Employee emp : employeeList) {
            if(emp.getFirst().contains(search) || emp.getLast().contains(search)) {
                System.out.printf("%-20s | %-20s | %-20s%n", emp.getFirst() + " " +
                        emp.getLast(), emp.getPos(), emp.getSepDate());
            }
        }
    }
}

/*
Start of psuedocode:
-------------------------
class Employee{
    final String first
    final String last
    final String position
    final String sepDate
    Employee(String first, String last, String position, String sepDate){
        this.first = first;
        this.last = last;
        this.position = position;
        this.sepDate = sepDate;
    }
    public String getFirst(){
        return first
    }
    public String getLast(){
        return last
    }
    public String getPos(){
        return position
    }
    public String getSepDate(){
        return sepDate
    }
}
class LastSort{
    compare(Employee o1, Employee o2){
        return o1.getLast().compareTo(o2.getLast())
    }
}
class Solution{
    void method main(){
        List<Employee> employeeList:{
            <list of all employee parameters go here, im not typing it all out for psuedocode>
        }
        employeeList.sort(new LastSort)
        output: Enter a search string:
        String input: search
        output: Results:\n
        output: Name                 | Position            | Seperation Date
        output: ---------------------|---------------------|---------------------\n
        for(Employee emp : employeeList) {
            if(first contains(search) || last contains(search)){
                output: first + " " + last, pos, sepDate
            }
        }
-------------------------
End of psuedocode
 */