import java.util.Arrays;
import java.util.Comparator;

class Main {

    public static void main(String[] args) {

        Product[] products = {new Product(1,"Laptop","Electronics"),new Product(2,"Mouse","Electronics"),new Product(3,"Keyboard","Electronics")};

        int index = SearchOperations.linearSearch(products,"Mouse");

        System.out.println("Linear Search Index: "+ index);

        Arrays.sort(products,Comparator.comparing(p -> p.productName));

        index =SearchOperations.binarySearch(products,"Mouse");

        System.out.println("Binary Search Index: "+ index);
    }
}