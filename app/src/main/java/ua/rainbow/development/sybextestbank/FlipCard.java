package ua.rainbow.development.sybextestbank;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Transient;

import io.realm.RealmObject;

@Root
public class FlipCard extends RealmObject {
    @Attribute
    private long id;
    @Transient
    private FlipCards parent;
    @Element
    private Card term;
    @Element
    private Card definition;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Card getTerm() {
        return term;
    }

    public void setTerm(Card term) {
        this.term = term;
    }

    public Card getDefinition() {
        return definition;
    }

    public void setDefinition(Card definition) {
        this.definition = definition;
    }
}
