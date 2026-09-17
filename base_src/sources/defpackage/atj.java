package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public final class atj {
    private static final Object a = new Object();
    private static final DocumentBuilderFactory b;

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setIgnoringComments(true);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
        }
        b = documentBuilderFactoryNewInstance;
    }

    public static ast a(Object obj) throws ass {
        Document documentB;
        gj.d(obj);
        atw atwVar = new atw();
        if (obj instanceof InputStream) {
            InputStream inputStream = (InputStream) obj;
            if (atwVar.b() || atwVar.c()) {
                try {
                    documentB = c(new asx(inputStream), atwVar);
                } catch (IOException e) {
                    throw new ass("Error reading the XML-file", 204, e);
                }
            } else {
                documentB = b(new InputSource(inputStream));
            }
        } else if (obj instanceof byte[]) {
            documentB = c(new asx((byte[]) obj), atwVar);
        } else {
            String str = (String) obj;
            try {
                documentB = b(new InputSource(new StringReader(str)));
            } catch (ass e2) {
                if (e2.a != 201 || !atwVar.c()) {
                    throw e2;
                }
                documentB = b(new InputSource(new asz(new StringReader(str))));
            }
        }
        Object[] objArrD = d(documentB, atwVar.h(1), new Object[3]);
        if (objArrD == null || objArrD[1] != a) {
            return new ati();
        }
        Node node = (Node) objArrD[0];
        ati atiVar = new ati();
        if (!node.hasAttributes()) {
            throw new ass("Invalid attributes of rdf:RDF element", 202);
        }
        atl atlVar = atiVar.a;
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (!gk.m(nodeItem)) {
                gk.l(atiVar, atlVar, nodeItem, true);
            }
        }
        if (!atwVar.h(32)) {
            atm.a(atiVar, atwVar);
        }
        return atiVar;
    }

    private static Document b(InputSource inputSource) throws ass {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = b.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder.parse(inputSource);
        } catch (IOException e) {
            throw new ass("Error reading the XML-file", 204, e);
        } catch (ParserConfigurationException e2) {
            throw new ass("XML Parser not correctly configured", 0, e2);
        } catch (SAXException e3) {
            throw new ass("XML parsing failure", 201, e3);
        }
    }

    private static Document c(asx asxVar, atw atwVar) throws ass {
        try {
            return b(new InputSource(asxVar.a()));
        } catch (ass e) {
            int i = e.a;
            if (i != 201 && i != 204) {
                throw e;
            }
            if (atwVar.b() && "UTF-8".equals(asxVar.b())) {
                byte[] bArr = new byte[8];
                asx asxVar2 = new asx((asxVar.b * 4) / 3);
                int i2 = 0;
                char c = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = asxVar.b;
                    if (i2 >= i5) {
                        if (c == 11) {
                            for (int i6 = 0; i6 < i4; i6++) {
                                asxVar2.c(gj.g(bArr[i6]));
                            }
                        }
                        asxVar = asxVar2;
                    } else {
                        if (i2 >= i5) {
                            throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                        }
                        int i7 = asxVar.a[i2] & 255;
                        switch (c) {
                            case 11:
                                if (i3 <= 0 || (i7 & 192) != 128) {
                                    asxVar2.c(gj.g(bArr[0]));
                                    i2 -= i4;
                                    c = 0;
                                    i4 = 0;
                                } else {
                                    int i8 = i4 + 1;
                                    bArr[i4] = (byte) i7;
                                    i3--;
                                    if (i3 == 0) {
                                        asxVar2.e(bArr, i8);
                                        c = 0;
                                        i4 = 0;
                                    } else {
                                        i4 = i8;
                                    }
                                }
                                break;
                            default:
                                if (i7 < 127) {
                                    asxVar2.d(asxVar2.b + 1);
                                    byte[] bArr2 = asxVar2.a;
                                    int i9 = asxVar2.b;
                                    asxVar2.b = i9 + 1;
                                    bArr2[i9] = (byte) i7;
                                } else if (i7 >= 192) {
                                    i3 = -1;
                                    for (int i10 = i7; i3 < 8 && (i10 & 128) == 128; i10 += i10) {
                                        i3++;
                                    }
                                    bArr[i4] = (byte) i7;
                                    i4++;
                                    c = 11;
                                } else {
                                    asxVar2.c(gj.g((byte) i7));
                                }
                                break;
                        }
                        i2++;
                    }
                }
            }
            if (!atwVar.c()) {
                return b(new InputSource(asxVar.a()));
            }
            try {
                return b(new InputSource(new asz(new InputStreamReader(asxVar.a(), asxVar.b()))));
            } catch (UnsupportedEncodingException e2) {
                throw new ass("Unsupported Encoding", 9, e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    private static Object[] d(Node node, boolean z, Object[] objArr) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 7) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) nodeItem;
                if (processingInstruction.getTarget() == "xpacket") {
                    objArr[2] = processingInstruction.getData();
                } else if (nodeItem.getNodeType() != 3 && nodeItem.getNodeType() != 7) {
                    String namespaceURI = nodeItem.getNamespaceURI();
                    String localName = nodeItem.getLocalName();
                    if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                        return d(nodeItem, false, objArr);
                    }
                    if (!z && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        objArr[0] = nodeItem;
                        objArr[1] = a;
                        return objArr;
                    }
                    Object[] objArrD = d(nodeItem, z, objArr);
                    if (objArrD != null) {
                        return objArrD;
                    }
                }
            } else if (nodeItem.getNodeType() != 3) {
                continue;
            }
        }
        return null;
    }
}
