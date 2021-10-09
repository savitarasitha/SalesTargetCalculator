package salestargetcalculator.repository;

public interface ExperienceRepository {

    String[] getExperienceAndPosition(int id) throws ExperienceRepositoryException;    
}
