package dao;

import dao.generic.AbstractJpaDao;
import domain.Utilisateur;

public class DAOUtilisateur extends AbstractJpaDao<Long, Utilisateur>{

    public DAOUtilisateur(){
        this.setClazz(Utilisateur.class);
    }
    
}
