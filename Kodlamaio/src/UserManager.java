public class UserManager {


    public void loggingInstructor(Instructor instructor, Course course) {

        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Öğretmeni " + course.getName() + "unu açmıştır." + " (UserManager log)");


    }

    public void loggingStudent(Student student, Course course) {

        System.out.println(student.getFirstName() + " " + student.getLastName() + " Öğrencisi " + course.getName() + "una kayıt olmuştur." + " (UserManager log)");


    }
    public void commentLog(Student student,Course course){

        System.out.println(student.getFirstName()+" "+student.getLastName()+" adlı öğrenci "+course.getName()+"una yorum yapmıştır."+" (UserManager log)");
    }
}




