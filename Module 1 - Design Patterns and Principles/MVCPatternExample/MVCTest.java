public class MVCTest {

    public static void main(String[] args) {

        Student model =
                new Student(
                        "Yash",
                        101,
                        "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        model,
                        view);

        controller.updateView();

        System.out.println();

        controller.setStudentName(
                "Yash Deep");

        controller.setStudentGrade(
                "A+");

        controller.updateView();
    }
}