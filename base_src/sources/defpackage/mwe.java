package defpackage;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class mwe {
    public final mwg a;

    public mwe(Context context, mwg mwgVar) {
        this.a = mwgVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(mwgVar.a);
        application.registerComponentCallbacks(mwgVar.a);
    }

    public final void a(mwd mwdVar) {
        mwg mwgVar = this.a;
        mwdVar.getClass();
        mwf mwfVar = mwgVar.a;
        int i = mwf.c;
        mwfVar.a.add(mwdVar);
    }

    public final void b(mwd mwdVar) {
        mwg mwgVar = this.a;
        mwdVar.getClass();
        mwf mwfVar = mwgVar.a;
        int i = mwf.c;
        mwfVar.a.remove(mwdVar);
    }
}
