package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Arbitro;
import ec.com.guambragol.modelo.Cancha;
import ec.com.guambragol.modelo.Club;
import ec.com.guambragol.modelo.FechaPartido;
import ec.com.guambragol.modelo.GolesPartido;
import ec.com.guambragol.modelo.SancionesPartidos;
import ec.com.guambragol.modelo.TablaPosiciones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-22T12:41:54")
@StaticMetamodel(Partidos.class)
public class Partidos_ { 

    public static volatile ListAttribute<Partidos, SancionesPartidos> sancionesPartidosList;
    public static volatile SingularAttribute<Partidos, Arbitro> idArbitro;
    public static volatile SingularAttribute<Partidos, Integer> hora;
    public static volatile SingularAttribute<Partidos, Club> idClubLocal;
    public static volatile SingularAttribute<Partidos, String> categoria;
    public static volatile SingularAttribute<Partidos, Cancha> idCancha;
    public static volatile ListAttribute<Partidos, GolesPartido> golesPartidoList;
    public static volatile SingularAttribute<Partidos, Integer> golesVisitante;
    public static volatile SingularAttribute<Partidos, FechaPartido> idFechaPartido;
    public static volatile SingularAttribute<Partidos, Date> fecha;
    public static volatile ListAttribute<Partidos, TablaPosiciones> tablaPosicionesList;
    public static volatile SingularAttribute<Partidos, Integer> golesLocal;
    public static volatile SingularAttribute<Partidos, Club> idClubVisitante;
    public static volatile SingularAttribute<Partidos, Integer> idPartidos;

}