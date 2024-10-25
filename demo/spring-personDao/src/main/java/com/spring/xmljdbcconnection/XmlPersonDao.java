package com.spring.xmljdbcconnection;

import org.springframework.stereotype.Component;

@Component
public class XmlPersonDao {
    public XmlJdbcConnection xmlJdbcConnection;

    public XmlPersonDao(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    // Other methods to use xmlJdbcConnection
}
