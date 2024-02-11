package com.OAuth2.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//Part-7
//https://stackoverflow.com/questions/50919268/difference-between-authorizationserverconfigureradapter-vs-websecurityconfigurer

/*
   Question: What is AuthorizationServerConfigurerAdapter?
  
   Answer:   One thing first. OAuth 2 is an authorization framework. It allows an application (client) to obtain 
  			 limited access to a HTTP service on behalf of a resource owner (user). OAuth 2 is not an authentication protocol.
			 AuthorizationServerConfigurerAdapter is used to configure how the OAuth authorization server works.
			 Here are some aspects which can be configured: supported grant types (e.g. authorization code grant)
			 authorization code service, to store authorization codes token store, to store access 
			 and refresh tokens (e.g. JwtTokenStore) client details service, which holds the client configurations 

 
	public PasswordEncoder encoder() : This method return the object or bean of
	BCryptPasswordEncoder. Since it is returning the bean, so we tagged this method
	with @Bean annotation so that the spring container will manage this bean.
	The purpose of this method is to convert the plain password into hash format 
	during the registration of a new user or it converts to the hash format at the time of
	user authentication.
*/ 
@Configuration
public class ConfigOAuth2 extends AuthorizationServerConfigurerAdapter {

	 private String clientId = "ssa";
	 
	 private String clientSecret = "ssa-secret-key";
	 
	 private String privateKey = 
			 
			 "-----BEGIN RSA PRIVATE KEY-----"
			 +"MIIEpQIBAAKCAQEA4tNge2j0EPlLZB0hdFPJGsucrcjQzVXXQq6PI9bxFfuIlKTS"
			 +"hdBzL8js5T+KIQ0mpiapAYRG2Hk2lBBmpATJNoniKZoqNKy2VRBaQdsLI1QZRNsJ"
			 +"anGBLi93ukEtjFnaPa3EPWcAS7w2Nu9YowkXe58H0/Qy12QxMoFdXM8N5mDTLrvk"
			 +"94SzAP/hzkG09p/A1GfaZE8fRE5E1AZes1TzWrGI0iSFyCJCQFhDgOsTZ+qS2l4h"
			 +"rfl0mmv1o2KHPhfdq6Bs0pZLEDEH7JvT8/3OPHXdXEpXOKp1YNCmGxbqAFeWgpr+"
			 +"ars7dNYzDvNtSyX0ui9IE1B9Jq5b1Tapszbn/QIDAQABAoIBAQDC2WXmXbBb7Gtx"
			 +"Iv0cGuWE2ShMuVd1LKpwI9fep8QOaDdZyYT3Yquwft/RxxV3cv6ieE9yeBkL2ISk"
			 +"CLrDZ0EaUrQvnLlo6nzu8c83B124CYRze93IzJx1+lzVaSwhhwZNObp8LME6TgIc"
			 +"itsPor3DekeVMg+CrBT/F9YF5fBA14mggiVNApJtQN8G167D44t+AdMCxaOirGIS"
			 +"0z39DcNHpw9mXfWYBx7ZYjZorABinJNNaH3wJQ55gFhvFJP4h9u2hd9oHRhOzsWB"
			 +"nSdS84PjUIK5w1LZ/k1ljJK77HA0bqtIHYkOYztoWGyVGgdOv0+QmqfJN6zxxKmt"
			 +"2X2ffZaZAoGBAP9B4GQ0Wi3Iny/XG2AYyUCyfe+HB3+r7tZvAn1mNdQoEgSh7TFz"
			 +"eXKvRalFYG6GhowpyJGBPLYhSFfBUNKHtBehNF4E3FRDlmsWCtc+5jl6Tw7yDwDo"
			 +"B8obwHOUQMkaNu83sWQ5i8L6HS7sh0czFrTnwAyssl//w+rFXsYUkZsnAoGBAON8"
			 +"UtdkFYYaaiby4+qb2y2J4n3h+oly4qSJmvQdyTkg83Zpr9vGSp2QI+RZMl5QT77x"
			 +"kv4Pa9rmYx1TjenNBtFoNME1sSig09C9Dar+QNRqdgKBvaF3MyV7WSbf21bMP/U6"
			 +"hURSlDhR46yOlIIXDBnoV5EERcdUghN8lJoDhmo7AoGAdun2olftRvT2i+/3Fd6W"
			 +"Kyi8GJFcQfMUEhunGko6e3qrYjMZb/cutenHVyM12GedWMDCal69rM92h0NM5rdH"
			 +"g9aasc4r4qmV8o9TP5FS6aX8HKdRrAdsUZB6KJ4BTG6E9w6H+nwAizW/0LNqFhZL"
			 +"1r08L+toMebSG5YVH8xHRPMCgYEA4yqSe18Jk2orWQuyh+Tt4bLQx45zpvBf3ZlA"
			 +"cMiR2gfKuBPgNmL0vhVjkjN0dfRTPkV02VpDBUyN64o1rCU+yrz5+XsJl53LB6bS"
			 +"0E+oI7bQc75lxKkJHUPpCkX/fdTnhZbT4B9qvjcgWX/kU2h6gCCh2UHgAKamYplE"
			 +"t+wPPWMCgYEA4erRPalbH3ke/qGzDGJMr4K/7uwgAwS/IoLxCtcqzC99p7QXratb"
			 +"nAAdj+zSLcDtz5xohpuBlOe5H5QDr3aSIXKU1IqFBOLPiFHqJ9TofDY5L5xC+pbQ"
			 +"/ftYkadjrNZ6BGVYRk6K6GzhRHJX7UdiqS1DJcGYamEnpK508RLX+xs="
			 +"-----END RSA PRIVATE KEY-----";
	 	
									 		
	 private String publicKey = 
			 "-----BEGIN PUBLIC KEY-----"+
			 "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4tNge2j0EPlLZB0hdFPJ"
			 +"GsucrcjQzVXXQq6PI9bxFfuIlKTShdBzL8js5T+KIQ0mpiapAYRG2Hk2lBBmpATJ"
			 +"NoniKZoqNKy2VRBaQdsLI1QZRNsJanGBLi93ukEtjFnaPa3EPWcAS7w2Nu9YowkX"
			 +"e58H0/Qy12QxMoFdXM8N5mDTLrvk94SzAP/hzkG09p/A1GfaZE8fRE5E1AZes1Tz"
			 +"WrGI0iSFyCJCQFhDgOsTZ+qS2l4hrfl0mmv1o2KHPhfdq6Bs0pZLEDEH7JvT8/3O"
			 +"PHXdXEpXOKp1YNCmGxbqAFeWgpr+ars7dNYzDvNtSyX0ui9IE1B9Jq5b1Tapszbn"
			 +"/QIDAQAB"+
			 "-----END PUBLIC KEY-----";
	 
