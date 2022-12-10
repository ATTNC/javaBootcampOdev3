public class StudentManager extends UserManager {

    public void addCourse(Course course) {

        System.out.println("Kursa başarılı bir şekilde kayıt olundu: " + course.getName());


    }

    public void addComment(Student student) {

        System.out.println(student.getFirstName()+" "+student.getLastName()+": Hocam çok sade ve anlaşılır bir ders oldu çok teşekkür ederiz.");

    }

}
