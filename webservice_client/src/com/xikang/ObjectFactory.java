
package com.xikang;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xikang package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShowWordResponse_QNAME = new QName("http://xikang.com/", "showWordResponse");
    private final static QName _ShowWord_QNAME = new QName("http://xikang.com/", "showWord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xikang
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowWord }
     * 
     */
    public ShowWord createShowWord() {
        return new ShowWord();
    }

    /**
     * Create an instance of {@link ShowWordResponse }
     * 
     */
    public ShowWordResponse createShowWordResponse() {
        return new ShowWordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xikang.com/", name = "showWordResponse")
    public JAXBElement<ShowWordResponse> createShowWordResponse(ShowWordResponse value) {
        return new JAXBElement<ShowWordResponse>(_ShowWordResponse_QNAME, ShowWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xikang.com/", name = "showWord")
    public JAXBElement<ShowWord> createShowWord(ShowWord value) {
        return new JAXBElement<ShowWord>(_ShowWord_QNAME, ShowWord.class, null, value);
    }

}
