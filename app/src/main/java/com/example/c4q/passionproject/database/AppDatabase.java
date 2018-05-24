package com.example.c4q.passionproject.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.c4q.passionproject.models.elections.ElectionsItem;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;
@TypeConverters(value = Converter.class)
@Database(entities = {PollingLocationsItem.class, ElectionsItem.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {// this class will represent the database

    public abstract PollingDao pollingDao();
}
