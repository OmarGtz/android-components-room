package examples.omar.mx.android_room_example.data.local.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "usuario",indices = @Index(value = {"RolId"}),foreignKeys = @ForeignKey(entity = RolEntity.class, parentColumns = "Id",childColumns = "RolId"))
public class UserEntity {
    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;
    @ColumnInfo(name = "nombre")
    private String name;
    @ColumnInfo(name = "ApellidoPaterno")
    private String lastName;
    @ColumnInfo(name = "ApellidoMaterno")
    private String lastName_m;
    @ColumnInfo(name = "CorreoElectronico")
    private String email;
    @ColumnInfo(name = "RolId")
    private int rolId;
    @ColumnInfo(name = "activo")
    private boolean active;

    public UserEntity(int id, String name, String lastName, String lastName_m, String email, int rolId, boolean active) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.lastName_m = lastName_m;
        this.email = email;
        this.rolId = rolId;
        this.active = active;
    }

    @Ignore
    public UserEntity() {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName_m() {
        return lastName_m;
    }

    public void setLastName_m(String lastName_m) {
        this.lastName_m = lastName_m;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
