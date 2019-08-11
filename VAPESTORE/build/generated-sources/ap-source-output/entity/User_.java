package entity;

import entity.Brand;
import entity.Category;
import entity.File;
import entity.Invoice;
import entity.Payment;
import entity.Product;
import entity.Sale;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile ListAttribute<User, Sale> saleList1;
    public static volatile SingularAttribute<User, String> roles;
    public static volatile ListAttribute<User, Sale> saleList;
    public static volatile ListAttribute<User, Sale> saleList2;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile ListAttribute<User, Brand> brandList;
    public static volatile ListAttribute<User, Product> productList1;
    public static volatile ListAttribute<User, Payment> paymentList;
    public static volatile ListAttribute<User, Invoice> invoiceList;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Category> categoryList1;
    public static volatile ListAttribute<User, Brand> brandList1;
    public static volatile ListAttribute<User, Category> categoryList;
    public static volatile SingularAttribute<User, File> idFile;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile ListAttribute<User, Product> productList;
    public static volatile SingularAttribute<User, String> username;

}