package com.boscloner.bosclonerv2.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import static com.boscloner.bosclonerv2.room.Event.TABLE_NAME;

@Entity(tableName = TABLE_NAME)
public class Event {

    public static final String TABLE_NAME = "events";

    @PrimaryKey(autoGenerate = true)
    public int id;
    public int type;
    public String value;
}
