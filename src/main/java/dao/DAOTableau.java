package dao;

import java.util.List;

import dao.generic.AbstractJpaDao;
import domain.Section;
import domain.Tableau;

public class DAOTableau extends AbstractJpaDao<Long, Tableau>{

    public DAOTableau(){
        this.setClazz(Tableau.class);
    }
    
    public void addSections(Tableau tableau, List<Section> sections){
        tableau.setSections(sections);
    }

    public void addDefaultSections(Tableau tableau){
        tableau.setDefaultSections();
    }
    
}
