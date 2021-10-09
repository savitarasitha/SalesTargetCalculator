package salestargetcalculator.repository;

public class ExperienceRepositoryException extends Throwable {
    public ExperienceRepositoryException(Exception e, String message) {
        super(message,e);
    }
}
