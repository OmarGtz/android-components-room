package examples.omar.mx.android_room_example.data.repository;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import examples.omar.mx.android_room_example.data.local.entity.CommunityEntity;
import examples.omar.mx.android_room_example.data.local.entity.DelegationEntity;
import examples.omar.mx.android_room_example.data.local.entity.PeriodEntity;
import examples.omar.mx.android_room_example.data.local.entity.UserEntity;
import examples.omar.mx.android_room_example.data.local.room.PobrezaExtremaRoomDb;


public class PExtremaRepository {

private PobrezaExtremaRoomDb db;
private Executor executor;


    @Inject
    public PExtremaRepository(PobrezaExtremaRoomDb db, Executor executor) {
        this.db = db;
    }

    // QUERIES
    public List<CommunityEntity> getCommunity(){
        return db.communityDao().getAllCommunities();
    }

    public List<DelegationEntity> getDelegations(){
        return db.delegationDao().getDelegations();
    }

    public List<PeriodEntity> getPeriods(){
        return db.periodDao().getPeriods();
    }

    public UserEntity getUser(int userId){
        return db.userDao().getUser(userId);
    }

    //Insert
    void InsertPeriods(List<PeriodEntity> periods){
        executor.execute(() -> {

        });
    }


    void InsertDelegations(List<DelegationEntity> delegations){
        executor.execute(()->{

        });
    }


    void InsertCommunities(List<CommunityEntity> communities){
        executor.execute(()->{

        });
    }

    void InsertUser(UserEntity user){
        executor.execute(()->{

        });

    }

}
