package com.kodilla.kodillapatterns2.adapter.bookclassifier;


import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book>books = new HashSet<>();
        books.add(new Book ("Author", "Title",1991,"Signature1"));
        books.add(new Book ("Author", "Title",1992,"Signature2"));
        books.add(new Book ("Author", "Title",1993,"Signature3"));
        books.add(new Book ("Author", "Title",1994,"Signature4"));
        books.add(new Book ("Author", "Title",1995,"Signature5"));
        books.add(new Book ("Author", "Title",1996,"Signature6"));
        books.add(new Book ("Author", "Title",1997,"Signature7"));
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1994,median,0);
    }
}
