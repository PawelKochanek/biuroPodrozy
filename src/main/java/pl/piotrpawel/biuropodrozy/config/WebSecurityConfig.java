package pl.piotrpawel.biuropodrozy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    public BCryptPasswordEncoder passwordEncoder1() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private UserDetailsService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home", "/register").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout().
                permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder1());
    }

}
//    private final DataSource dataSource;
//
//    private final PasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    public WebSecurityConfig(DataSource dataSource, PasswordEncoder bCryptPasswordEncoder) {
//        this.dataSource = dataSource;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().permitAll()
//                .and()
//                .csrf().disable()
//                .headers().frameOptions().disable();
//    }


//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin@admin.pl")
//                .password(bCryptPasswordEncoder.encode("admin12345"))
//                .roles("ADMIN");
//        auth.jdbcAuthentication()
//                .usersByUsernameQuery("SELECT u.username, u.password_hash,1 FROM user u WHERE u.username=?")
//                .authoritiesByUsernameQuery("SELECT u.username, r.role_name, 1 " +
//                        "FROM user u " +
//                        "INNER JOIN user_role ur ON ur.user_id = u.id " +
//                        "INNER JOIN role r ON r.id = ur.roles_id " +
//                        "WHERE u.username=?")
//                .dataSource(dataSource)
//                .passwordEncoder(bCryptPasswordEncoder);
//}

