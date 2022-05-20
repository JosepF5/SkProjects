package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.Years;

public class ChangeChefArea extends Command {
    private final Years area;

    public ChangeChefArea(Years area) {
        this.area = area;
    }
    public Years getArea() {
        return area;
    }
}
