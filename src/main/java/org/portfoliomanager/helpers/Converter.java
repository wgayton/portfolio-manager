package org.portfoliomanager.helpers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

@SuppressWarnings("unused")
public class Converter {
    static public <T> T fromXmlFile(File file, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new XmlMapper();
        return mapper.readValue(file, clazz);
    }

    static public <T> T fromXmlFile(String path, Class<T> clazz) throws IOException {
        File file = new File(path);
        ObjectMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        return mapper.readValue(file, clazz);
    }

    static public <T> T fromXmlString(String input, Class<T> clazz) throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(input, clazz);
    }

    public static String toJson(Object o) throws IOException {
        Writer writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        mapper.writeValue(writer,o);
        return writer.toString();
    }
}
