package entity;

import entity.Category;
import entity.Discount;
import entity.File;
import entity.SaleProduct;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, User> updatedBy;
    public static volatile SingularAttribute<Product, Date> created;
    public static volatile SingularAttribute<Product, Long> regularPrice;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Boolean> active;
    public static volatile ListAttribute<Product, SaleProduct> saleProductList;
    public static volatile SingularAttribute<Product, User> createdBy;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, String> sku;
    public static volatile SingularAttribute<Product, Discount> discountId;
    public static volatile SingularAttribute<Product, Date> updated;
    public static volatile SingularAttribute<Product, Category> categoryId;
    public static volatile SingularAttribute<Product, File> fileId;

}