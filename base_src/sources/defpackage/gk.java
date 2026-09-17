package defpackage;

import android.view.ContentInfo;
import android.view.View;
import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public final class gk {
    public static fk a(View view, fk fkVar) {
        ContentInfo contentInfo = fkVar.a.a;
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfo ? fkVar : new fk(new fj(contentInfoPerformReceiveContent));
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static int c(atl atlVar, String str) throws ass {
        if (!atlVar.g().d()) {
            throw new ass("Language item must be used on array", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        for (int i = 1; i <= atlVar.a(); i++) {
            atl atlVarE = atlVar.e(i);
            if (atlVarE.t() && "xml:lang".equals(atlVarE.f(1).a) && str.equals(atlVarE.f(1).b)) {
                return i;
            }
        }
        return -1;
    }

    public static atl d(atl atlVar, String str, boolean z) throws ass {
        if (!atlVar.g().n() && !atlVar.g().o()) {
            if (!atlVar.f) {
                throw new ass("Named children only allowed for schemas and structs", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            if (atlVar.g().d()) {
                throw new ass("Named children not allowed for arrays", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            if (z) {
                atlVar.g().x(true);
            }
        }
        atl atlVarC = atlVar.c(str);
        if (atlVarC != null || !z) {
            return atlVarC;
        }
        atl atlVar2 = new atl(str, new atx());
        atlVar2.f = true;
        atlVar.k(atlVar2);
        return atlVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    public static atl e(atl atlVar, atr atrVar, boolean z, atx atxVar) {
        atl atlVar2;
        int iA;
        if (atrVar.a() == 0) {
            throw new ass("Empty XMPPath", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        atl atlVarF = f(atlVar, atrVar.b(0).a, z);
        atx atxVar2 = null;
        if (atlVarF == null) {
            return null;
        }
        if (atlVarF.f) {
            atlVarF.f = false;
            atlVar2 = atlVarF;
        } else {
            atlVar2 = null;
        }
        ?? r8 = 1;
        int i = 1;
        while (i < atrVar.a()) {
            try {
                ats atsVarB = atrVar.b(i);
                int i2 = atsVarB.b;
                if (i2 == r8) {
                    atlVarF = d(atlVarF, atsVarB.a, z);
                } else if (i2 == 2) {
                    String strSubstring = atsVarB.a.substring(r8);
                    atl atlVarD = atlVarF.d(strSubstring);
                    if (atlVarD == null && z) {
                        atl atlVar3 = new atl(strSubstring, atxVar2);
                        atlVar3.f = r8;
                        atlVarF.m(atlVar3);
                        atlVarF = atlVar3;
                    } else {
                        atlVarF = atlVarD;
                    }
                } else {
                    if (!atlVarF.g().d()) {
                        throw new ass("Indexing applied to non-array", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                    }
                    if (i2 == 3) {
                        String str = atsVarB.a;
                        try {
                            iA = Integer.parseInt(str.substring(r8, str.length() - 1));
                            if (iA <= 0) {
                                throw new ass("Array index must be larger than zero", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                            }
                            if (z && iA == atlVarF.a() + r8) {
                                atl atlVar4 = new atl("[]", atxVar2);
                                atlVar4.f = r8;
                                atlVarF.k(atlVar4);
                            }
                        } catch (NumberFormatException e) {
                            throw new ass("Array index not digits.", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                        }
                    } else if (i2 == 4) {
                        iA = atlVarF.a();
                    } else if (i2 == 6) {
                        String[] strArrG = atb.g(atsVarB.a);
                        String str2 = strArrG[0];
                        String str3 = strArrG[r8];
                        int i3 = -1;
                        for (int i4 = 1; i4 <= atlVarF.a() && i3 < 0; i4++) {
                            atl atlVarE = atlVarF.e(i4);
                            if (!atlVarE.g().o()) {
                                throw new ass("Field selector must be used on array of struct", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                            }
                            for (int i5 = 1; i5 <= atlVarE.a(); i5++) {
                                atl atlVarE2 = atlVarE.e(i5);
                                if (str2.equals(atlVarE2.a) && str3.equals(atlVarE2.b)) {
                                    i3 = i4;
                                    break;
                                }
                            }
                        }
                        iA = i3;
                    } else {
                        if (i2 != 5) {
                            throw new ass("Unknown array indexing step in FollowXPathStep", 9);
                        }
                        String[] strArrG2 = atb.g(atsVarB.a);
                        String str4 = strArrG2[0];
                        String str5 = strArrG2[1];
                        int i6 = atsVarB.d;
                        if (!"xml:lang".equals(str4)) {
                            iA = 1;
                            while (true) {
                                if (iA >= atlVarF.a()) {
                                    iA = -1;
                                    break;
                                }
                                Iterator itI = atlVarF.e(iA).i();
                                while (itI.hasNext()) {
                                    atl atlVar5 = (atl) itI.next();
                                    if (str4.equals(atlVar5.a) && str5.equals(atlVar5.b)) {
                                        break;
                                    }
                                }
                                iA++;
                            }
                        } else {
                            int iC = c(atlVarF, atb.a(str5));
                            if (iC >= 0 || (i6 & 4096) <= 0) {
                                iA = iC;
                            } else {
                                atl atlVar6 = new atl("[]", null);
                                atlVar6.m(new atl("xml:lang", "x-default", null));
                                atlVarF.l(1, atlVar6);
                                iA = 1;
                            }
                        }
                    }
                    atlVarF = (iA <= 0 || iA > atlVarF.a()) ? null : atlVarF.e(iA);
                }
                if (atlVarF == null) {
                    if (!z) {
                        return null;
                    }
                    j(atlVar2);
                    return null;
                }
                atxVar2 = null;
                if (atlVarF.f) {
                    atlVarF.f = false;
                    if (i != 1) {
                        if (i < atrVar.a() - 1 && atrVar.b(i).b == 1 && !atlVarF.g().l()) {
                            atlVarF.g().x(true);
                        }
                    } else if (!atrVar.b(1).c || atrVar.b(1).d == 0) {
                        i = 1;
                        if (i < atrVar.a() - 1) {
                            atlVarF.g().x(true);
                        }
                    } else {
                        atlVarF.g().f(atrVar.b(1).d, true);
                        i = 1;
                    }
                    if (atlVar2 == null) {
                        atlVar2 = atlVarF;
                    }
                }
                r8 = 1;
                i++;
            } catch (ass e2) {
                if (atlVar2 != null) {
                    j(atlVar2);
                }
                throw e2;
            }
        }
        if (atlVar2 != null) {
            atlVarF.g().b(atxVar);
            atlVarF.e = atlVarF.g();
        }
        return atlVarF;
    }

    public static atl f(atl atlVar, String str, boolean z) {
        return g(atlVar, str, null, z);
    }

    public static atl g(atl atlVar, String str, String str2, boolean z) throws ass {
        atl atlVarC = atlVar.c(str);
        if (atlVarC == null && z) {
            atx atxVar = new atx();
            atxVar.f(Integer.MIN_VALUE, true);
            atlVarC = new atl(str, atxVar);
            atlVarC.f = true;
            String strA = asv.a.a(str);
            if (strA == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new ass("Unregistered schema namespace URI", R.styleable.AppCompatTheme_switchStyle);
                }
                strA = asv.a.c(str, str2);
            }
            atlVarC.b = strA;
            atlVar.k(atlVarC);
        }
        return atlVarC;
    }

    public static atx h(atx atxVar, Object obj) {
        if (atxVar == null) {
            atxVar = new atx();
        }
        if (atxVar.i()) {
            atxVar.s();
        }
        if (atxVar.j()) {
            atxVar.t();
        }
        if (atxVar.k()) {
            atxVar.q();
        }
        if (atxVar.l() && obj != null && obj.toString().length() > 0) {
            throw new ass("Structs and arrays can't have values", R.styleable.AppCompatTheme_textAppearanceListItem);
        }
        atxVar.e(atxVar.a);
        return atxVar;
    }

    public static void i(atl atlVar, String str, String str2) {
        atl atlVar2 = new atl("[]", str2, null);
        atl atlVar3 = new atl("xml:lang", str, null);
        atlVar2.m(atlVar3);
        if ("x-default".equals(atlVar3.b)) {
            atlVar.l(1, atlVar2);
        } else {
            atlVar.k(atlVar2);
        }
    }

    public static void j(atl atlVar) {
        atl atlVar2 = atlVar.c;
        if (atlVar.g().m()) {
            atlVar2.q(atlVar);
        } else {
            atlVar2.o(atlVar);
        }
        if (atlVar2.s() || !atlVar2.g().n()) {
            return;
        }
        atlVar2.c.o(atlVar2);
    }

    public static void k(atl atlVar) {
        if (atlVar.g().i()) {
            for (int i = 2; i <= atlVar.a(); i++) {
                atl atlVarE = atlVar.e(i);
                if (atlVarE.t() && "x-default".equals(atlVarE.f(1).b)) {
                    try {
                        atlVar.j().remove(i - 1);
                        atlVar.n();
                        atlVar.l(1, atlVarE);
                    } catch (ass e) {
                    }
                    if (i == 2) {
                        atlVar.e(2).b = atlVarE.b;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void l(ati atiVar, atl atlVar, Node node, boolean z) throws ass {
        int iN = n(node);
        if (iN != 8 && iN != 0) {
            throw new ass("Node element must be rdf:Description or typed node", 202);
        }
        if (z && iN == 0) {
            throw new ass("Top level typed node not allowed", 203);
        }
        char c = 0;
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                int iN2 = n(nodeItem);
                switch (iN2) {
                    case 0:
                        o(atiVar, atlVar, nodeItem, nodeItem.getNodeValue(), z);
                        break;
                    case 1:
                    case 4:
                    case 5:
                    default:
                        throw new ass("Invalid nodeElement attribute", 202);
                    case 2:
                    case 3:
                    case 6:
                        if (c > 0) {
                            throw new ass("Mutally exclusive about, ID, nodeID attributes", 202);
                        }
                        if (z && iN2 == 3) {
                            String str = atlVar.a;
                            if (str != null && str.length() > 0) {
                                if (!atlVar.a.equals(nodeItem.getNodeValue())) {
                                    throw new ass("Mismatched top level rdf:about values", 203);
                                }
                                c = 1;
                            } else {
                                atlVar.a = nodeItem.getNodeValue();
                                c = 1;
                            }
                        } else {
                            c = 1;
                        }
                        break;
                        break;
                }
            }
        }
        s(atiVar, atlVar, node, z);
    }

    public static boolean m(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static int n(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return "bagID".equals(localName) ? 12 : 0;
    }

    private static atl o(ati atiVar, atl atlVar, Node node, String str, boolean z) throws ass {
        ato atoVar = asv.a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null) {
            throw new ass("XML namespace required for all elements and attributes", 202);
        }
        if (true == "http://purl.org/dc/1.1/".equals(namespaceURI)) {
            namespaceURI = "http://purl.org/dc/elements/1.1/";
        }
        String strA = atoVar.a(namespaceURI);
        if (strA == null) {
            strA = atoVar.c(namespaceURI, node.getPrefix() != null ? node.getPrefix() : "_dflt");
        }
        String strValueOf = String.valueOf(strA);
        String strValueOf2 = String.valueOf(node.getLocalName());
        String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        atx atxVar = new atx();
        boolean z2 = false;
        if (z) {
            atlVar = g(atiVar.a, namespaceURI, "_dflt", true);
            atlVar.f = false;
            if (atoVar.e(strConcat) != null) {
                atiVar.a.g = true;
                atlVar.g = true;
                z2 = true;
            }
        }
        boolean zEquals = "rdf:li".equals(strConcat);
        boolean zEquals2 = "rdf:value".equals(strConcat);
        atl atlVar2 = new atl(strConcat, str, atxVar);
        atlVar2.h = z2;
        if (zEquals2) {
            atlVar.l(1, atlVar2);
            if (z || !atlVar.g().o()) {
                throw new ass("Misplaced rdf:value element", 202);
            }
            atlVar.i = true;
        } else {
            atlVar.k(atlVar2);
        }
        if (zEquals) {
            if (!atlVar.g().d()) {
                throw new ass("Misplaced rdf:li element", 202);
            }
            atlVar2.a = "[]";
        }
        return atlVar2;
    }

    private static void p(atl atlVar) throws ass {
        atl atlVarE = atlVar.e(1);
        if (atlVarE.g().c()) {
            if (atlVar.g().c()) {
                throw new ass("Redundant xml:lang for rdf:value element", 203);
            }
            atl atlVarF = atlVarE.f(1);
            atlVarE.q(atlVarF);
            atlVar.m(atlVarF);
        }
        for (int i = 1; i <= atlVarE.b(); i++) {
            atlVar.m(atlVarE.f(i));
        }
        for (int i2 = 2; i2 <= atlVar.a(); i2++) {
            atlVar.m(atlVar.e(i2));
        }
        atlVar.i = false;
        atlVar.g().x(false);
        atlVar.g().b(atlVarE.g());
        atlVar.b = atlVarE.b;
        atlVar.p();
        Iterator itH = atlVarE.h();
        while (itH.hasNext()) {
            atlVar.k((atl) itH.next());
        }
    }

    private static void q(ati atiVar, atl atlVar, Node node, boolean z) throws ass {
        if (node.hasChildNodes()) {
            throw new ass("Nested content not allowed with rdf:resource or property attributes", 202);
        }
        Node node2 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = true;
            if (i >= node.getAttributes().getLength()) {
                atl atlVarO = o(atiVar, atlVar, node, "", z);
                if (z2 || z3) {
                    atlVarO.b = node2 != null ? node2.getNodeValue() : "";
                    if (z2) {
                        z6 = false;
                    } else {
                        atlVarO.g().f(2, true);
                        z6 = false;
                    }
                } else if (z5) {
                    atlVarO.g().x(true);
                } else {
                    z6 = false;
                }
                for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
                    Node nodeItem = node.getAttributes().item(i2);
                    if (nodeItem != node2 && !"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                        switch (n(nodeItem)) {
                            case 0:
                                if (!z6) {
                                    t(atlVarO, nodeItem.getNodeName(), nodeItem.getNodeValue());
                                } else if ("xml:lang".equals(nodeItem.getNodeName())) {
                                    t(atlVarO, "xml:lang", nodeItem.getNodeValue());
                                } else {
                                    o(atiVar, atlVarO, nodeItem, nodeItem.getNodeValue(), false);
                                }
                                break;
                            case 1:
                            case 3:
                            case 4:
                            default:
                                throw new ass("Unrecognized attribute of empty property element", 202);
                            case 2:
                            case 6:
                                break;
                            case 5:
                                t(atlVarO, "rdf:resource", nodeItem.getNodeValue());
                                break;
                        }
                    }
                }
                return;
            }
            Node nodeItem2 = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem2.getPrefix()) && (nodeItem2.getPrefix() != null || !"xmlns".equals(nodeItem2.getNodeName()))) {
                switch (n(nodeItem2)) {
                    case 0:
                        if ("value".equals(nodeItem2.getLocalName()) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem2.getNamespaceURI())) {
                            if (z3) {
                                throw new ass("Empty property element can't have both rdf:value and rdf:resource", 203);
                            }
                            node2 = nodeItem2;
                            z2 = true;
                        } else if (!"xml:lang".equals(nodeItem2.getNodeName())) {
                            z5 = true;
                        }
                        break;
                    case 1:
                    case 3:
                    case 4:
                    default:
                        throw new ass("Unrecognized attribute of empty property element", 202);
                    case 2:
                        break;
                    case 5:
                        if (z4) {
                            throw new ass("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        if (z2) {
                            throw new ass("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                        node2 = nodeItem2;
                        z2 = false;
                        z3 = true;
                        break;
                        break;
                    case 6:
                        if (z3) {
                            throw new ass("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        z4 = true;
                        break;
                        break;
                }
            }
            i++;
        }
    }

    private static void r(ati atiVar, atl atlVar, Node node, boolean z) throws ass {
        atl atlVarO = o(atiVar, atlVar, node, null, z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                String namespaceURI = nodeItem.getNamespaceURI();
                String localName = nodeItem.getLocalName();
                if ("xml:lang".equals(nodeItem.getNodeName())) {
                    t(atlVarO, "xml:lang", nodeItem.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new ass("Invalid attribute for literal property element", 202);
                }
            }
        }
        String strConcat = "";
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node nodeItem2 = node.getChildNodes().item(i2);
            if (nodeItem2.getNodeType() != 3) {
                throw new ass("Invalid child of literal property element", 202);
            }
            String strValueOf = String.valueOf(strConcat);
            String strValueOf2 = String.valueOf(nodeItem2.getNodeValue());
            strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        atlVarO.b = strConcat;
    }

    private static void s(ati atiVar, atl atlVar, Node node, boolean z) throws ass {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (!m(nodeItem)) {
                if (nodeItem.getNodeType() != 1) {
                    throw new ass("Expected property element node not found", 202);
                }
                int iN = n(nodeItem);
                if (iN == 8 || iN >= 10 || (iN > 0 && iN <= 7)) {
                    throw new ass("Invalid property element name", 202);
                }
                NamedNodeMap attributes = nodeItem.getAttributes();
                ArrayList arrayList = null;
                for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                    Node nodeItem2 = attributes.item(i2);
                    if ("xmlns".equals(nodeItem2.getPrefix()) || (nodeItem2.getPrefix() == null && "xmlns".equals(nodeItem2.getNodeName()))) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(nodeItem2.getNodeName());
                    }
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        attributes.removeNamedItem((String) arrayList.get(i3));
                    }
                }
                if (attributes.getLength() <= 3) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= attributes.getLength()) {
                            if (!nodeItem.hasChildNodes()) {
                                q(atiVar, atlVar, nodeItem, z);
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= nodeItem.getChildNodes().getLength()) {
                                    r(atiVar, atlVar, nodeItem, z);
                                    break;
                                }
                                if (nodeItem.getChildNodes().item(i5).getNodeType() != 3) {
                                    if (z && "iX:changes".equals(nodeItem.getNodeName())) {
                                        break;
                                    }
                                    atl atlVarO = o(atiVar, atlVar, nodeItem, "", z);
                                    for (int i6 = 0; i6 < nodeItem.getAttributes().getLength(); i6++) {
                                        Node nodeItem3 = nodeItem.getAttributes().item(i6);
                                        if (!"xmlns".equals(nodeItem3.getPrefix()) && (nodeItem3.getPrefix() != null || !"xmlns".equals(nodeItem3.getNodeName()))) {
                                            String localName = nodeItem3.getLocalName();
                                            String namespaceURI = nodeItem3.getNamespaceURI();
                                            if ("xml:lang".equals(nodeItem3.getNodeName())) {
                                                t(atlVarO, "xml:lang", nodeItem3.getNodeValue());
                                            } else if (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                                                throw new ass("Invalid attribute for resource property element", 202);
                                            }
                                        }
                                    }
                                    boolean z2 = false;
                                    for (int i7 = 0; i7 < nodeItem.getChildNodes().getLength(); i7++) {
                                        Node nodeItem4 = nodeItem.getChildNodes().item(i7);
                                        if (!m(nodeItem4)) {
                                            if (nodeItem4.getNodeType() == 1) {
                                                if (!z2) {
                                                    boolean zEquals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem4.getNamespaceURI());
                                                    String localName2 = nodeItem4.getLocalName();
                                                    if (zEquals && "Bag".equals(localName2)) {
                                                        atlVarO.g().q();
                                                    } else if (zEquals && "Seq".equals(localName2)) {
                                                        atx atxVarG = atlVarO.g();
                                                        atxVarG.q();
                                                        atxVarG.t();
                                                    } else if (zEquals && "Alt".equals(localName2)) {
                                                        atx atxVarG2 = atlVarO.g();
                                                        atxVarG2.q();
                                                        atxVarG2.t();
                                                        atxVarG2.s();
                                                    } else {
                                                        atlVarO.g().x(true);
                                                        if (!zEquals && !"Description".equals(localName2)) {
                                                            String namespaceURI2 = nodeItem4.getNamespaceURI();
                                                            if (namespaceURI2 == null) {
                                                                throw new ass("All XML elements must be in a namespace", 203);
                                                            }
                                                            StringBuilder sb = new StringBuilder(namespaceURI2.length() + 1 + String.valueOf(localName2).length());
                                                            sb.append(namespaceURI2);
                                                            sb.append(':');
                                                            sb.append(localName2);
                                                            t(atlVarO, "rdf:type", sb.toString());
                                                        }
                                                    }
                                                    l(atiVar, atlVarO, nodeItem4, false);
                                                    if (atlVarO.i) {
                                                        p(atlVarO);
                                                        z2 = true;
                                                    } else {
                                                        if (atlVarO.g().j() && atlVarO.g().j() && atlVarO.s()) {
                                                            Iterator itH = atlVarO.h();
                                                            while (itH.hasNext()) {
                                                                if (((atl) itH.next()).g().c()) {
                                                                    atlVarO.g().r();
                                                                    k(atlVarO);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                }
                                            } else if (!z2) {
                                                throw new ass("Children of resource property element must be XML elements", 202);
                                            }
                                            throw new ass("Invalid child of resource property element", 202);
                                        }
                                    }
                                    if (!z2) {
                                        throw new ass("Missing child of resource property element", 202);
                                    }
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            Node nodeItem5 = attributes.item(i4);
                            String localName3 = nodeItem5.getLocalName();
                            String namespaceURI3 = nodeItem5.getNamespaceURI();
                            String nodeValue = nodeItem5.getNodeValue();
                            if (!"xml:lang".equals(nodeItem5.getNodeName()) || ("ID".equals(localName3) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3))) {
                                if ("datatype".equals(localName3) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3)) {
                                    r(atiVar, atlVar, nodeItem, z);
                                    break;
                                }
                                if (!"parseType".equals(localName3) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3)) {
                                    q(atiVar, atlVar, nodeItem, z);
                                    break;
                                }
                                if ("Literal".equals(nodeValue)) {
                                    throw new ass("ParseTypeLiteral property element not allowed", 203);
                                }
                                if (!"Resource".equals(nodeValue)) {
                                    if (!"Collection".equals(nodeValue)) {
                                        throw new ass("ParseTypeOther property element not allowed", 203);
                                    }
                                    throw new ass("ParseTypeCollection property element not allowed", 203);
                                }
                                atl atlVarO2 = o(atiVar, atlVar, nodeItem, "", z);
                                atlVarO2.g().x(true);
                                for (int i8 = 0; i8 < nodeItem.getAttributes().getLength(); i8++) {
                                    Node nodeItem6 = nodeItem.getAttributes().item(i8);
                                    if (!"xmlns".equals(nodeItem6.getPrefix()) && (nodeItem6.getPrefix() != null || !"xmlns".equals(nodeItem6.getNodeName()))) {
                                        String localName4 = nodeItem6.getLocalName();
                                        String namespaceURI4 = nodeItem6.getNamespaceURI();
                                        if ("xml:lang".equals(nodeItem6.getNodeName())) {
                                            t(atlVarO2, "xml:lang", nodeItem6.getNodeValue());
                                        } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI4) || (!"ID".equals(localName4) && !"parseType".equals(localName4))) {
                                            throw new ass("Invalid attribute for ParseTypeResource property element", 202);
                                        }
                                    }
                                }
                                s(atiVar, atlVarO2, nodeItem, false);
                                if (!atlVarO2.i) {
                                    break;
                                }
                                p(atlVarO2);
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    q(atiVar, atlVar, nodeItem, z);
                }
            }
        }
    }

    private static void t(atl atlVar, String str, String str2) throws ass {
        if ("xml:lang".equals(str)) {
            str2 = atb.a(str2);
        }
        atlVar.m(new atl(str, str2, null));
    }
}
