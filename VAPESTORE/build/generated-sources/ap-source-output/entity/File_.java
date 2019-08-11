package entity;

import entity.Brand;
import entity.Product;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(File.class)
public class File_ { 

    public static volatile SingularAttribute<File, String> path;
    public static volatile SingularAttribute<File, String> extension;
    public static volatile ListAttribute<File, User> userList;
    public static volatile SingularAttribute<File, Date> created;
    public static volatile SingularAttribute<File, String> name;
    public static volatile ListAttribute<File, Brand> brandList;
    public static volatile SingularAttribute<File, Integer> id;
    public static volatile ListAttribute<File, Product> productList;

}