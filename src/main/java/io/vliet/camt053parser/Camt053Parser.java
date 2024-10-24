package io.vliet.camt053parser;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import iso.std.iso._20022.tech.xsd.camt_053_001.Document;
import iso.std.iso._20022.tech.xsd.camt_053_001.ObjectFactory;

import java.io.BufferedReader;

public class Camt053Parser {

    public Document parse(BufferedReader inputStream) throws JAXBException {
        Unmarshaller unmarshaller = JAXBContext.newInstance(ObjectFactory.class).createUnmarshaller();
        return ((JAXBElement<Document>) unmarshaller.unmarshal(inputStream)).getValue();
    }
}
