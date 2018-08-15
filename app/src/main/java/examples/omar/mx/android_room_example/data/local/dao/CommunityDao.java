package examples.omar.mx.android_room_example.data.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import examples.omar.mx.android_room_example.data.local.entity.CommunityEntity;

@Dao
public interface CommunityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void inserCommunities(List<CommunityEntity> communities);

    @Query("select * from COMUNIDAD")
    List<CommunityEntity> getAllCommunities();

    @Query("Select * from COMUNIDAD")
    List<CommunityEntity> getCommunitiesDone();

    @Query("SELECT * FROM COMUNIDAD")
    List<CommunityEntity> getCommunitiesPendient();

}
