package com.qfedu.service.Impl;

import com.qfedu.dao.Impl.ClassDaoImpl;
import com.qfedu.service.ClassService;

public class ClassServiceImpl implements ClassService {
    @Override
    public int addClass(String clno, String clname, String dno) {
        ClassDaoImpl classDao = new ClassDaoImpl();
        return classDao.addClass(clno, clname, dno);
    }
}
