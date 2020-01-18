package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Partidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-17T16:11:21")
@StaticMetamodel(Cancha.class)
public class Cancha_ { 

    public static volatile ListAttribute<Cancha, Partidos> partidosList;
    public static volatile SingularAttribute<Cancha, String> direccion;
    public static volatile SingularAttribute<Cancha, String> nombre;
    public static volatile SingularAttribute<Cancha, Integer> idCancha;

}