public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Олег Нечипоренко","kizyaka@gmail.com",'М');
        System.out.println(author);
        author.setEmail("olegkizyka@gmail.com");
        System.out.println(author);
    }
}
