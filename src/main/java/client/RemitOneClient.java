package client;
import util.*;

import adapters.FormDataAdaptor;
import dto.CreateBeneficiaryDto;
import dto.CreateRemitterDto;
import dto.UpdateBeneficiaryDto;
import dto.UpdateRemitterDto;
import responses.createremitterresponse.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Element;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;


public class RemitOneClient {
    
	public static void main( String[] args ) throws IOException, JAXBException{
//       CreateRemitterDto dto = new CreateRemitterDto();
//       //test remitter id 10027
//       dto.setUsername(Constants.USERNAME);
//       dto.setPassword(Constants.PASSWORD);
//       dto.setPin(Constants.PIN);
//       dto.setAgent_name("FTS_01");
//       dto.setFirstname("Anis");
//       dto.setLastname("Hassan");
//       dto.setType("basicregistered");
//       dto.setStatus("valid");
//       dto.setAddress1("Fitco Center");
//       dto.setCity("Kaula lampur");
//       dto.setNationality("MY");
//       dto.setPostcode("75568");
//       dto.setDob("1998-09-20");
//       dto.setMobile("+923362585043");
		
//		CreateBeneficiaryDto dto = new CreateBeneficiaryDto();
//		//test beneficiary id 32
//		dto.setUsername("remit_shabeeh");
//		dto.setPassword("Remitone123");
//		dto.setPin("12345");
//		dto.setName("Ahmed Ali");
//		dto.setAddress1("Fitco Center");
//		dto.setLinked_member_id("10023");
//		dto.setCountry("Malaysia");
//		dto.setMobile("+923362585048");
//		
//	   UpdateBeneficiaryDto dto = new UpdateBeneficiaryDto();
//	   dto.setUsername("remit_shabeeh");
//	   dto.setPassword("Remitone123");
//	   dto.setPin("12345");
//	   dto.setBeneficiary_id("32");	
//	   dto.setName("Ahmed Ali Khan");
	   
//	   UpdateRemitterDto dto = new UpdateRemitterDto();
//	   dto.setUsername("remit_shabeeh");
//	   dto.setPassword("Remitone123");
//	   dto.setPin("12345");
//	   dto.setAgent_name("FTS_01");
//	   dto.setRemitter_id("10027");
//	   dto.setStatus("valid");
       
//	   FormDataAdaptor adap = new FormDataAdaptor();
//       Object formData = (HttpEntity) adap.convertDTO(dto);
//       updateRemitter((HttpEntity)formData);
    }
	
	public static Object updateBeneficiary(HttpEntity entity) throws UnsupportedEncodingException, IOException, JAXBException {
		URL url = new URL(Constants.UPDATE_BENEFICIARY_URL);
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	Utils.printRequestHeader(connection);
    	// Set the request method to POST
        connection.setRequestMethod("POST");
        //Set the content type to application/formData
        Header contentTypeHeader = entity.getContentType();
        String boundary = ""; 
        if (contentTypeHeader != null) {
            ContentType contentType = ContentType.parse(contentTypeHeader.getValue());
            boundary = contentType.getParameter("boundary");
        }
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        System.out.println(connection.getRequestMethod());
        // Enable output and disable caching
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        // Form Data payload to send
        String formDataPayload = Utils.httpEntityToString(entity);
        System.out.println(formDataPayload);
            // Write the FormData payload to the request body
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(formDataPayload.getBytes("UTF-8"));     
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        String xmlResponseString = Utils.xmlResponseStringify(connection);
        System.out.println(xmlResponseString);
        
        XmlConverter<responses.updatebeneficiaryresponse.Response> xmlConverter = 
        		new XmlConverter<>(responses.updatebeneficiaryresponse.Response.class);
        responses.updatebeneficiaryresponse.Response res =
        		(responses.updatebeneficiaryresponse.Response) xmlConverter.fromXml(xmlResponseString);
        
        connection.disconnect();
    	return res;
	}
	
