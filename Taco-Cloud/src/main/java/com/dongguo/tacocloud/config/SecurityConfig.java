//package com.dongguo.tacocloud.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * 解码器
// */
//@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http.authorizeHttpRequests(auth ->
////                {
////                    try {
////                        auth
////                                .requestMatchers("/api/home").hasRole("USER")
////                                .requestMatchers("/", "/**").permitAll()
////                                .and()
////                                .formLogin()
////                                .loginPage("/login").loginProcessingUrl("/login")
////                                .usernameParameter("username").passwordParameter("password")
////                                .defaultSuccessUrl("/design", true)
////                                .and();
////                    } catch (Exception e) {
////                        throw new RuntimeException(e);
////                    }
////                }
////        );
////        return http.build();
////    }
//
//    /**
//     * 使用 bcrypt 强哈希加密。
//     *
//     * @return
//     */
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    /**
//     * 初始构建root和admin两个用户
//     *
//     * @param encoder
//     * @return
//     */
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//        List<UserDetails> usersList = new ArrayList<>();
//        usersList.add(new User(
//                "root", encoder.encode("root"),
//                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//        usersList.add(new User(
//                "admin", encoder.encode("admin"),
//                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//        return new InMemoryUserDetailsManager(usersList);
//    }
//}
