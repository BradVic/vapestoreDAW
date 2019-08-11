package entity;

import entity.Sale;
import entity.User;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, User> idUser;
    public static volatile SingularAttribute<Payment, BigInteger> code;
    public static volatile SingularAttribute<Payment, Date> created;
    public static volatile SingularAttribute<Payment, Date> expiredDate;
    public static volatile ListAttribute<Payment, Sale> saleList;
    public static volatile SingularAttribute<Payment, Boolean> active;
    public static volatile SingularAttribute<Payment, Integer> id;
    public static volatile SingularAttribute<Payment, Date> updated;

}