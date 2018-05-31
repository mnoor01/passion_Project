package com.example.c4q.passionproject.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.arch.persistence.room.migration.Migration;
import android.support.annotation.NonNull;

import com.example.c4q.passionproject.models.elections.ElectionsItem;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;
@TypeConverters( value = Converter.class)
@Database(entities = {PollingLocationsItem.class, ElectionsItem.class}, version = 2,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {// this class will represent the database
   public static final Migration MIGRATION_1_2=new Migration(1,2) {
       @Override
       public void migrate(@NonNull SupportSQLiteDatabase database) {

       }
   };

    public abstract PollingDao pollingDao();
}
