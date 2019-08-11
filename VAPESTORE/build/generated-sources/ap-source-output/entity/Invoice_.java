package entity;

import entity.Sale;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Sale> saleId;
    public static volatile SingularAttribute<Invoice, Date> created;
    public static volatile SingularAttribute<Invoice, User> customerId;
    public static volatile SingularAttribute<Invoice, Boolean> active;
    public static volatile SingularAttribute<Invoice, Integer> id;

}