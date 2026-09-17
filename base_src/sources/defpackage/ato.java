package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ato {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Pattern d = Pattern.compile("[/*?\\[\\]]");

    public ato() {
        try {
            c("http://www.w3.org/XML/1998/namespace", "xml");
            c("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
            c("http://purl.org/dc/elements/1.1/", "dc");
            c("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
            c("adobe:ns:meta/", "x");
            c("http://ns.adobe.com/iX/1.0/", "iX");
            c("http://ns.adobe.com/xap/1.0/", "xmp");
            c("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
            c("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
            c("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
            c("http://ns.adobe.com/xmp/note/", "xmpNote");
            c("http://ns.adobe.com/pdf/1.3/", "pdf");
            c("http://ns.adobe.com/pdfx/1.3/", "pdfx");
            c("http://www.npes.org/pdfx/ns/id/", "pdfxid");
            c("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
            c("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
            c("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
            c("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
            c("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
            c("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
            c("http://ns.adobe.com/photoshop/1.0/", "photoshop");
            c("http://ns.adobe.com/album/1.0/", "album");
            c("http://ns.adobe.com/exif/1.0/", "exif");
            c("http://ns.adobe.com/exif/1.0/aux/", "aux");
            c("http://ns.adobe.com/tiff/1.0/", "tiff");
            c("http://ns.adobe.com/png/1.0/", "png");
            c("http://ns.adobe.com/jpeg/1.0/", "jpeg");
            c("http://ns.adobe.com/jp2k/1.0/", "jp2k");
            c("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
            c("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
            c("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
            c("http://ns.adobe.com/asf/1.0/", "asf");
            c("http://ns.adobe.com/xmp/wav/1.0/", "wav");
            c("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
            c("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
            c("http://ns.adobe.com/xap/1.0/t/", "xmpT");
            c("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
            c("http://ns.adobe.com/xap/1.0/g/", "xmpG");
            c("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
            c("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
            c("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
            c("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
            c("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
            c("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
            c("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
            c("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
            c("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
            att attVar = new att();
            attVar.f(1536, true);
            att attVar2 = new att();
            attVar2.f(7680, true);
            d("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", attVar);
            d("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
            d("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
            d("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
            d("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            d("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
            d("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
            d("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            d("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", attVar);
            d("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
            d("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            d("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            d("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            d("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", attVar2);
            d("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", attVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", attVar);
            d("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", attVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", attVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            d("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
            d("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", attVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
            d("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", attVar);
            d("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            d("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            d("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
            d("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            d("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", attVar);
            d("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", attVar2);
            d("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            d("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", attVar2);
            d("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            d("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            d("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", attVar2);
        } catch (ass e) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    public final synchronized String a(String str) {
        return (String) this.a.get(str);
    }

    public final synchronized String b(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = str.concat(":");
            }
        }
        return (String) this.b.get(str);
    }

    public final synchronized String c(String str, String str2) {
        gj.f(str);
        if (str2 == null || str2.length() == 0) {
            throw new ass("Empty prefix", 4);
        }
        int i = 1;
        if (str2.charAt(str2.length() - 1) != ':') {
            StringBuilder sb = new StringBuilder(str2.length() + 1);
            sb.append(str2);
            sb.append(':');
            str2 = sb.toString();
        }
        if (!atb.f(str2.substring(0, str2.length() - 1))) {
            throw new ass("The prefix is a bad XML name", 201);
        }
        String str3 = (String) this.a.get(str);
        String str4 = (String) this.b.get(str2);
        if (str3 != null) {
            return str3;
        }
        if (str4 != null) {
            String string = str2;
            while (this.b.containsKey(string)) {
                String strSubstring = str2.substring(0, str2.length() - 1);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 14);
                sb2.append(strSubstring);
                sb2.append("_");
                sb2.append(i);
                sb2.append("_:");
                string = sb2.toString();
                i++;
            }
            str2 = string;
        }
        this.b.put(str2, str);
        this.a.put(str, str2);
        return str2;
    }

    final synchronized void d(String str, String str2, String str3, String str4, att attVar) {
        gj.f(str);
        gj.e(str2);
        gj.f(str3);
        gj.e(str4);
        att attVar2 = attVar != null ? new att(gk.h(attVar.b(), null).a) : new att();
        if (this.d.matcher(str2).find() || this.d.matcher(str4).find()) {
            throw new ass("Alias and actual property names must be simple", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        String strA = a(str);
        String strA2 = a(str3);
        if (strA == null) {
            throw new ass("Alias namespace is not registered", R.styleable.AppCompatTheme_switchStyle);
        }
        if (strA2 == null) {
            throw new ass("Actual namespace is not registered", R.styleable.AppCompatTheme_switchStyle);
        }
        String strConcat = str2.length() != 0 ? strA.concat(str2) : new String(strA);
        if (this.c.containsKey(strConcat)) {
            throw new ass("Alias is already existing", 4);
        }
        if (this.c.containsKey(str4.length() != 0 ? strA2.concat(str4) : new String(strA2))) {
            throw new ass("Actual property is already an alias, use the base property", 4);
        }
        this.c.put(strConcat, new atn(str3, strA2, str4, attVar2));
    }

    public final synchronized atn e(String str) {
        return (atn) this.c.get(str);
    }
}
