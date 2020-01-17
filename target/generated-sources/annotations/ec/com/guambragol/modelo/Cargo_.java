package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Directiva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-16T23:16:41")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, Integer> idCargo;
    public static volatile ListAttribute<Cargo, Directiva> directivaList;
    public static volatile SingularAttribute<Cargo, String> nombre;

}