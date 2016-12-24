package ua.rainbow.development.sybextestbank;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

@Root(name = "flashCards", strict = false)
public class FlipCards extends RealmObject {
    @PrimaryKey
    private long id;

    @ElementList(name = "termNodes")
    private RealmList<FlipCard> flipCards;

    public RealmList<FlipCard> getFlipCards() {
        return flipCards;
    }

    public void setFlipCards(RealmList<FlipCard> flipCards) {
        this.flipCards = flipCards;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
