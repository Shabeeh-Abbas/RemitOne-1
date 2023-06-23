package adapters;

import dto.Dto;

import java.lang.reflect.Field;


import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;

public class FormDataAdaptor implements Adaptor{

	public Object convertDTO(Dto dto) {
		
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		
		// Get all the fields of the POJO using reflection
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            
         // Get the field name and value
            String name = field.getName();
            Object value;
            try {
                value = field.get(dto);
                if(value==null) continue;
            } catch (IllegalAccessException e) {
                // Handle exception if unable to access the field
                e.printStackTrace();
                continue;
           }
         // Add the field as a form parameter
            builder.addTextBody(name, value.toString(), ContentType.TEXT_PLAIN);
        }
		HttpEntity formData = builder.build();
		return formData;
	}

	

}
