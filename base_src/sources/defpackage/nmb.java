package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.barhopper.Barcode;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class nmb {
    private static final DecimalFormat a = new DecimalFormat("#.###");
    private final LinkedBlockingDeque b = new LinkedBlockingDeque(80);

    private final String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            nmk.a.d(this, "Encode mail param failed, mail param: %s", str);
            return "";
        }
    }

    private static final nmf c(String str, ojc ojcVar) {
        ojc ojcVarA = ((nmg) ((ojj) ojcVar).a).a(str, 0.9f);
        return (ojcVarA.g() && ((nme) ojcVarA.c()).b == nlf.PHONE) ? ((nme) ojcVarA.c()).a : nmf.a(str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0139 A[Catch: all -> 0x03b5, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x001a, B:8:0x0022, B:12:0x002a, B:13:0x003c, B:14:0x003f, B:85:0x02b7, B:87:0x02bb, B:89:0x02e9, B:93:0x02f2, B:95:0x037c, B:97:0x0384, B:99:0x0389, B:101:0x0391, B:103:0x0399, B:105:0x03a1, B:106:0x03a7, B:88:0x02c7, B:15:0x0047, B:19:0x0051, B:20:0x0061, B:22:0x0067, B:24:0x00ea, B:25:0x0104, B:27:0x0129, B:29:0x0135, B:30:0x0139, B:32:0x0145, B:34:0x015b, B:35:0x0164, B:37:0x016e, B:39:0x0177, B:41:0x0183, B:44:0x0195, B:46:0x01a3, B:48:0x01b0, B:50:0x01ba, B:52:0x01c5, B:53:0x01ce, B:54:0x01d7, B:56:0x01e1, B:58:0x0219, B:60:0x0229, B:61:0x0231, B:63:0x0237, B:65:0x0241, B:67:0x0249, B:68:0x0258, B:69:0x025c, B:71:0x0262, B:72:0x0270, B:74:0x0275, B:75:0x027b, B:77:0x0280, B:78:0x028e, B:80:0x0296, B:81:0x029e, B:83:0x02a6, B:84:0x02ae), top: B:113:0x0007 }] */
    public final synchronized List a(Barcode[] barcodeArr, ojc ojcVar, ojc ojcVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        nlf nlfVar;
        nma nmaVarA;
        Barcode.Sms sms;
        Barcode.GeoPoint geoPoint;
        Object obj;
        barcodeArr.getClass();
        obr.aF(true);
        obr.aF(true);
        arrayList = new ArrayList();
        int length = barcodeArr.length;
        for (int i2 = 0; i2 < length; i2 = i + 1) {
            Barcode barcode = barcodeArr[i2];
            nmf nmfVarA = nmf.a(barcode.displayValue);
            Barcode.WiFi wiFi = null;
            switch (barcode.valueFormat) {
                case 1:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.CONTACT;
                    Barcode.ContactInfo contactInfo = barcode.contactInfo;
                    nlz nlzVarA = nma.a();
                    Barcode.PersonName personName = contactInfo.name;
                    if (personName != null) {
                        nlzVarA.a = ojc.i(personName.formattedName);
                    }
                    for (Barcode.Phone phone : contactInfo.phones) {
                        if (phone.number.length() > 0 && phone.number.length() < 60) {
                            nlzVarA.c().g(c(phone.number, ojcVar).a);
                        }
                    }
                    for (Barcode.Email email : contactInfo.emails) {
                        nlzVarA.b().g(email.address);
                    }
                    String[] strArr = contactInfo.urls;
                    if (strArr.length > 0) {
                        nlzVarA.e(strArr[0]);
                    }
                    Barcode.Address[] addressArr = contactInfo.addresses;
                    if (addressArr.length > 0) {
                        nlzVarA.d(TextUtils.join("\n", addressArr[0].addressLines));
                    }
                    if (!TextUtils.isEmpty(contactInfo.organization)) {
                        nlzVarA.c = ojc.i(contactInfo.organization);
                    }
                    if (!TextUtils.isEmpty(contactInfo.note)) {
                        nlzVarA.b = ojc.i(contactInfo.note);
                    }
                    nmaVarA = nlzVarA.a();
                    sms = null;
                    geoPoint = null;
                    obj = null;
                    break;
                case 2:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.EMAIL;
                    Barcode.Email email2 = barcode.email;
                    if (email2 != null) {
                        nmfVarA = nmf.a(String.format("?to=%s&subject=%s&body=%s", email2.address, b(oje.c(email2.subject)), b(oje.c(email2.body)))).c(barcode.displayValue);
                    }
                    nmaVarA = null;
                    sms = null;
                    geoPoint = null;
                    obj = null;
                    break;
                case 3:
                case 5:
                    arrayList2 = arrayList;
                    i = i2;
                    int i3 = barcode.format;
                    if ((i3 & 1632) != 0) {
                        nlfVar = nlf.PRODUCT_UPC;
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    } else if (i3 == 256) {
                        nlfVar = nlf.QR;
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    } else {
                        nlfVar = nlf.RAW_BARCODE;
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    }
                    break;
                case 4:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.PHONE;
                    if (barcode.displayValue.length() < 60) {
                        nmfVarA = c(barcode.displayValue, ojcVar);
                    }
                    nmaVarA = null;
                    sms = null;
                    geoPoint = null;
                    obj = null;
                    break;
                case 6:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.SMS;
                    String str = barcode.sms.phoneNumber;
                    if (str != null) {
                        nmfVarA = nmfVarA.b(str);
                        sms = barcode.sms;
                        nmaVarA = null;
                        geoPoint = null;
                    } else {
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                    }
                    obj = geoPoint;
                    break;
                case 7:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.QR_TEXT;
                    if (barcode.displayValue.toLowerCase(Locale.US).startsWith("fido:")) {
                        nlfVar = nlf.URL;
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    } else {
                        if (barcode.displayValue.length() < 512) {
                            String str2 = barcode.displayValue;
                        }
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    }
                    break;
                case 8:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.URL;
                    String string = nmi.a(barcode.displayValue).toString();
                    ojc ojcVarA = ((nmg) ((ojj) ojcVar2).a).a(string, 0.8f);
                    if (ojcVarA.g()) {
                        nme nmeVar = (nme) ojcVarA.c();
                        if (nmeVar.b == nlf.URL) {
                            nmfVarA = nmeVar.a;
                        } else {
                            nmfVarA = nmf.a(string);
                        }
                    } else {
                        nmfVarA = nmf.a(string);
                    }
                    nmaVarA = null;
                    sms = null;
                    geoPoint = null;
                    obj = null;
                    break;
                case 9:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.QR_WIFI;
                    Barcode.WiFi wiFi2 = barcode.wifi;
                    wiFi2.getClass();
                    nmfVarA = nmfVarA.b(wiFi2.ssid);
                    sms = null;
                    geoPoint = null;
                    obj = null;
                    wiFi = wiFi2;
                    nmaVarA = null;
                    break;
                case 10:
                    nlfVar = nlf.QR_GEO;
                    geoPoint = barcode.geoPoint;
                    if (geoPoint != null) {
                        arrayList2 = arrayList;
                        double d = geoPoint.lat;
                        i = i2;
                        double d2 = geoPoint.lng;
                        StringBuilder sb = new StringBuilder(51);
                        sb.append("(");
                        sb.append(d);
                        sb.append(",");
                        sb.append(d2);
                        sb.append(")");
                        String string2 = sb.toString();
                        DecimalFormat decimalFormat = a;
                        String str3 = decimalFormat.format(barcode.geoPoint.lat);
                        String str4 = decimalFormat.format(barcode.geoPoint.lng);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 6 + String.valueOf(str4).length());
                        sb2.append("(");
                        sb2.append(str3);
                        sb2.append("°, ");
                        sb2.append(str4);
                        sb2.append("°)");
                        nmfVarA = nmfVarA.b(string2).c(sb2.toString());
                        nmaVarA = null;
                        sms = null;
                        obj = null;
                    } else {
                        arrayList2 = arrayList;
                        i = i2;
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    }
                    break;
                case 11:
                    nlfVar = nlf.CALENDAR_ENTRY;
                    Barcode.CalendarEvent calendarEvent = barcode.calendarEvent;
                    obj = calendarEvent != null ? calendarEvent : null;
                    nmfVarA = nmfVarA.b(calendarEvent.summary);
                    arrayList2 = arrayList;
                    i = i2;
                    nmaVarA = null;
                    sms = null;
                    geoPoint = null;
                    break;
                default:
                    arrayList2 = arrayList;
                    i = i2;
                    nlfVar = nlf.QR;
                    if (barcode.format == 256) {
                        nmfVarA = nmfVarA.b("");
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    } else {
                        nmk nmkVar = nmk.a;
                        int i4 = barcode.valueFormat;
                        StringBuilder sb3 = new StringBuilder(62);
                        sb3.append("Unexpected Barcode valueFormat, %d, of non-QR type ");
                        sb3.append(i4);
                        nmkVar.d(this, sb3.toString(), new Object[0]);
                        nmaVarA = null;
                        sms = null;
                        geoPoint = null;
                        obj = null;
                    }
                    break;
            }
            obr.aG(barcode.cornerPoints.length == 4, "Barcode does not have expected four corner points.");
            oom oomVarM = oom.m(new nuq(barcode.cornerPoints[0].x, barcode.cornerPoints[0].y, barcode.cornerPoints[1].x, barcode.cornerPoints[1].y, barcode.cornerPoints[2].x, barcode.cornerPoints[2].y, barcode.cornerPoints[3].x, barcode.cornerPoints[3].y));
            nmc nmcVarB = nme.b();
            nmcVarB.h(nmfVarA);
            nmcVarB.i(nlfVar);
            nmcVarB.e();
            nmcVarB.g(nmd.BARHOPPER);
            nmcVarB.b = Float.valueOf(1.0f);
            nmcVarB.j(oomVarM);
            if (nlfVar != nlf.RAW_TEXT) {
                nmcVarB.c = ojc.i(barcode);
            }
            if (nmaVarA != null) {
                nmcVarB.f(nmaVarA);
            }
            if (wiFi != null) {
                nmcVarB.e = ojc.i(wiFi);
            }
            if (sms != null) {
                nmcVarB.f = ojc.i(sms);
            }
            if (geoPoint != null) {
                nmcVarB.h = ojc.i(geoPoint);
            }
            if (obj != null) {
                nmcVarB.g = ojc.i(obj);
            }
            arrayList = arrayList2;
            arrayList.add(nmcVarB.a());
        }
        while (!this.b.offerFirst(barcodeArr)) {
            this.b.removeLast();
        }
        return arrayList;
    }
}
