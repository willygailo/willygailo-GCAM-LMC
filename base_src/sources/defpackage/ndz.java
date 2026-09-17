package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ndz {
    public static final Map a = new wy();
    public static final String[] b = {"key", "value"};
    public final ContentResolver c;
    public final Uri d;
    public final Object e;
    public volatile Map f;
    private final ContentObserver g;
    private final List h;

    private ndz(ContentResolver contentResolver, Uri uri) {
        ndy ndyVar = new ndy(this);
        this.g = ndyVar;
        this.e = new Object();
        this.h = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        contentResolver.registerContentObserver(uri, false, ndyVar);
    }

    public static ndz a(ContentResolver contentResolver, Uri uri) {
        ndz ndzVar;
        synchronized (ndz.class) {
            Map map = a;
            ndzVar = (ndz) map.get(uri);
            if (ndzVar == null) {
                try {
                    ndz ndzVar2 = new ndz(contentResolver, uri);
                    try {
                        map.put(uri, ndzVar2);
                    } catch (SecurityException e) {
                    }
                    ndzVar = ndzVar2;
                } catch (SecurityException e2) {
                }
            }
        }
        return ndzVar;
    }

    static synchronized void b() {
        for (ndz ndzVar : a.values()) {
            ndzVar.c.unregisterContentObserver(ndzVar.g);
        }
        a.clear();
    }

    public final void c() {
        synchronized (this.e) {
            this.f = null;
            ner.g();
        }
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((nea) it.next()).a();
            }
        }
    }
}
