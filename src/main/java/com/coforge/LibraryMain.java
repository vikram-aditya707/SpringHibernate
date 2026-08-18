package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.dao.LibraryDao;
import com.coforge.model.Library;

public class LibraryMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryDao libraryDao = context.getBean(LibraryDao.class);

        Library library = new Library();

        library.setId(101);
        library.setBookName("Spring in Action");
        library.setAuthor("Craig Walls");

        boolean status = libraryDao.addLibrary(library);

        if (status) {
            System.out.println("Library added successfully.");
        } else {
            System.out.println("Library not added.");
        }

        ((AnnotationConfigApplicationContext) context).close();
    }
}