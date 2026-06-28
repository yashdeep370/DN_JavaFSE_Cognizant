import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(
                        101,
                        "Java Programming",
                        "James Gosling"),

                new Book(
                        102,
                        "Python Basics",
                        "Guido Van Rossum"),

                new Book(
                        103,
                        "Data Structures",
                        "Mark Allen"),

                new Book(
                        104,
                        "Operating Systems",
                        "Abraham Silberschatz")
        };

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Enter Book Title: ");

        String title =
                sc.nextLine();

        Book linearResult =
                LinearSearch.search(
                        books,
                        title);

        if (linearResult != null) {

            System.out.println(
                    "\nLinear Search Result:");

            System.out.println(
                    linearResult);
        } else {
            System.out.println(
                    "\nBook Not Found.");
        }

        Arrays.sort(
                books,
                Comparator.comparing(
                        b -> b.title));

        Book binaryResult =
                BinarySearch.search(
                        books,
                        title);

        if (binaryResult != null) {

            System.out.println(
                    "\nBinary Search Result:");

            System.out.println(
                    binaryResult);
        } else {
            System.out.println(
                    "\nBook Not Found.");
        }

        sc.close();
    }
}