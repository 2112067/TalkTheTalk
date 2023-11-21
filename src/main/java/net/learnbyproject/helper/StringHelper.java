
package net.learnbyproject.helper;

import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

public class StringHelper {
    public static String[] getDateParts(String date) {
        return date.split("-");
    }
    
    public static String convertBase64(byte[] avatar) {
        if (avatar == null || avatar.length == 0) {
            // Return a default avatar image path or data
            return "/img/default-avatar.jpg";
        }
        
        try {
            // From JKD 8
            return Base64.getEncoder().encodeToString(avatar);
        } catch (Exception e) {
            // Handle the exception, e.g., log it or return a default avatar
            e.printStackTrace();
            return "/img/default-avatar.jpg";

        }
    }
}

