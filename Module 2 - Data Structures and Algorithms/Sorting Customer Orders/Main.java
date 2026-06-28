class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101,
                        "Yash",
                        5000),

                new Order(102,
                        "Rahul",
                        2000),

                new Order(103,
                        "Amit",
                        10000),

                new Order(104,
                        "Priya",
                        7000)
        };

        System.out.println(
                "Original Orders:");

        for (Order o : orders) {
            System.out.println(o);
        }

        BubbleSort.sort(orders);

        System.out.println(
                "\nAfter Bubble Sort:");

        for (Order o : orders) {
            System.out.println(o);
        }

        Order[] orders2 = {
                new Order(101,
                        "Yash",
                        5000),

                new Order(102,
                        "Rahul",
                        2000),

                new Order(103,
                        "Amit",
                        10000),

                new Order(104,
                        "Priya",
                        7000)
        };

        QuickSort.sort(
                orders2,
                0,
                orders2.length - 1);

        System.out.println(
                "\nAfter Quick Sort:");

        for (Order o : orders2) {
            System.out.println(o);
        }
    }
}