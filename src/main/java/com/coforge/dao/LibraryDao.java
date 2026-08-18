package com.coforge.dao;

import com.coforge.model.Library;

public interface LibraryDao {

    boolean addLibrary(Library library);

    boolean removeLibrary(int id);

    boolean updateLibrary(Library library);

    Library searchLibrary(int id);
}