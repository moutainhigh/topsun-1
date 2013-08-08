/**
 * UnsignedByte.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.schemas;

/**
 * UnsignedByte bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class UnsignedByte implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://schemas.microsoft.com/2003/10/Serialization/",
			"unsignedByte", "ns2");

	/**
	 * field for UnsignedByte
	 */

	protected org.apache.axis2.databinding.types.UnsignedByte localUnsignedByte;

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axis2.databinding.types.UnsignedByte
	 */
	public org.apache.axis2.databinding.types.UnsignedByte getUnsignedByte() {
		return localUnsignedByte;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UnsignedByte
	 */
	public void setUnsignedByte(
			org.apache.axis2.databinding.types.UnsignedByte param) {

		this.localUnsignedByte = param;

	}

	/**
	 * 
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME);
		return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		// We can safely assume an element has only one type associated with it

		java.lang.String namespace = "http://schemas.microsoft.com/2003/10/Serialization/";
		java.lang.String _localName = "unsignedByte";

		writeStartElement(null, namespace, _localName, xmlWriter);

		// add the type details if this is used in a simple type
		if (serializeType) {
			java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://schemas.microsoft.com/2003/10/Serialization/");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":unsignedByte", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"unsignedByte", xmlWriter);
			}
		}

		if (localUnsignedByte == null) {

			// write the nil attribute
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);

		} else {

			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localUnsignedByte));

		}

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace
				.equals("http://schemas.microsoft.com/2003/10/Serialization/")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter
				.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix
						+ ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite
								.append(prefix)
								.append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				} else {
					stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter
					.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil
						.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 * 
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(
			javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		// We can safely assume an element has only one type associated with it

		if (localUnsignedByte == null) {
			return new org.apache.axis2.databinding.utils.reader.NullXMLStreamReader(
					MY_QNAME);
		} else {
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localUnsignedByte) }, null);
		}

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static UnsignedByte parse(javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			UnsignedByte object = new UnsignedByte();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				nillableValue = reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "nil");
				if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
					// Skip the element and report the null value. It cannot
					// have subelements.
					while (!reader.isEndElement())
						reader.next();

					return object;

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				while (!reader.isEndElement()) {
					if (reader.isStartElement()) {

						if (reader.isStartElement()
								&& new javax.xml.namespace.QName(
										"http://schemas.microsoft.com/2003/10/Serialization/",
										"unsignedByte")
										.equals(reader.getName())) {

							nillableValue = reader
									.getAttributeValue(
											"http://www.w3.org/2001/XMLSchema-instance",
											"nil");
							if (!"true".equals(nillableValue)
									&& !"1".equals(nillableValue)) {

								java.lang.String content = reader
										.getElementText();

								object.setUnsignedByte(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToUnsignedByte(content));

							} else {

								reader.getElementText(); // throw away text
															// nodes if any.
							}

						} // End of if for expected property start element

						else {
							// A start element we are not expecting indicates an
							// invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException(
									"Unexpected subelement " + reader.getName());
						}

					} else {
						reader.next();
					}
				} // end of while loop

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
