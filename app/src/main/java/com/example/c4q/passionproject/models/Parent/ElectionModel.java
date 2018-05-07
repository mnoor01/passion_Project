package com.example.c4q.passionproject.models.Parent;

import com.example.c4q.passionproject.models.Election;
import com.example.c4q.passionproject.models.ElectionAdministrationBody;
import com.example.c4q.passionproject.models.Local_Jurisdiction;
import com.example.c4q.passionproject.models.Sources;

/**
 * Created by c4q on 5/6/18.
 */

public class ElectionModel {
    private String name;
    private ElectionAdministrationBody electionAdministrationBody;
    private Local_Jurisdiction local_jurisdiction;
    private Sources sources;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ElectionAdministrationBody getElectionAdministrationBody() {
        return electionAdministrationBody;
    }

    public void setElectionAdministrationBody(ElectionAdministrationBody electionAdministrationBody) {
        this.electionAdministrationBody = electionAdministrationBody;
    }

    public Local_Jurisdiction getLocal_jurisdiction() {
        return local_jurisdiction;
    }

    public void setLocal_jurisdiction(Local_Jurisdiction local_jurisdiction) {
        this.local_jurisdiction = local_jurisdiction;
    }

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }
}
