package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.SancionesPartidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-16T23:16:41")
@StaticMetamodel(Sanciones.class)
public class Sanciones_ { 

    public static volatile SingularAttribute<Sanciones, Integer> idSanciones;
    public static volatile ListAttribute<Sanciones, SancionesPartidos> sancionesPartidosList;
    public static volatile SingularAttribute<Sanciones, String> nombreSancion;

}