package com.coforge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.coforge.model.Library;

@Repository
public class LibraryDaoImp1 implements LibraryDao {

    private SessionFactory factory;

    public LibraryDaoImp1(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public boolean addLibrary(Library library) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(library);

        transaction.commit();

        session.close();

        return true;
    }

    @Override
    public boolean removeLibrary(int id) {
        return false;
    }

    @Override
    public boolean updateLibrary(Library library) {
        return false;
    }

    @Override
    public Library searchLibrary(int id) {
        return null;
    }
}