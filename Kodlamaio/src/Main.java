public class Main {


    public static void main(String[] args) {

        Instructor engin = new Instructor();
        engin.setId(1);
        engin.setFirstName("Engin");
        engin.setLastName("Demiroğ");
        engin.setCourse("Course1,Course2,Course3,Course4,Course5");
        engin.setEmail("engin_demirog@hotmail.com");

        Student abdullah = new Student();
        abdullah.setId(1);
        abdullah.setFirstName("Abdullah");
        abdullah.setLastName("Tütüncü");
        abdullah.setEmail("abdullah_ttnc@hotmail.com");
        abdullah.setAge("23");

        Course course1 = new Course(1, 30, "Programlamaya Giriş için Temel Kurs", "Programlama dilleri için temel programlama mantığı");
        Course course2 = new Course(2, 30, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", " Sıfırdan Javascript Kampı ");

        Course[] courses = {course1, course2};


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.openCourse(course1);
        UserManager userManager = new UserManager();
        userManager.loggingInstructor(engin, course1);


        StudentManager studentManager = new StudentManager();
        studentManager.addCourse(course1);
        userManager.loggingStudent(abdullah,course1);
        instructorManager.loggingStudent(abdullah, course1);

        studentManager.addComment(abdullah);

        userManager.commentLog(abdullah,course1);
        instructorManager.commentLog(abdullah,course1);





    }
}