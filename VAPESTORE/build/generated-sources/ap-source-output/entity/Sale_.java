package entity;

import entity.Invoice;
import entity.Payment;
import entity.SaleProduct;
import entity.User;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Sale.class)
public class Sale_ { 

    public static volatile SingularAttribute<Sale, String> notes;
    public static volatile SingularAttribute<Sale, User> updatedBy;
    public static volatile SingularAttribute<Sale, Boolean> invoiced;
    public static volatile SingularAttribute<Sale, Date> created;
    public static volatile SingularAttribute<Sale, BigDecimal> discountAmount;
    public static volatile SingularAttribute<Sale, Boolean> active;
    public static volatile SingularAttribute<Sale, User> userId;
    public static volatile SingularAttribute<Sale, BigDecimal> discountPercentage;
    public static volatile ListAttribute<Sale, Invoice> invoiceList;
    public static volatile SingularAttribute<Sale, BigDecimal> total;
    public static volatile ListAttribute<Sale, SaleProduct> saleProductList;
    public static volatile SingularAttribute<Sale, Payment> paymentId;
    public static volatile SingularAttribute<Sale, String> folio;
    public static volatile SingularAttribute<Sale, User> customerId;
    public static volatile SingularAttribute<Sale, BigDecimal> totalDiscount;
    public static volatile SingularAttribute<Sale, Integer> id;
    public static volatile SingularAttribute<Sale, String> state;
    public static volatile SingularAttribute<Sale, Date> updated;
    public static volatile SingularAttribute<Sale, String> status;

}