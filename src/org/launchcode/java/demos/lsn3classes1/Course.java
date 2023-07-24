package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private ArrayList<Student> enrolledStudents = new ArrayList<>();
    private String subject;
    private Teacher instructor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return subject.equals(course.subject) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, instructor);
    }
}
