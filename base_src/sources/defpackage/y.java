package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends dgg {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new f();
    public static final y a = new y();

    private y() {
    }

    public final x a(String str) {
        boolean zContainsKey;
        Object[][] objArr;
        x xVarB;
        synchronized (this.e) {
            zContainsKey = this.e.containsKey(str);
            objArr = null;
            xVarB = zContainsKey ? (x) this.e.get(str) : null;
        }
        if (!zContainsKey) {
            try {
                for (Object[] objArr2 : (Object[][]) d.getObject("rules")) {
                    if (str.equals(objArr2[0])) {
                        objArr = (Object[][]) objArr2[1];
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (Object[] objArr3 : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append((String) objArr3[0]);
                    sb.append(": ");
                    sb.append((String) objArr3[1]);
                }
                xVarB = x.b(sb.toString());
            } catch (ParseException e) {
            } catch (MissingResourceException e2) {
            }
            synchronized (this.e) {
                if (this.e.containsKey(str)) {
                    xVarB = (x) this.e.get(str);
                } else {
                    this.e.put(str, xVarB);
                }
            }
        }
        return xVarB;
    }

    public final void b() {
        Map map;
        Map mapEmptyMap;
        Map mapEmptyMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                mapEmptyMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    mapEmptyMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                mapEmptyMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    mapEmptyMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException e) {
                mapEmptyMap = Collections.emptyMap();
                mapEmptyMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = mapEmptyMap;
                    this.c = mapEmptyMap2;
                }
            }
        }
    }
}
