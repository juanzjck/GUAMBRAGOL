package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.ClubDisciplina;
import ec.com.guambragol.modelo.Directiva;
import ec.com.guambragol.modelo.Jugador;
import ec.com.guambragol.modelo.Partidos;
import ec.com.guambragol.modelo.TablaPosiciones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-16T23:16:41")
@StaticMetamodel(Club.class)
public class Club_ { 

    public static volatile ListAttribute<Club, ClubDisciplina> clubDisciplinaList;
    public static volatile ListAttribute<Club, Jugador> jugadorList;
    public static volatile SingularAttribute<Club, Date> fechaFundacion;
    public static volatile ListAttribute<Club, TablaPosiciones> tablaPosicionesList;
    public static volatile ListAttribute<Club, Partidos> partidosList;
    public static volatile ListAttribute<Club, Partidos> partidosList1;
    public static volatile ListAttribute<Club, Directiva> directivaList;
    public static volatile SingularAttribute<Club, String> colores;
    public static volatile SingularAttribute<Club, Short> acuerdoMinist;
    public static volatile SingularAttribute<Club, String> nombreClub;
    public static volatile SingularAttribute<Club, Integer> idClub;

}