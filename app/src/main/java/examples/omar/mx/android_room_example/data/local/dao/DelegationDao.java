package examples.omar.mx.android_room_example.data.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import examples.omar.mx.android_room_example.data.local.entity.DelegationEntity;


@Dao
public interface DelegationDao {

    @Query("SELECT * from DELEGACION")
    public List<DelegationEntity> getDelegations();

}
