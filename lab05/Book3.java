public class Book3 {
    private String isbn;
    private String name;
    private Author2 author;
    private double price;
    private int qty = 0;

    public Book3(String isbn, String name, Author2 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book3(String isbn, String name, Author2 author, double price, int qty) {
        this(isbn, name, author, price);
        this.qty = qty;
    }

    public String getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author2 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[isbn = " + isbn + ", name = " + name + ", " + author.toString() + ", price = " + price + ", qty = " + qty + "]";
    }

}
