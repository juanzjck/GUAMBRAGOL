package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Arbitro;
import ec.com.guambragol.modelo.Directiva;
import ec.com.guambragol.modelo.Jugador;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-17T19:55:42")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile ListAttribute<Persona, Jugador> jugadorList;
    public static volatile SingularAttribute<Persona, String> cedula;
    public static volatile SingularAttribute<Persona, String> apellidoMat;
    public static volatile ListAttribute<Persona, Directiva> directivaList;
    public static volatile SingularAttribute<Persona, String> apellidoPat;
    public static volatile SingularAttribute<Persona, String> primerNom;
    public static volatile SingularAttribute<Persona, Date> fechaNac;
    public static volatile ListAttribute<Persona, Arbitro> arbitroList;
    public static volatile SingularAttribute<Persona, String> domicilio;
    public static volatile SingularAttribute<Persona, String> segundoNum;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile SingularAttribute<Persona, String> profesion;
    public static volatile SingularAttribute<Persona, Integer> idPersona;

}