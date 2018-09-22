package com.buyIT.web.service;

import org.springframework.stereotype.Service;

@Service
/**
 * 
 * @author MariaDanescu
 *
 */
public class LoginService {

	public boolean validateUser(String userid, String password) {

		return userid.equalsIgnoreCase("Maria")
				&& password.equalsIgnoreCase("maria1996");
	}

}
