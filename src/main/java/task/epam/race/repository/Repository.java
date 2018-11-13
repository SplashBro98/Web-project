package task.epam.race.repository;

import com.viazovski.flowerauction.exception.RepositoryException;
import com.viazovski.flowerauction.specification.SqlSpecification;

import java.util.List;

public interface Repository<T> {

    void add(T item) throws RepositoryException;

    void remove(T item) throws RepositoryException;

    void update(T item) throws RepositoryException;

    List<T> selectAll() throws RepositoryException;

    List<T> query(SqlSpecification spec) throws RepositoryException;
}
