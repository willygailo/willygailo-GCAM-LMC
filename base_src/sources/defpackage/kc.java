package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class kc extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public kc(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    private final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        kb kbVar = new kb(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            switch (eventType) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            TypedArray typedArrayObtainStyledAttributes = kbVar.F.e.obtainStyledAttributes(attributeSet, jq.o);
                            kbVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                            kbVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                            kbVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                            kbVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                            kbVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                            kbVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                            typedArrayObtainStyledAttributes.recycle();
                            continue;
                        } else if (name2.equals("item")) {
                            rn rnVarK = rn.k(kbVar.F.e, attributeSet, jq.p);
                            kbVar.i = rnVarK.f(2, 0);
                            kbVar.j = (rnVarK.c(5, kbVar.c) & (-65536)) | ((char) rnVarK.c(6, kbVar.d));
                            kbVar.k = rnVarK.l(7);
                            kbVar.l = rnVarK.l(8);
                            kbVar.m = rnVarK.f(0, 0);
                            kbVar.n = kb.e(rnVarK.m(9));
                            kbVar.o = rnVarK.c(16, 4096);
                            kbVar.p = kb.e(rnVarK.m(10));
                            kbVar.q = rnVarK.c(20, 4096);
                            if (rnVarK.p(11)) {
                                kbVar.r = rnVarK.o(11, false) ? 1 : 0;
                            } else {
                                kbVar.r = kbVar.e;
                            }
                            kbVar.s = rnVarK.o(3, false);
                            kbVar.t = rnVarK.o(4, kbVar.f);
                            kbVar.u = rnVarK.o(1, kbVar.g);
                            kbVar.v = rnVarK.c(21, -1);
                            kbVar.z = rnVarK.m(12);
                            kbVar.w = rnVarK.f(13, 0);
                            kbVar.x = rnVarK.m(15);
                            kbVar.y = rnVarK.m(14);
                            String str2 = kbVar.y;
                            if (str2 == null) {
                                kbVar.A = null;
                            } else if (kbVar.w == 0 && kbVar.x == null) {
                                kbVar.A = (fh) kbVar.b(str2, b, kbVar.F.d);
                            } else {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                kbVar.A = null;
                            }
                            kbVar.B = rnVarK.l(17);
                            kbVar.C = rnVarK.l(22);
                            if (rnVarK.p(19)) {
                                kbVar.E = oj.a(rnVarK.c(19, -1), kbVar.E);
                            } else {
                                kbVar.E = null;
                            }
                            if (rnVarK.p(18)) {
                                kbVar.D = rnVarK.g(18);
                            } else {
                                kbVar.D = null;
                            }
                            rnVarK.n();
                            kbVar.h = false;
                        } else if (name2.equals("menu")) {
                            b(xmlPullParser, attributeSet, kbVar.a());
                        } else {
                            str = name2;
                            z2 = true;
                        }
                    }
                    eventType = xmlPullParser.next();
                    break;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (z2 && name3.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name3.equals("group")) {
                        kbVar.c();
                    } else if (name3.equals("item")) {
                        if (!kbVar.h) {
                            fh fhVar = kbVar.A;
                            if (fhVar == null || !fhVar.d()) {
                                kbVar.h = true;
                                kbVar.d(kbVar.a.add(kbVar.b, kbVar.i, kbVar.j, kbVar.k));
                            } else {
                                kbVar.a();
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    eventType = xmlPullParser.next();
                    break;
                default:
                    continue;
                    eventType = xmlPullParser.next();
                    break;
            }
            eventType = xmlPullParser.next();
        }
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) throws Throwable {
        if (!(menu instanceof er)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser layout = this.e.getResources().getLayout(i);
                try {
                    b(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e) {
                    e = e;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e2) {
                    e = e2;
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
