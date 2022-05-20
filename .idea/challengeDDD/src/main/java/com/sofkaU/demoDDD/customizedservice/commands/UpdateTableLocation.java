package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;

public class UpdateTableLocation extends Command {
    private final ExtraDecoration location;

    public UpdateTableLocation(ExtraDecoration location) {
        this.location = location;
    }

    public ExtraDecoration getLocation() {
        return location;
    }
}
