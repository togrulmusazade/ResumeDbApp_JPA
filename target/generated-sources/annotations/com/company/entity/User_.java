package com.company.entity;

import com.company.entity.Country;
import com.company.entity.EmploymentHistory;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-01-10T09:03:03")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Country> birthPlace;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> address;
    public static volatile CollectionAttribute<User, EmploymentHistory> employmentHistoryCollection;
    public static volatile SingularAttribute<User, Country> nationality;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, String> profileDesc;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Date> birthDate;
    public static volatile SingularAttribute<User, String> email;

}