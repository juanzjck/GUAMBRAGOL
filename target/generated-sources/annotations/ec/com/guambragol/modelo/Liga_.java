package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Campeonato;
import ec.com.guambragol.modelo.Directiva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-22T12:41:54")
@StaticMetamodel(Liga.class)
public class Liga_ { 

    public static volatile SingularAttribute<Liga, Integer> idLiga;
    public static volatile ListAttribute<Liga, Campeonato> campeonatoList;
    public static volatile SingularAttribute<Liga, String> nombre;
    public static volatile SingularAttribute<Liga, Directiva> idDirectiva;

}