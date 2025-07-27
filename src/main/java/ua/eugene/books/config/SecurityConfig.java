package ua.eugene.books.config;

import lombok.RequiredArgsConstructor;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private static final String[] LIST_URL = {

            "/api/book",
            "/api/book/info",
            "/api/filter",
            "/api/register",
            "/api/login",
            "/oauth2/**",
            "/css/**",
            "/js/**"


    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(requests -> requests.
                        requestMatchers(LIST_URL).permitAll()
                        .requestMatchers(HttpMethod.GET, "/api/books/**").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/api/login")
                        .defaultSuccessUrl("/api/user/books", true)
                )
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/api/login")
                        .defaultSuccessUrl("/api/user/books", true)
                )
                .logout(customizer -> customizer.logoutSuccessUrl("/api/books").permitAll()
                )
                .httpBasic(Customizer.withDefaults())
                .build();
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
