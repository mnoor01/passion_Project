package com.example.c4q.passionproject.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.elections.ElectionsItem;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;

@TypeConverters(value = Converter.class)
@Database(entities = {PollingLocationsItem.class, ElectionsItem.class, OfficialsItem.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {// this class will represent the database

    private static AppDatabase database;

    public abstract PollingDao pollingDao();

    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {

        }
    };

    public static AppDatabase getInstance(Context context) {
        if (database == null) {
            database = Room
                    .databaseBuilder(context.getApplicationContext(), AppDatabase.class, "passionDb")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return database;
    }

    public void destroyInstance() {
        database = null;
    }


}
