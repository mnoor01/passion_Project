package com.example.c4q.passionproject.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.c4q.passionproject.models.elections.ElectionsItem;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;

import java.util.List;

@Dao
public interface PollingDao {
    @Query("SELECT * FROM pollingTable")
    List<PollingLocationsItem> loadAll();

    @Insert
    void insertPollingLocationSites(List<PollingLocationsItem> pollingLocationsItems);

    @Query("SELECT * FROM electionTable")
    List<ElectionsItem> loadElections();
    @Insert
    void insertElectionItems(List<ElectionsItem> electionsItems);


    @Query("SELECT * FROM repTable")
    List<OfficialsItem> loadReps();
    @Insert
    void insertLocalReps(List<OfficialsItem> officialsItems);

}
