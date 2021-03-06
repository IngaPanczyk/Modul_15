package patterns.library;

import patterns.prototype.Board;
import patterns.prototype.Task;
import patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    //shallowCopy
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    //deepCopy
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();

        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            super.clone();
            clonedLibrary.getBooks().add(book);
        }

        return clonedLibrary;
    }

}
