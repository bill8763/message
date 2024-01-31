/**
 * 
 */
package com.bill.message.jwt;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

/**
 * @ClassName: JwtService
 * @Description:
 * @author bill8
 * @date 2024/1/31 上午 12:04:24
 * 
 */
@Service
//@Slf4j
public class JwtService {

	private Long EXPIRATION_TIME = (long) (24 * 60 * 60 * 1000); // 單位ms

	// BASE64編碼的密鑰
	private String SECRET_KEY = "AJK3FL4SJ9JKJLJI028FY975312C5CAB9C95A494BF8B33D3AAEC5EE83093D74E886453344F4A2D97E09F5E85963";


	/**
	 * 簽發Token
	 */
	public String generateToken(String subject) {

		return Jwts.builder().setSubject(subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();

	}
	
	public static void main (String[] args) {
		System.out.println(StringUtils.replace(UUID.randomUUID().toString(), "-", "").toUpperCase() );
		String token = new JwtService().generateToken("A01");
		System.out.println(token);
	} 


}
