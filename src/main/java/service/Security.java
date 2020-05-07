package service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@Configuration
public class Security extends WebSecurityConfigurerAdapter {

    //Adicionando usuario e senha para a segurança
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    auth.inMemoryAuthentication().withUser("Gustavo").password("Deal@love");
    }

    //Adicionando a seguranca HTTPS
    @Override
    protected void configure(HttpSecurity http) throws Exception{
    http.authorizeRequests().anyRequest().authenticated()
            .and().httpBasic()
            .and().sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
