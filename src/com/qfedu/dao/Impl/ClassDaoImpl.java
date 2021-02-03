package com.qfedu.dao.Impl;

import com.qfedu.dao.ClassDao;
import com.qfedu.util.BaseDao;

import java.sql.SQLException;

public class ClassDaoImpl extends BaseDao implements ClassDao {
    @Override
    public int addClass(String clno, String clname, String dno) {
        String sql = "insert into class(Clno, Clname, Dno) values(?, ?, ?)";
        Object[] obj = {clno, clname, dno};
        int i = 0;
        try {
            i = super.update(sql, obj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
