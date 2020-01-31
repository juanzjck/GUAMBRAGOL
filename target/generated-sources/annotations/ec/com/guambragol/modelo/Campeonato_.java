package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.DetalleFechaCampeonao;
import ec.com.guambragol.modelo.Liga;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-31T16:17:39")
@StaticMetamodel(Campeonato.class)
public class Campeonato_ { 

    public static volatile SingularAttribute<Campeonato, Liga> idLiga;
    public static volatile SingularAttribute<Campeonato, Date> fechaInicio;
    public static volatile SingularAttribute<Campeonato, Integer> idCampeonato;
    public static volatile SingularAttribute<Campeonato, String> nombre;
    public static volatile SingularAttribute<Campeonato, Date> fechaFin;
    public static volatile ListAttribute<Campeonato, DetalleFechaCampeonao> detalleFechaCampeonaoList;

}