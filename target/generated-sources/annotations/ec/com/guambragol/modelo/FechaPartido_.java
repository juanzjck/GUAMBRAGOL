package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.DetalleFechaCampeonao;
import ec.com.guambragol.modelo.Partidos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-22T12:41:54")
@StaticMetamodel(FechaPartido.class)
public class FechaPartido_ { 

    public static volatile SingularAttribute<FechaPartido, Integer> idFechaPartido;
    public static volatile ListAttribute<FechaPartido, Partidos> partidosList;
    public static volatile SingularAttribute<FechaPartido, Date> fechaInicio;
    public static volatile SingularAttribute<FechaPartido, Date> fechaFin;
    public static volatile ListAttribute<FechaPartido, DetalleFechaCampeonao> detalleFechaCampeonaoList;

}