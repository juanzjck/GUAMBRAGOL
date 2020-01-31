package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Cargo;
import ec.com.guambragol.modelo.Club;
import ec.com.guambragol.modelo.Liga;
import ec.com.guambragol.modelo.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-31T16:17:39")
@StaticMetamodel(Directiva.class)
public class Directiva_ { 

    public static volatile SingularAttribute<Directiva, Cargo> idCargo;
    public static volatile ListAttribute<Directiva, Liga> ligaList;
    public static volatile SingularAttribute<Directiva, Persona> idPersona;
    public static volatile SingularAttribute<Directiva, Integer> idDirectiva;
    public static volatile SingularAttribute<Directiva, Club> idClub;

}