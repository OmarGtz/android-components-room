package examples.omar.mx.android_room_example.data.local.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "periodo")
public class PeriodEntity {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;
    @ColumnInfo(name = "Nombre")
    private String name;


    public PeriodEntity(int id, String name) {
        this.id = id;
        this.name = name;
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
