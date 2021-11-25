/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.*;


public class Solution39{
    //main method
    public static void main(String[] args){
        //create a new map called Employee that consists of four strings: firstName, lastName, position, sepDate
        HashMap<String, String[]> employee= new HashMap();

        //creating list of all Employee objects (employees, their positions, and their separation dates)
        ArrayList<String[]> employeeList = new ArrayList<>();

        //fill the arraylist with the given data
        employeeList.add(employee.put("Johnson", new String[] {"John", "Manager", "2016-12-31"}));
        employeeList.add(employee.put("Xiong", new String[] {"Tou", "Software Engineer", "2016-10-05"}));
        employeeList.add(employee.put("Michaelson", new String[] {"Michaela", "District Manager", "2015-12-19"}));
        employeeList.add(employee.put("Jacobson", new String[] {"Jake", "Programmer", ""}));
        employeeList.add(employee.put("Jackson", new String[] {"Jacquelyn", "DBA", ""}));
        employeeList.add(employee.put("Webber", new String[] {"Sally", "Web Developer", "2015-12-18"}));

        //compares all last names using sortByLast method
        employeeList.sort(employee.getKey());

        //output sequence
        System.out.println("Name" + "                 |  " + "Position            | Separation Date");
        System.out.println("---------------------|----------------------|----------------");

        //for loop to output all employee parameters
        for (Employee emp : employeeList){
            if((emp.getFirst().length() + emp.getLast().length()+1) > 16){
                System.out.format("%s %s\t | %s\t\t| ", emp.getFirst(), emp.getLast(), emp.getPos());
                System.out.print(emp.getSepDate());
                System.out.println();
            } else if((emp.getFirst().length() + emp.getLast().length()+1) > 10) {
                System.out.format("%s %s\t\t | %s\t| ", emp.getFirst(), emp.getLast(), emp.getPos());
                System.out.print(emp.getSepDate());
                System.out.println();
            } else if((emp.getFirst().length() + emp.getLast().length()+1) < 10) {
                System.out.format("%s %s\t\t\t | %s\t| ", emp.getFirst(), emp.getLast(), emp.getPos());
                System.out.print(emp.getSepDate());
                System.out.println();
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
            <list of all employee parameters go here, im not typing it all our for psuedocode>
        }
        employeeList.sort(new LastSort)
        output: "Name" + "                 |  " + "Position            | Separation Date"
        output: ---------------------|----------------------|----------------
        for (Employee : employeeList){
            if((First.length + Last.length+1) > 16){
                output: First Last\t | Pos\t\t| SepDate\n
            } else if((First.length + Last.length+1) > 10) {
                output: First Last\t | Pos\t\t| SepDate\n
            } else if((First.length + Last.length+1) < 10) {
                output: First Last\t | Pos\t\t| SepDate\n
            }
        }
-------------------------
End of psuedocode
 */
