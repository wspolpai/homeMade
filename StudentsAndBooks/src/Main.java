import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        Book book1 = new Book("Book AA", 250, 1995);
        Book book2 = new Book("Book BA", 300, 2005);
        Book book3 = new Book("Book BC", 180, 2010);
        Book book4 = new Book("Book BD", 400, 1980);
        Book book5 = new Book("Book EG", 220, 2015);
        Book book6 = new Book("Book EF", 350, 2000);
        Book book7 = new Book("Book BG", 280, 2008);
        Book book8 = new Book("Book HS", 150, 1990);
        Book book9 = new Book("Book IA", 420, 2020);
        Book book10 = new Book("Book BJ", 200, 1998);
        Book book11 = new Book("Book AK", 330, 2003);
        Book book12 = new Book("Book DL", 170, 2012);
        Book book13 = new Book("Book BM", 380, 1985);
        Book book14 = new Book("Book EN", 230, 2017);
        Book book15 = new Book("Book OD", 360, 1999);


        Student student1 = new Student("Alice", Arrays.asList(book1, book2, book3, book4, book5));
        Student student2 = new Student("Bob", Arrays.asList(book6, book7, book8, book9, book10));
        Student student3 = new Student("Charlie", Arrays.asList(book11, book12, book13, book14, book15));

        students.add(student1);
        students.add(student2);
        students.add(student3);



        Optional<Integer> year = students.stream()
                .peek(System.out::println) // Вывести в консоль каждого студента (переопределен toString)
                .map(Student::getBooks) // Получить для каждого студента список книг
                .flatMap(Collection::stream) // Получить книги
                .sorted(Comparator.comparingInt(Book::getPageCount)) // Отсортировать книги по количеству страниц
                .distinct() // Оставить только уникальные книги
                .filter(book -> book.getPublicationYear() > 2000) // Отфильтровать книги, оставив только те, которые были выпущены после 2000 года
                .limit(3) // Ограничить стрим на 3 элементах
                .map(Book::getPublicationYear) // Получить из книг годы выпуска
                .filter(y -> { // Пример короткого замыкания: как только найдем первое число > 2000, сразу прекращаем
                    System.out.println("Проверяем год " + y); //Покажет, какие годы были проверены
                    return y > 2000;
                })
                .findFirst(); //При помощи методов короткого замыкания вернуть Optional от года


        System.out.println(year.map(y -> "Год выпуска найденной книги: " + y).orElse("Такая книга отсутствует"));
    }
}