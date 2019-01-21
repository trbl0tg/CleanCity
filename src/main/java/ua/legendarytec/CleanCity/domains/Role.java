package ua.legendarytec.CleanCity.domains;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public enum Role implements Serializable {
    USER, PUBLIC_SERVICE, ADMIN;
}
