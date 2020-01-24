/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.convertor;

import ec.com.guambragol.modelo.Liga;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;

/**
 *
 * @author LENOVO
 */
@FacesConverter(value="ec.com.guambragol.convertor.LigaConvertor")
public class LigaConvertor implements Converter {

    @Override
    public List<Liga> getAsObject(FacesContext fc, UIComponent uic, String string) {
        String[] liga=string.split("-");
        List<Liga> ligas=new ArrayList<Liga>();
        for(Liga l:ligas){
            ligas.add(l);
        }
        return ligas;
       }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        
        return t.toString();
    }

    
}
