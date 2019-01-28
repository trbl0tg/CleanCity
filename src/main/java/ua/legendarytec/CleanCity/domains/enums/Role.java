package ua.legendarytec.CleanCity.domains.enums;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.io.Serializable;

public enum Role implements GrantedAuthority{
    USER, ADMIN, PUBLIC_SERVICE;

    Role(){}

    @Override
    public String getAuthority() {
        return name();
    }
}
