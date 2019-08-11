package entity;

import entity.Brand;
import entity.Product;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile SingularAttribute<Discount, BigDecimal> percentage;
    public static volatile SingularAttribute<Discount, Boolean> active;
    public static volatile ListAttribute<Discount, Brand> brandList;
    public static volatile SingularAttribute<Discount, Integer> id;
    public static volatile ListAttribute<Discount, Product> productList;

}