package com.iweb.servlet;

import jakarta.servlet.annotation.WebServlet;
import lombok.Data;

@Data
public class User {
    private String uid;
	private String username;
    private String password;
    private String gender;
    private String[] hobby;
    private String description;
}
