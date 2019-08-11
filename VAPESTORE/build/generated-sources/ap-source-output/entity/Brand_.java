package entity;

import entity.Discount;
import entity.File;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-09T23:52:22")
@StaticMetamodel(Brand.class)
public class Brand_ { 

    public static volatile SingularAttribute<Brand, User> updatedBy;
    public static volatile SingularAttribute<Brand, User> createdBy;
    public static volatile SingularAttribute<Brand, Date> created;
    public static volatile SingularAttribute<Brand, String> name;
    public static volatile SingularAttribute<Brand, Boolean> active;
    public static volatile SingularAttribute<Brand, Integer> id;
    public static volatile SingularAttribute<Brand, Discount> discountId;
    public static volatile SingularAttribute<Brand, Date> updated;
    public static volatile SingularAttribute<Brand, File> fileId;

}