package examples.omar.mx.android_room_example.data.local.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "delegacion",indices = @Index(value = {"EstadoId"}),foreignKeys = @ForeignKey(entity = StateEntity.class, parentColumns = "Id", childColumns = "EstadoId"))
public class DelegationEntity {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;
    @ColumnInfo(name = "EstadoId")
    private int stateId;
    @ColumnInfo(name = "Nombre")
    private String name;
    @ColumnInfo(name = "Activo")
    private Date updateDate;
    @ColumnInfo(name = "CorreoElectronico")
    private String email;

    public DelegationEntity(int id, int stateId, String name, Date updateDate, String email) {
        this.id = id;
        this.stateId = stateId;
        this.name = name;
        this.updateDate = updateDate;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}