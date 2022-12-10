public class InstructorManager extends UserManager {


    public void openCourse(Course course) {

        System.out.println("Kurs başarıyla oluşturuldu: " + course.getName());


    }

    @Override
    public void loggingStudent(Student student, Course course) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " Öğrencisi " + course.getName() + "una kayıt olmuştur." + " (InstructorManager log)");

    }



    @Override
    public void commentLog(Student student,Course course){

        System.out.println(student.getFirstName()+" "+student.getLastName()+" adlı öğrenci "+course.getName()+"una yorum yapmıştır."+" (InstructorManager log)");
    }


}