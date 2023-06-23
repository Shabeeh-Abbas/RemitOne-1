package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;

public class Utils {
	
	public static void printRequestHeader(HttpURLConnection connection) {
   	 Map<String, List<String>> requestHeaders = connection.getRequestProperties();
        for (Map.Entry<String, List<String>> entry : requestHeaders.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            if (key != null) {
                System.out.println(key + ": " + values);
            }
        }
    }
	
	public static String httpEntityToString(HttpEntity entity) {
    	try {
            // Use EntityUtils to convert HttpEntity to String
            return EntityUtils.toString(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void printMessage(Document document) {
    	try {
    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
    		Transformer transformer = transformerFactory.newTransformer();
    		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    	    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
    	    DOMSource domSource = new DOMSource(document);
    	    StreamResult streamResult = new StreamResult(System.out);
    	    transformer.transform(domSource, streamResult);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static String xmlResponseStringify(HttpURLConnection connection) throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            response.append(line + "\n");
        }
        reader.close();
        return response.toString();
    }

}
