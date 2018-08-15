package examples.omar.mx.android_room_example.data.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import examples.omar.mx.android_room_example.data.local.entity.UserEntity;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveUser(UserEntity userEntity);

    @Query("Select * from USUARIO WHERE id = :userId")
    UserEntity getUser(int userId);

    @Delete
    void deleteUsers(UserEntity users);

}
