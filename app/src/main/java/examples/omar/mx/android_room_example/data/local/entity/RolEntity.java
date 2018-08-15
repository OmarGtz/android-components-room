package examples.omar.mx.android_room_example.data.local.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "rol")
public class RolEntity {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;
    @ColumnInfo(name = "Nombre")
    private String name;
    @ColumnInfo(name = "Activo")
    private boolean active;

    @Ignore
    public RolEntity() {
    }

    public RolEntity(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
