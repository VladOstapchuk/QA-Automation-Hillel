package org.HomeWorksQAAutomationJava.HomeWork13_Sorting;

import java.util.*;

//зробив клас група, що виглядало природьо, щоб не накидувати просто в лист,
// а був якісь зрозумілий об'єкт
public class Group {
    private String name;
    private List<Student> group = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    //varargs, щоб не додавати по одному, і не думати скільки студентів в гупі
    public void addStudent(Student... student) {
        group.addAll(Arrays.asList(student));
    }

    //повертаю групу одразу відсортовану по вказаному в завданні принципу
    public List<Student> getStudents() {
        group.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (!Objects.equals(o1.getGrade(), o2.getGrade())) {
                    return o1.getGrade().compareTo(o2.getGrade());
                } else if (!Objects.equals(o1.getAge(), o2.getAge())) {
                    return o1.getAge().compareTo(o2.getAge());
                } else
                    return o1.getName().compareTo(o2.getName());
            }
        });
        return group;
    }
}
