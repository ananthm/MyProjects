package com.myapp.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;


@Repository("loginDAO")
public class LoginDao extends CustomHibernateDAOSupport {

    public boolean validateLogin(String username, String password) throws DataAccessException {
        //ArrayList<Brand> brandList= new ArrayList<Brand>();
        //Brand brand = new Brand();
        //try{
            //brandList = (ArrayList)getHibernateTemplate().find("from Brand brand where brand.brandUrl = ?", url);
        //} catch (DataAccessException ex) {
            //throw new DAOGenericException("Error at SupplierDAO. Could not access to OTA_SUPPLIERS table\n");
        //}
        //if(brandList != null && !brandList.isEmpty()) {
            //brand = brandList.get(0);
        //}
        return true;

    }
}
