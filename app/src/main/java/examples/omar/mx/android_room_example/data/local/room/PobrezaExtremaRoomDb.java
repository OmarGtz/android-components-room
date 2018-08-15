package examples.omar.mx.android_room_example.data.local.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import examples.omar.mx.android_room_example.data.local.dao.CommunityDao;
import examples.omar.mx.android_room_example.data.local.dao.DelegationDao;
import examples.omar.mx.android_room_example.data.local.dao.PeriodDao;
import examples.omar.mx.android_room_example.data.local.dao.UserDao;
import examples.omar.mx.android_room_example.data.local.entity.CommunityEntity;
import examples.omar.mx.android_room_example.data.local.entity.DelegationEntity;
import examples.omar.mx.android_room_example.data.local.entity.PeriodEntity;
import examples.omar.mx.android_room_example.data.local.entity.RolEntity;
import examples.omar.mx.android_room_example.data.local.entity.StateEntity;
import examples.omar.mx.android_room_example.data.local.entity.UserDelegationEntity;
import examples.omar.mx.android_room_example.data.local.entity.UserEntity;
import examples.omar.mx.android_room_example.data.local.type_converter.DateConverter;

@TypeConverters({DateConverter.class})
@Database(entities = {CommunityEntity.class, DelegationEntity.class, PeriodEntity.class, RolEntity.class, StateEntity.class, UserEntity.class, UserDelegationEntity.class},version = 1, exportSchema = true)
public abstract class PobrezaExtremaRoomDb extends RoomDatabase{

    public abstract PeriodDao periodDao();
    public  abstract CommunityDao communityDao();
    public abstract DelegationDao delegationDao();
    public abstract UserDao userDao();

}
