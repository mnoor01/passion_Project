package com.example.c4q.passionproject.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;

import java.util.List;

@Dao
public interface PollingDao {

    @Insert
    void insertPollingSites(List<PollingLocationsItem> pollingLocationsItems);

    @Query("SELECT * FROM pollingTable")
    List<PollingLocationsItem> loadAll();

}