	public static Object updateRemitter(HttpEntity entity) throws UnsupportedEncodingException, IOException, JAXBException {
		URL url = new URL(Constants.UPDATE_REMITTER_URL);
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	Utils.printRequestHeader(connection);
    	// Set the request method to POST
        connection.setRequestMethod("POST");
        //Set the content type to application/formData
        Header contentTypeHeader = entity.getContentType();
        String boundary = ""; 
        if (contentTypeHeader != null) {
            ContentType contentType = ContentType.parse(contentTypeHeader.getValue());
            boundary = contentType.getParameter("boundary");
        }
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        System.out.println(connection.getRequestMethod());
        // Enable output and disable caching
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        // Form Data payload to send
        String formDataPayload = Utils.httpEntityToString(entity);
        System.out.println(formDataPayload);
            // Write the FormData payload to the request body
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(formDataPayload.getBytes("UTF-8"));     
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        String xmlResponseString = Utils.xmlResponseStringify(connection);
        System.out.println(xmlResponseString);
        
        XmlConverter<responses.updateremitterresponse.Response> xmlConverter = 
        		new XmlConverter<>(responses.updateremitterresponse.Response.class);
        responses.updateremitterresponse.Response res =(responses.updateremitterresponse.Response) 
        		xmlConverter.fromXml(xmlResponseString);
        
        connection.disconnect();
    	return res;
	}
	
	public static responses.createbeneficiaryresponse.Response createBeneficiary(HttpEntity entity) throws IOException, JAXBException {
		URL url = new URL(Constants.CREATE_BENIFICIARY_URL);
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	Utils.printRequestHeader(connection);
    	// Set the request method to POST
        connection.setRequestMethod("POST");
        //Set the content type to application/formData
        Header contentTypeHeader = entity.getContentType();
        String boundary = ""; 
        if (contentTypeHeader != null) {
            ContentType contentType = ContentType.parse(contentTypeHeader.getValue());
            boundary = contentType.getParameter("boundary");
        }
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        System.out.println(connection.getRequestMethod());
        // Enable output and disable caching
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        // Form Data payload to send
        String formDataPayload = Utils.httpEntityToString(entity);
        System.out.println(formDataPayload);
            // Write the FormData payload to the request body
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(formDataPayload.getBytes("UTF-8"));     
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
         //printing input stream
        String xmlResponseString = Utils.xmlResponseStringify(connection);
        System.out.println(xmlResponseString);
        
        XmlConverter<responses.createbeneficiaryresponse.Response> xmlConverter = new XmlConverter<>
        (responses.createbeneficiaryresponse.Response.class);
        responses.createbeneficiaryresponse.Response res =
        		(responses.createbeneficiaryresponse.Response) xmlConverter.fromXml(xmlResponseString);
        
        connection.disconnect();
    	return res;
     } 
    
     public static responses.createremitterresponse.Response createRemitter(HttpEntity entity) throws IOException, JAXBException {
    	URL url = new URL(Constants.CREATE_REMITTER_URL);
    	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	Utils.printRequestHeader(connection);
    	// Set the request method to POST
        connection.setRequestMethod("POST");
        //Set the content type to application/formData
        Header contentTypeHeader = entity.getContentType();
        String boundary = ""; 
        if (contentTypeHeader != null) {
            ContentType contentType = ContentType.parse(contentTypeHeader.getValue());
            boundary = contentType.getParameter("boundary");
        }
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        System.out.println(connection.getRequestMethod());
        // Enable output and disable caching
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        // Form Data payload to send
        String formDataPayload = Utils.httpEntityToString(entity);
        System.out.println(formDataPayload);
            // Write the FormData payload to the request body
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(formDataPayload.getBytes("UTF-8"));     
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
         //printing input stream
        String xmlResponseString = Utils.xmlResponseStringify(connection);
        System.out.println(xmlResponseString);
        
        XmlConverter<Response> xmlConverter = new XmlConverter<>(Response.class);
        Response res =(Response) xmlConverter.fromXml(xmlResponseString);
        
        connection.disconnect();
    	return res;
    }
    
}
