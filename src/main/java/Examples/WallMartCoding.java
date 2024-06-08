package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WallMartCoding {

    public static void main(String[] args) {

        Student s1 = new Student("stud1",589L);
        Student s2 = new Student("BOB",250L);
        Student s3 = new Student("stud3",433L);
        Student s4 = new Student("stud4",600L);
        Student s5 = new Student("ALEX",250L);

        List<Student > studenList = new ArrayList<Student>();
        studenList.add(s1);
        studenList.add(s2);
        studenList.add(s3);
        studenList.add(s4);
        studenList.add(s5);

        sortStudentsOnMarks(studenList);
        System.out.println(studenList);

    }
    public static void sortStudentsOnMarks(List<Student>studentList){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getMarks()>o1.getMarks()){
                    return 1;
                }
                else if(o2.getMarks()<o1.getMarks()){
                    return -1;
                }
                return o1.getName().compareTo(o2.getName());

            }
        });
    }
}
