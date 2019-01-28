package ua.legendarytec.CleanCity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import ua.legendarytec.CleanCity.domains.User;
import ua.legendarytec.CleanCity.domains.enums.Role;
import ua.legendarytec.CleanCity.repos.UserDetailsRepo;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Set;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{


    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/css/**", "/webjars/**", "/static/**", "/error**").permitAll()
                .anyRequest().authenticated()
                    .and()
                .logout().logoutSuccessUrl("/").permitAll()
                    .and()
                .csrf().disable();
    }

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/resources/**");
//    }

    @Bean
    public PrincipalExtractor principalExtractor(UserDetailsRepo userDetailsRepo) {


        return map -> {
            String id = (String) map.get("sub");

            User user = userDetailsRepo.findById(id).orElseGet(() -> {
                User newUser = new User();

                newUser.setId(id);
                newUser.setName((String) map.get("name"));
                newUser.setEmail((String) map.get("email"));
                newUser.setGender((String) map.get("gender"));
                newUser.setLocale((String) map.get("locale"));
                newUser.setUserpic((String) map.get("picture"));

                if (id.equals("103657780579541062410")){
                    Set<Role> roles = Set.of(Role.ADMIN, Role.USER);
                    newUser.setRoles(roles);
                }
                else {
                    newUser.setRoles(Collections.singleton(Role.USER));
                }
                newUser.setActive(true);

                return newUser;
            });

            user.setLastVisit(LocalDateTime.now());

            return userDetailsRepo.save(user);
        };
    }
}