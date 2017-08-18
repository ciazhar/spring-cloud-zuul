package com.ciazhar.apigateway;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableWebSecurity(debug=true)
@EnableOAuth2Sso
public class KonfigurasiSecurity extends WebSecurityConfigureAdapter{
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**").authorizeRequests().anyRequest().authenticated();
    }
}