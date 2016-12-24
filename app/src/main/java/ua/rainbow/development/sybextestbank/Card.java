package ua.rainbow.development.sybextestbank;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;

import io.realm.RealmObject;

public class Card extends RealmObject {
    @Element
    String title;

    @Element
    @Path("titleContent")
    String text;
}
