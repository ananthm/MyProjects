package com.myapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created with IntelliJ IDEA.
 * User: AnanthM
 * Date: 21/10/13
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
public abstract class CustomHibernateDAOSupport extends HibernateDaoSupport {

    @Autowired
    public void anyMethodName(SessionFactory sessionFactoryExt)
    {
        setSessionFactory(sessionFactoryExt);
    }
}
