package cn.chan.service.impl;


import cn.chan.dao.UserCollectionDao;
import cn.chan.entity.UserCollection;
import cn.chan.service.UserCollectionService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserCollectionServiceImpl implements UserCollectionService{

    private UserCollectionDao userCollectionDao;

    public void setUserCollectionDao(UserCollectionDao userCollectionDao) {
        this.userCollectionDao = userCollectionDao;
    }

    @Override
    public List<UserCollection> findByUser(Integer userid) {
        return null;
    }

    @Override
    public void addUserCollection(UserCollection userCollection) {

        userCollectionDao.addUserCollection(userCollection);
    }
}
