package cn.chan.dao;


import cn.chan.entity.UserCollection;

import java.util.List;

public interface UserCollectionDao {

    public List<UserCollection> findByUser(Integer userid);


    /**
     * 添加收藏
     * @param userCollection
     */
    public void addUserCollection(UserCollection userCollection);






}
