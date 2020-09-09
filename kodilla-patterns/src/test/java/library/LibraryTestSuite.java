package library;


import org.junit.Assert;
import org.junit.Test;
import patterns.library.Book;
import patterns.library.Library;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //creating library
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author" + n, LocalDate.of(2020, 1, 1))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        clonedLibrary.getBooks().add(new Book("Title 11", "Author 11", LocalDate.now()));
        //Then
        System.out.println(library.getName() + library.getBooks().toString());
        System.out.println(clonedLibrary.getName() + clonedLibrary.getBooks().toString());
        System.out.println(deepClonedLibrary.getName() + deepClonedLibrary.getBooks().toString());
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