	 /*
	    Q: What is the use of AuthenticationManager?
		
		A: AuthenticationManager is a static class that manages the authentication modules that an application uses. When a request 
		   is made to protected resources, the AuthenticationManager calls the Authenticate method to get an Authorization instance 
		   to use in subsequent requests.
		
	 */
	 @Autowired
	 @Qualifier("authenticationManagerBean")
	 private AuthenticationManager authenticationManager; 
	 
	 @Autowired
	 PasswordEncoder passwordEncoder;
	 
	 @Bean
	 public JwtAccessTokenConverter tokenEnhancer() {
		 System.out.println("step-10 ConfigOAuth2");
		 //System.out.println("Public Key: "+publicKey);
		 //System.out.println("Public Key: "+privateKey);
		 JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		 converter.setSigningKey(privateKey);
		 converter.setVerifierKey(publicKey);
		 return converter;
	 }
	 
	 /*
	  * A TokenStore implementation that just reads data from the tokens themselves. Not really a store since it never 
	  * persists anything, and methods like getAccessToken(OAuth2Authentication) always return null. But nevertheless
	  * a useful tool since it translates access tokens to and from authentications.
	  * 
	  */
	 @Bean
	 public JwtTokenStore tokenStore() {
		 System.out.println("step-11 ConfigOAuth2");
		 return new JwtTokenStore(tokenEnhancer());
	 }
	 
	 /*
	  * accessTokenConverter(): Converter interface for token service implementations that store authentication data inside the token.
	  * 
	  */
	 @Override
	 public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		 System.out.println("step-12 ConfigOAuth2");
		 endpoints.authenticationManager(authenticationManager)
		 .tokenStore(tokenStore()).accessTokenConverter(tokenEnhancer());
	}
	
	 @Override
	 public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		 System.out.println("step-13 ConfigOAuth2");
		 security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
	 }
	 
	 @Override
	 public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		 System.out.println("step-14 ConfigOAuth2");
		 clients.inMemory().withClient(clientId).secret(passwordEncoder.encode(clientSecret)).scopes("read", "write")
		 .authorizedGrantTypes("password","refresh_token").accessTokenValiditySeconds(20000)
		 .refreshTokenValiditySeconds(20000);
	 }
	 
}
