package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Disciplina;
import ec.com.guambragol.modelo.Jugador;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-17T19:55:42")
@StaticMetamodel(Carnet.class)
public class Carnet_ { 

    public static volatile SingularAttribute<Carnet, Date> fechaExp;
    public static volatile SingularAttribute<Carnet, Jugador> idJugador;
    public static volatile SingularAttribute<Carnet, String> foto;
    public static volatile SingularAttribute<Carnet, Disciplina> idDisciplina;
    public static volatile SingularAttribute<Carnet, Date> fechaCad;
    public static volatile SingularAttribute<Carnet, Integer> idCarnet;

}