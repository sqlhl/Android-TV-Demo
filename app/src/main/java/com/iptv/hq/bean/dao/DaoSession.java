package com.iptv.hq.bean.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.iptv.hq.bean.VideoBean;

import com.iptv.hq.bean.dao.VideoBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig videoBeanDaoConfig;

    private final VideoBeanDao videoBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        videoBeanDaoConfig = daoConfigMap.get(VideoBeanDao.class).clone();
        videoBeanDaoConfig.initIdentityScope(type);

        videoBeanDao = new VideoBeanDao(videoBeanDaoConfig, this);

        registerDao(VideoBean.class, videoBeanDao);
    }
    
    public void clear() {
        videoBeanDaoConfig.clearIdentityScope();
    }

    public VideoBeanDao getVideoBeanDao() {
        return videoBeanDao;
    }

}
