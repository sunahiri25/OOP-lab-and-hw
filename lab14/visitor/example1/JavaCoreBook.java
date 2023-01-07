package visitor.example1;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Java-Tutorial";
    }

    public String getFavoriteBook() {
        return "The favorite book of java core";
    }
}
