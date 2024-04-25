package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Login;

import com.linkedin.linkedin.Repository.Login_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private Login_Repo login_repo;

    public Login authenticate(String email, String password) {
        return login_repo.findByEmailAndPassword(email, password);
    }
}
