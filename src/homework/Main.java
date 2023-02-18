package homework;

public class Main {
    public static void main(String[] args) {
        BadPupil student = new BadPupil();
        Pupil student2 = new ExcellentPupil();
        Pupil student3 = new GoodPupil();
        Pupil student4 = new GoodPupil();

        ClassRoom classRoom = new ClassRoom(student, student2, student3, student4);
        ClassRoom classRoom1 = new ClassRoom(student, student2, student3);
        ClassRoom classRoom2 = new ClassRoom(student, student2);
        classRoom.print();
//        classRoom1.print();
//        classRoom2.print();

    }


}
