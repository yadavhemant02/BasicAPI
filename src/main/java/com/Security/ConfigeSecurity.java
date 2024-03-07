package com.Security;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class ConfigeSecurity {
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		
//		http
//		    .csrf(csrf->csrf.disable())
//		    .cors(cors->cors.disable())
//		    .authorizeHttpRequests(auth->auth.requestMatchers("/data").authenticated()
//		    		.requestMatchers("/").permitAll()
//		    		.anyRequest().authenticated())
//		    .exceptionHandling(ex->ex.authenticationEntryPoint(null))
//		    .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		    //.httpBasic();
//		    .oauth2Login();
//		
//		
//		
//		return http.build();
//	}
//	
//	
//	
////	@Bean
////	public InMemoryUserDetailsManager userDetaileService() {
////		UserDetails user = User.withDefaultPasswordEncoder()
////				.username("hemant")
////				.password("hemant")
////				.roles("user")
////				.build();
////		
////		return new InMemoryUserDetailsManager(user);
////	}
//	
//	
//
//}
