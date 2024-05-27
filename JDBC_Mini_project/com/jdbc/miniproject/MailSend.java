package com.jdbc.miniproject;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public final  class MailSend {
	 private static final String username="manikandancsesdm@gmail.com";
     private static final String password="kqgb dmxk hzkc nxcj";
	 public static void sendMail(Employee emp,String msg){
        Properties properties=new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
       
        Session session=Session.getInstance(properties,new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return  new PasswordAuthentication(username,password);
            }
        });
        Message message=prepareMessage(session,username,emp,msg);
        try{
            Transport.send(message);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("email sent succesfully to"+emp.getEmpMail());

    }
    private static Message prepareMessage(Session session,String username,Employee emp,String msg){
       Message message=new MimeMessage(session);
        try {
        	
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(emp.getEmpMail())});
            message.setSubject("mail demo");
            message.setText(emp.toString()+msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return message;
    }

}
