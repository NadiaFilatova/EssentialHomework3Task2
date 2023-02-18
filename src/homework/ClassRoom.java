package homework;


public class ClassRoom {
    public Pupil student;
    public Pupil student2;
    public Pupil student3;
    public Pupil student4;

    public ClassRoom(Pupil student, Pupil student2) {
        this.student = student;
        this.student2 = student2;
    }

    public ClassRoom(Pupil student, Pupil student2, Pupil student3) {
        this(student, student2);
        this.student3 = student3;
    }

    public ClassRoom(Pupil student, Pupil student2, Pupil student3, Pupil student4) {
        this(student, student2, student3);
        this.student4 = student4;
    }

    public void print() {
        if (student != null) {
            System.out.println("Student 1");
            student.read();
            student.write();
            student.study();
            student.relax();
            System.out.println();
        } else {
            System.out.println("Student 1 is null");
        }

        if (student2 != null) {
            System.out.println("Student 2");
            student2.read();
            student2.write();
            student2.study();
            student2.relax();
            System.out.println();
        } else {
            System.out.println("Student 2 is null");
        }

        if (student3 != null) {
            System.out.println("Student 3");
            student3.read();
            student3.write();
            student3.study();
            student3.relax();
            System.out.println();
        } else {
            System.out.println("Student 3 is null");
        }

        if (student4 != null) {
            System.out.println("Student 4");
            student4.read();
            student4.write();
            student4.study();
            student4.relax();
            System.out.println();
        } else {
            System.out.println("Student 4 is null");
        }
    }
}
