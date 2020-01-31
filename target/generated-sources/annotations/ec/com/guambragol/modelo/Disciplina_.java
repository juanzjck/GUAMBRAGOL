package ec.com.guambragol.modelo;

import ec.com.guambragol.modelo.Carnet;
import ec.com.guambragol.modelo.ClubDisciplina;
import ec.com.guambragol.modelo.Genero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-31T16:17:39")
@StaticMetamodel(Disciplina.class)
public class Disciplina_ { 

    public static volatile ListAttribute<Disciplina, ClubDisciplina> clubDisciplinaList;
    public static volatile SingularAttribute<Disciplina, Integer> idDisciplina;
    public static volatile SingularAttribute<Disciplina, String> nombre;
    public static volatile SingularAttribute<Disciplina, Genero> idgenero;
    public static volatile ListAttribute<Disciplina, Carnet> carnetList;

}