package br.com.devdojo.examgenerator.security.filter;

import java.util.concurrent.TimeUnit;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Constants {
	public static final String SECRET = "secre";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final long EXPIRATION_TIME = 86400000L;
	
	public static void main(String[] args) {
		System.out.println(TimeUnit.MILLISECONDS.convert( 1, TimeUnit.DAYS));
		System.out.println(new BCryptPasswordEncoder().encode("devdojo"));
	}
	
}
