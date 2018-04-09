/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirlimpimposo;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Diogo
 */
public class SelectPerfilTag extends SimpleTagSupport{

    private String disciplinaSelecionada;
    
    @Override
    public void doTag() throws JspException, IOException {
        String selectHtml = 
        "<div class='input-group mb-3'>"+
          "<div class='input-group-prepend'>"+
            "<label class='input-group-text' for='inputGroupSelect01'>Disciplinas</label>"+
            "<select class='custom-select' name='disciplina' id='inputGroupSelect01'>"+
            " <option value='PSW' " +("PSW".equals(disciplinaSelecionada) ? "selected" : "")+ " >PSW</option>"+
            " <option value='ENG SOFT' " + ("ENG SOFT".equals(disciplinaSelecionada) ? "selected": "") +  " >ENG SOFT</option>" +
            " <option value='APS' " + ("APS".equals(disciplinaSelecionada)  ? "selected": "") + " >APS</option>" +
            "</select>"+
        "</div> ";
        getJspContext().getOut().print(selectHtml);
    }

    public String getDisciplinaSelecionada() {
        return disciplinaSelecionada;
    }

    public void setDisciplinaSelecionada(String disciplinaSelecionada) {
        this.disciplinaSelecionada = disciplinaSelecionada;
    }
    
    
    
}
