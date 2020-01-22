package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Club;
import ec.com.guambragol.modelo.Partidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-22T12:41:54")
@StaticMetamodel(TablaPosiciones.class)
public class TablaPosiciones_ { 

    public static volatile SingularAttribute<TablaPosiciones, Integer> golesContra;
    public static volatile SingularAttribute<TablaPosiciones, Club> idEquipo;
    public static volatile SingularAttribute<TablaPosiciones, Integer> partidoGanar;
    public static volatile SingularAttribute<TablaPosiciones, Integer> partidosPerdidos;
    public static volatile SingularAttribute<TablaPosiciones, Integer> idTablaPosiciones;
    public static volatile SingularAttribute<TablaPosiciones, Integer> partidosEmpatados;
    public static volatile SingularAttribute<TablaPosiciones, Partidos> idPartido;
    public static volatile SingularAttribute<TablaPosiciones, Integer> golesAfavor;

}