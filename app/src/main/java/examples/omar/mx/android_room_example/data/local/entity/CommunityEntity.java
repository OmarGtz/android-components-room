package examples.omar.mx.android_room_example.data.local.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "comunidad", indices = {@Index(value = {"DelegacionId"})},foreignKeys = @ForeignKey(entity = DelegationEntity.class, parentColumns = "Id", childColumns = "DelegacionId"))
public class CommunityEntity {
    @PrimaryKey
    @ColumnInfo( name = "Id" )
    private int id;
    @ColumnInfo(name = "Nombre")
    private String name;
    @ColumnInfo(name = "Activo")
    private boolean active;
    @ColumnInfo(name = "DelegacionId")
    private int delegationId;
    @ColumnInfo(name = "FechaRegistro")
    private Date Registerdate;
    @ColumnInfo(name = "FechaModificacion")
    private Date updateDate;
    public CommunityEntity() {
    }

    public CommunityEntity(int id, String name, boolean active, int delegationId, Date registerdate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.delegationId = delegationId;
        Registerdate = registerdate;
        this.updateDate = updateDate;
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

    public int getDelegationId() {
        return delegationId;
    }

    public void setDelegationId(int delegationId) {
        this.delegationId = delegationId;
    }

    public Date getRegisterdate() {
        return Registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        Registerdate = registerdate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
