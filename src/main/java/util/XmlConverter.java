package util;
import javax.xml.bind.*;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlConverter<T> {
	    private Class<T> clazz;
	    private JAXBContext jaxbContext;

	    public XmlConverter(Class<T> clazz) throws JAXBException {
	        this.clazz = clazz;
	        this.jaxbContext = JAXBContext.newInstance(clazz);
	    }

	    public String toXml(T object) throws JAXBException {
	        Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        StringWriter stringWriter = new StringWriter();
	        marshaller.marshal(object, stringWriter);
	        return stringWriter.toString();
	    }

	    public T fromXml(String xml) throws JAXBException {
	        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        StringReader stringReader = new StringReader(xml);
	        return clazz.cast(unmarshaller.unmarshal(stringReader));
	    }
}


