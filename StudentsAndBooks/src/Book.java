import java.util.Objects;

class Book {
    private String title;
    private int pageCount;
    private int publicationYear;

    public Book(String title, int pageCount, int publicationYear) {
        this.title = title;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPublicationYear() {
            return publicationYear;
    }

    @Override
    public String toString() {
        return "[" + title +
                ", Page " + pageCount +
                ", Year " + publicationYear + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && publicationYear == book.publicationYear && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount, publicationYear);
    }
}
