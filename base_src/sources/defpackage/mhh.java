package defpackage;

import com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mhh implements DLLinkResultListener {
    final /* synthetic */ pos a;
    final /* synthetic */ mgv b;

    public mhh(pos posVar, mgv mgvVar) {
        this.a = posVar;
        this.b = mgvVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener
    public final void onResultUpdate(List list, ByteBuffer byteBuffer) {
        mgt mgtVarA = mgu.a();
        mgtVarA.b(list);
        mgtVarA.d(mhi.a(byteBuffer, this.a));
        mgtVarA.c(mgw.b);
        this.b.a(mgtVarA.a());
    }

    @Override // com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener
    public final void onResultUpdate(List list, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        mgw mgwVar;
        mgt mgtVarA = mgu.a();
        mgtVarA.b(list);
        mgtVarA.d(mhi.a(byteBuffer, this.a));
        try {
            mgwVar = (mgw) ppd.r(mgw.b, byteBuffer2, this.a);
        } catch (Exception e) {
            mgwVar = mgw.b;
        }
        mgtVarA.c(mgwVar);
        this.b.a(mgtVarA.a());
    }
}
