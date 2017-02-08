package com.niit.backend.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/admin/**")
					.access("hasAuthority('ADMIN')")
				.antMatchers("/user/**")
					.access("hasAuthority('USER')")
				.and()
					.formLogin()
						.loginPage("/login")
							.defaultSuccessUrl("/")
								.failureUrl("/login?error")
								.usernameParameter("email")
									.passwordParameter("password")
						.and()
							.logout()
								.logoutSuccessUrl("/login?logout")
									.invalidateHttpSession(true)
						.and()
							.exceptionHandling()
								.accessDeniedPage("/403")
						.and()
							.csrf()
								.disable();
	}

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		String query = "SELECT USER_EMAIL, USER_ROLE FROM USERS WHERE USER_EMAIL = ?";
		auth.jdbcAuthentication().dataSource(dataSource).authoritiesByUsernameQuery(query)
				.usersByUsernameQuery("SELECT USER_EMAIL, USER_PASSWORD, USER_ENABLED FROM USERS WHERE USER_EMAIL = ?");
	
		
	/*auth.inMemoryAuthentication().withUser("aqibkazi97@gmail.com").password("test").roles("USER");*/
	}
}

