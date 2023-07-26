package com.company.main;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
        UserDaoInter userDao = Context.instanceUserDao();
        
        User u =userDao.findByEmail("sarkhanrasullu@gmail.com");

    }
}