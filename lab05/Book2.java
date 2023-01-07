public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
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

    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder();
        desc.append("Book[name = ").append(name).append(", authors = {");
        for (Author author : authors) {
            desc.append(author.toString()).append(", ");
        }
        desc.delete(desc.length() - 2, desc.length());
        desc.append("}, price = ").append(price).append(", qty = ").append(qty).append("]");
        return desc.toString();
    }
}
