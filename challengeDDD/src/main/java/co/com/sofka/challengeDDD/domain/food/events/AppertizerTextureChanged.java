package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.AppetizerID;
import co.com.sofka.challengeDDD.domain.food.values.Texture;
import co.com.sofka.domain.generic.DomainEvent;

public class AppertizerTextureChanged extends DomainEvent {
    private final AppetizerID appetizerID;
    private final Texture texture;

    public AppertizerTextureChanged(AppetizerID appetizerID, Texture texture) {
        super("com.food.AppertizerTextureChanged");
        this.appetizerID = appetizerID;
        this.texture = texture;
    }

    public AppetizerID getAppetizerID() {
        return appetizerID;
    }

    public Texture getTexture() {
        return texture;
    }
}
