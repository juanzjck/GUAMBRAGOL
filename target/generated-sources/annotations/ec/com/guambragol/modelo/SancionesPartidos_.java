package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Jugador;
import ec.com.guambragol.modelo.Partidos;
import ec.com.guambragol.modelo.Sanciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-17T16:11:21")
@StaticMetamodel(SancionesPartidos.class)
public class SancionesPartidos_ { 

    public static volatile SingularAttribute<SancionesPartidos, Integer> idSancionesPartidos;
    public static volatile SingularAttribute<SancionesPartidos, Sanciones> idSanciones;
    public static volatile SingularAttribute<SancionesPartidos, Jugador> idJugador;
    public static volatile SingularAttribute<SancionesPartidos, Partidos> idPartido;

}