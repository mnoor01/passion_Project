package com.example.c4q.passionproject.models.Parent;

import com.example.c4q.passionproject.models.NormalizedInput;
import com.example.c4q.passionproject.models.Offices;
import com.example.c4q.passionproject.models.Officials;

/**
 * Created by c4q on 5/6/18.
 */

public class RepModel {
    private NormalizedInput normalizedInput;
    private Offices[] offices;
    private Officials[] officials;

    public NormalizedInput getNormalizedInput() {
        return normalizedInput;
    }

    public void setNormalizedInput(NormalizedInput normalizedInput) {
        this.normalizedInput = normalizedInput;
    }

    public Offices[] getOffices() {
        return offices;
    }

    public void setOffices(Offices[] offices) {
        this.offices = offices;
    }

    public Officials[] getOfficials() {
        return officials;
    }

    public void setOfficials(Officials[] officials) {
        this.officials = officials;
    }
}
