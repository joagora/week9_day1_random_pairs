import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<Student>();
        addStudentsToCohort();
    }

    public void addStudentsToCohort(){
        this.students.add(new Student("Raphael"));
        this.students.add(new Student("Joanna"));
        this.students.add(new Student("Mike"));
        this.students.add(new Student("Molly"));
        this.students.add(new Student("Ricardo"));
        this.students.add(new Student("Garry"));
        this.students.add(new Student("Vicky"));
        this.students.add(new Student("Emil"));
        this.students.add(new Student("Pat"));
        this.students.add(new Student("Stuart"));
        this.students.add(new Student("Digory"));
        this.students.add(new Student("Gemma"));
        this.students.add(new Student("Euan"));
        this.students.add(new Student("Mark"));
        this.students.add(new Student("Kirstin"));
        this.students.add(new Student("Beata"));
        this.students.add(new Student("Robbie"));
        this.students.add(new Student("Marcin"));
        this.students.add(new Student("Tahne"));
        this.students.add(new Student("Melinda"));
    }

    public Student getRandomStudent(){
        List<Student> randomStudents = this.students;
        Collections.shuffle(randomStudents);
        return randomStudents.get(0);
    }

    public List<Student> getRandomPair(){
        List<Student> randomPair = new ArrayList<Student>();
        Student studentOne = getRandomStudent();
        randomPair.add(studentOne);
        Student studentTwo = getRandomStudent();
        if (studentTwo != studentOne) {
            randomPair.add(studentTwo);
            return randomPair;
        } else {
            return getRandomPair();
        }
    }
}
