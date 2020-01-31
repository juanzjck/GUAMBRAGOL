package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Partidos;
import ec.com.guambragol.modelo.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-31T16:17:39")
@StaticMetamodel(Arbitro.class)
public class Arbitro_ { 

    public static volatile SingularAttribute<Arbitro, String> gremio;
    public static volatile ListAttribute<Arbitro, Partidos> partidosList;
    public static volatile SingularAttribute<Arbitro, Integer> idArbitro;
    public static volatile SingularAttribute<Arbitro, Persona> idPersona;

}