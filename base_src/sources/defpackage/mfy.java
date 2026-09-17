package defpackage;

import com.google.android.libraries.barhopper.Barcode;

/* JADX INFO: loaded from: classes2.dex */
public final class mfy {
    public static final oor a;
    public static final oor b;

    static {
        oon oonVar = new oon();
        oonVar.e(nlf.ADDRESS, mgm.MAP);
        oonVar.e(nlf.CALENDAR_ENTRY, mgm.CALENDAR);
        oonVar.e(nlf.CONTACT, mgm.CONTACT);
        oonVar.e(nlf.EMAIL, mgm.EMAIL);
        oonVar.e(nlf.PHONE, mgm.CALL);
        oonVar.e(nlf.PRODUCT_UPC, mgm.SHOPPING);
        oonVar.e(nlf.QR, mgm.SEARCH);
        oonVar.e(nlf.QR_TEXT, mgm.SEARCH);
        oonVar.e(nlf.RAW_BARCODE, mgm.SHOPPING);
        oonVar.e(nlf.TEXT_BLOCK, mgm.COPY);
        oonVar.e(nlf.URL, mgm.OPEN_URL);
        oonVar.e(nlf.FOREIGN_TEXT, mgm.TRANSLATE);
        oonVar.e(nlf.QR_WIFI, mgm.WIFI);
        oonVar.e(nlf.TEXT_WIFI, mgm.WIFI);
        oonVar.e(nlf.SMS, mgm.SMS);
        oonVar.e(nlf.DOCUMENT_SCANNING, mgm.DOCUMENT_SCANNING);
        oonVar.e(nlf.LABELED_PRODUCT, mgm.SHOPPING);
        oonVar.e(nlf.APPAREL, mgm.SHOPPING);
        oonVar.e(nlf.TEXT_SELECTION, mgm.TEXT_SELECTION);
        oonVar.e(nlf.QR_GEO, mgm.MAP);
        a = oonVar.c();
        b = oor.s(nmd.PHOTO_OCR, mga.PHOTO_OCR, nmd.BARHOPPER, mga.BARHOPPER, nmd.PHILEASSTORM, mga.PHILEASSTORM, nmd.NONE, mga.NONE);
        oor.s(mgx.PHOTO_OCR, mga.PHOTO_OCR, mgx.BARHOPPER, mga.BARHOPPER, mgx.PHILEASSTORM, mga.PHILEASSTORM, mgx.NONE, mga.NONE);
    }

    public static mig a(Barcode.CalendarDateTime calendarDateTime) {
        poy poyVarM = mig.h.m();
        boolean z = calendarDateTime.isUtc;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        mig migVar = (mig) poyVarM.b;
        migVar.g = z;
        migVar.a = calendarDateTime.year;
        migVar.b = calendarDateTime.month;
        migVar.c = calendarDateTime.day;
        migVar.d = calendarDateTime.hours;
        migVar.e = calendarDateTime.minutes;
        migVar.f = calendarDateTime.seconds;
        return (mig) poyVarM.j();
    }
}
