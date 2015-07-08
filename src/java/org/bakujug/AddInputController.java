package org.bakujug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import org.bakujug.bean.Person;

/**
 *
 * @author Ilkin Abdullayev
 */
@ManagedBean(name = "aic")
@SessionScoped
public class AddInputController implements Serializable {

    private List<Person> listPersonInputs = new ArrayList<Person>();

    private Person inputPerson=new Person();

    public void addPerson(AjaxBehaviorEvent event) {
        System.out.println(inputPerson);
        listPersonInputs.add(inputPerson);
        inputPerson = new Person();
    }

    public List<Person> getListPersonInputs() {
        return listPersonInputs;
    }

    public void setListPersonInputs(List<Person> listPersonInputs) {
        this.listPersonInputs = listPersonInputs;
    }

    public Person getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(Person inputPerson) {
        this.inputPerson = inputPerson;
    }

}
