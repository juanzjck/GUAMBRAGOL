package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Jugador;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-16T23:16:41")
@StaticMetamodel(Posicion.class)
public class Posicion_ { 

    public static volatile SingularAttribute<Posicion, String> posicion;
    public static volatile ListAttribute<Posicion, Jugador> jugadorList;
    public static volatile SingularAttribute<Posicion, Integer> idPosicion;

}