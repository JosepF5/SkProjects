package com.sofkaU.demoDDD.customizedservice.commands;

import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;

public class ChangeHolidayExtraDecoration {
    private final CustomizedServiceID customizedServiceID;
    private final ExtraDecoration extraDecoration;

    public ChangeHolidayExtraDecoration(CustomizedServiceID customizedServiceID, ExtraDecoration extraDecoration) {
        this.customizedServiceID = customizedServiceID;
        this.extraDecoration = extraDecoration;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public ExtraDecoration getExtraDecoration() {
        return extraDecoration;
    }
}
