package examples.omar.mx.android_room_example.data.local.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;

@Entity(tableName = "usuario_delegacion",indices = @Index(value = {"UsuarioId","DelegacionId"}),primaryKeys = {"DelegacionId","UsuarioId"},foreignKeys = {@ForeignKey(entity = UserEntity.class, parentColumns = "Id", childColumns = "UsuarioId"),
                                                         @ForeignKey(entity = DelegationEntity.class, parentColumns = "Id", childColumns = "DelegacionId")})
public class UserDelegationEntity {

    @ColumnInfo(name = "DelegacionId")
    private int id;
    @ColumnInfo(name = "UsuarioId")
    private int userId;
    @ColumnInfo(name = "Titular")
    private boolean titular;

    public UserDelegationEntity(int id, int userId, boolean titular) {
        this.id = id;
        this.userId = userId;
        this.titular = titular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
