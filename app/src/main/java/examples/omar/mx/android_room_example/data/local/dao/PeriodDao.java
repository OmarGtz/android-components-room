package examples.omar.mx.android_room_example.data.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import examples.omar.mx.android_room_example.data.local.entity.PeriodEntity;

@Dao
public interface PeriodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPeriod(List<PeriodEntity> periods);

    @Query("Select * from PERIODO")
    List<PeriodEntity> getPeriods();

}
