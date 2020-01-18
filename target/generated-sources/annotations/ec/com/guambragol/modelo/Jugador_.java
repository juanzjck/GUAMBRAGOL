package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Carnet;
import ec.com.guambragol.modelo.Club;
import ec.com.guambragol.modelo.GolesPartido;
import ec.com.guambragol.modelo.JugadorPartidfo;
import ec.com.guambragol.modelo.Persona;
import ec.com.guambragol.modelo.Posicion;
import ec.com.guambragol.modelo.SancionesPartidos;
import ec.com.guambragol.modelo.TipoJugador;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-17T16:11:21")
@StaticMetamodel(Jugador.class)
public class Jugador_ { 

    public static volatile SingularAttribute<Jugador, Posicion> idposicion;
    public static volatile SingularAttribute<Jugador, Integer> dorsal;
    public static volatile SingularAttribute<Jugador, Integer> idJugador;
    public static volatile SingularAttribute<Jugador, Persona> idPerosna;
    public static volatile ListAttribute<Jugador, SancionesPartidos> sancionesPartidosList;
    public static volatile ListAttribute<Jugador, JugadorPartidfo> jugadorPartidfoList;
    public static volatile ListAttribute<Jugador, GolesPartido> golesPartidoList;
    public static volatile ListAttribute<Jugador, Carnet> carnetList;
    public static volatile SingularAttribute<Jugador, TipoJugador> idTipoJugador;
    public static volatile SingularAttribute<Jugador, Club> idClub;

}