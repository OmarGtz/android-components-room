package examples.omar.mx.android_room_example.data.local.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "estado")
public class StateEntity {

    @ColumnInfo(name = "Id")
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "nombre")
    private String name;

    public StateEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Ignore
    public StateEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
