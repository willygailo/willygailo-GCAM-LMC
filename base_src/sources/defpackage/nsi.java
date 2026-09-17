package defpackage;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", c = "F250Worker.kt", d = "uploadAllValidResources", e = {204})
public final class nsi extends qlu {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    final /* synthetic */ F250Worker f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsi(F250Worker f250Worker, qlh qlhVar) {
        super(qlhVar);
        this.f = f250Worker;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.m(null, this);
    }
}
