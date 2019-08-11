package entity;

import entity.Product;
import entity.Sale;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(SaleProduct.class)
public class SaleProduct_ { 

    public static volatile SingularAttribute<SaleProduct, Long> quantity;
    public static volatile SingularAttribute<SaleProduct, Date> cloudUpdated;
    public static volatile SingularAttribute<SaleProduct, Product> productId;
    public static volatile SingularAttribute<SaleProduct, Sale> saleId;
    public static volatile SingularAttribute<SaleProduct, BigDecimal> salePrice;
    public static volatile SingularAttribute<SaleProduct, Date> created;
    public static volatile SingularAttribute<SaleProduct, BigDecimal> discountAmount;
    public static volatile SingularAttribute<SaleProduct, String> taxes;
    public static volatile SingularAttribute<SaleProduct, Boolean> active;
    public static volatile SingularAttribute<SaleProduct, BigDecimal> discountPercentage;
    public static volatile SingularAttribute<SaleProduct, BigDecimal> total;
    public static volatile SingularAttribute<SaleProduct, BigDecimal> price;
    public static volatile SingularAttribute<SaleProduct, BigDecimal> subtotal;
    public static volatile SingularAttribute<SaleProduct, Date> cloudCreated;
    public static volatile SingularAttribute<SaleProduct, Integer> id;
    public static volatile SingularAttribute<SaleProduct, Date> updated;

}