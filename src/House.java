// Author: Samuel S. Cho
// Created: Sept. 2023
// Permission to distribute, copy, and use *without* modification
// or *with* modifications if updates documented. No warranty given or implied.
// Update Author:
// Update Date:
// Update Description:
import java.util.ArrayList;
public class House {
    ArrayList<Student> studentList;
    int houseIndex;

    // default constructor
    public House() {
        studentList = new ArrayList<Student>();
        houseIndex = -1;
    }

    // overloaded constructor
    public House(int h) {
        studentList = new ArrayList<Student>();
        houseIndex = h;
    }

    // converts the integer value of a house into an alphanumeric string name
    public String getHouseName(int h) {
        String Name;
        switch(h) {
            case 1:
                Name = "Gryffindor";
                break;
            case 2:
                Name = "Hufflepuff";
                break;
            case 3:
                Name = "Ravenclaw";
                break;
            case 4:
                Name = "Slytherin";
                break;
            case 0:
                Name = "Muggles";
                break;
            default:
                Name = "";
                break;
        }
        return Name;
    }

    // checks if the student list is empty
    public Boolean isEmpty() {
        return studentList.isEmpty();
    }

    // add student to house (at the end of list)
    public void addStudent(String name, int h) {
        Student wiz = new Student(name, h);
        studentList.add(wiz);
    }

    // remove a single student from house (at the end of list) and return it
    public Student removeStudent() {
        Student last = studentList.get(studentList.size() - 1);
        studentList.remove(studentList.size() - 1);
        return last;
    }
    // retrieve the number of students in the house
    public int getSize() {
        return studentList.size();
    }

    // Print House
    public void printHouse() {
        // FINISH ME
     }

    // Empty House
    public void emptyHouse() {
        // FINISH ME
    }
}
