class BinarySearch {

    public static Book search(Book[] books,
                              String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = low +
                    (high - low) / 2;

            int result =
                    books[mid].title
                            .compareToIgnoreCase(
                                    title);

            if (result == 0) {
                return books[mid];
            }

            if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}