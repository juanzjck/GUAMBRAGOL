package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Jugador;
import ec.com.guambragol.modelo.Partidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-17T20:32:23")
@StaticMetamodel(GolesPartido.class)
public class GolesPartido_ { 

    public static volatile SingularAttribute<GolesPartido, Jugador> idJugador;
    public static volatile SingularAttribute<GolesPartido, Integer> idGolesPartido;
    public static volatile SingularAttribute<GolesPartido, Partidos> idPartido;
    public static volatile SingularAttribute<GolesPartido, Integer> cantidadGoles;

}