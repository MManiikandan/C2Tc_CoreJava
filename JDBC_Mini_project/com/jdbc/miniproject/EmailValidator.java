package com.jdbc.miniproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EmailValidator {
	    private static final String EMAIL_PATTERN =
	            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
	            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	    // Method to validate email using the regex pattern
	    public static boolean isValidEmail(String email) {
	        if (email == null) {
	            return false;
	        }
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }


}
