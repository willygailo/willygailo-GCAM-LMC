package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pyr implements qkg, pyn {
    private static final Object a = new Object();
    private volatile qkg b;
    private volatile Object c = a;

    private pyr(qkg qkgVar) {
        this.b = qkgVar;
    }

    public static pyn a(qkg qkgVar) {
        if (qkgVar instanceof pyn) {
            return (pyn) qkgVar;
        }
        qkgVar.getClass();
        return new pyr(qkgVar);
    }

    public static qkg b(qkg qkgVar) {
        qkgVar.getClass();
        return qkgVar instanceof pyr ? qkgVar : new pyr(qkgVar);
    }

    @Override // defpackage.qkg
    public final Object get() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.c;
                if (obj == obj2) {
                    obj = this.b.get();
                    Object obj3 = this.c;
                    if (obj3 != obj2 && obj3 != obj) {
                        String strValueOf = String.valueOf(obj3);
                        String strValueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + R.styleable.AppCompatTheme_windowActionBarOverlay + String.valueOf(strValueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
