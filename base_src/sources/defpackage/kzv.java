package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class kzv {
    static HashMap f;
    private static Object l;
    private static boolean m;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    static final HashMap g = new HashMap();
    static final HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    static final HashMap j = new HashMap();
    static final String[] k = new String[0];

    public static int a(ContentResolver contentResolver, String str, int i2) {
        Object objC = c(contentResolver);
        Integer numValueOf = (Integer) b(h, str, Integer.valueOf(i2));
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String strF = f(contentResolver, str);
        if (strF != null) {
            try {
                int i3 = Integer.parseInt(strF);
                numValueOf = Integer.valueOf(i3);
                i2 = i3;
            } catch (NumberFormatException e2) {
            }
        }
        e(objC, h, str, numValueOf);
        return i2;
    }

    public static Object b(HashMap map, String str, Object obj) {
        synchronized (kzv.class) {
            if (!map.containsKey(str)) {
                return null;
            }
            Object obj2 = map.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            return obj;
        }
    }

    public static Object c(ContentResolver contentResolver) {
        Object obj;
        synchronized (kzv.class) {
            g(contentResolver);
            obj = l;
        }
        return obj;
    }

    public static Map d(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return treeMap;
    }

    public static void e(Object obj, HashMap map, String str, Object obj2) {
        synchronized (kzv.class) {
            if (obj == l) {
                map.put(str, obj2);
                f.remove(str);
            }
        }
    }

    public static String f(ContentResolver contentResolver, String str) {
        synchronized (kzv.class) {
            g(contentResolver);
            Object obj = l;
            String str2 = null;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            int length = k.length;
            Cursor cursorQuery = contentResolver.query(a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    h(obj, str, string);
                    if (string != null) {
                        str2 = string;
                    }
                } else {
                    h(obj, str, null);
                }
                return str2;
            } finally {
                cursorQuery.close();
            }
        }
    }

    private static void g(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap();
            l = new Object();
            m = false;
            contentResolver.registerContentObserver(a, true, new kzu());
            return;
        }
        if (e.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            l = new Object();
            m = false;
        }
    }

    private static void h(Object obj, String str, String str2) {
        synchronized (kzv.class) {
            if (obj == l) {
                f.put(str, str2);
            }
        }
    }
}
