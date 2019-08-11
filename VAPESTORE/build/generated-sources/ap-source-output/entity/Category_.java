package entity;

import entity.Product;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, User> updatedBy;
    public static volatile SingularAttribute<Category, User> createdBy;
    public static volatile SingularAttribute<Category, Date> created;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, Boolean> active;
    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SingularAttribute<Category, Date> updated;
    public static volatile ListAttribute<Category, Product> productList;

}