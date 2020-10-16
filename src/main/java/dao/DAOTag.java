package dao;

import dao.generic.AbstractJpaDao;
import domain.Tag;

public class DAOTag extends AbstractJpaDao<Long, Tag>{

    public DAOTag(){
        this.setClazz(Tag.class);
    }
    
}
