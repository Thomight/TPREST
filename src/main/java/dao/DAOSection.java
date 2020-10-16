package dao;

import java.util.List;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Section;
import domain.Tableau;

public class DAOSection extends AbstractJpaDao<Long, Section> {

    public DAOSection(){
        this.setClazz(Section.class);
    }
    
    public void addCarte(Section section, List<Carte> cartes){
        section.setCartes(cartes);
    }

    public void addTableau(Section section, Tableau tableau){
        section.setTableau(tableau);
    }
}
