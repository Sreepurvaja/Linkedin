package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Viewskill;
import com.linkedin.linkedin.Entity.connection;
import com.linkedin.linkedin.Repository.connection_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class connectionService {
    @Autowired
    private connection_Repo connection_repo;

    public connection saveViewconnection(connection Connection) {
        return connection_repo.save(Connection);
    }

    public Optional<connection> getViewconnectionById(Integer userId) {
        return connection_repo.findById(userId);
    }

    public void deleteconnectionByUserId(Integer userId) {
        connection_repo.deleteById(userId);
    }

}
