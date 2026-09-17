package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mpk implements mnf {
    public static final mpk a = new mpk(0);
    private final /* synthetic */ int b;

    public mpk(int i) {
        this.b = i;
    }

    @Override // defpackage.mnf
    public final /* synthetic */ mnb a(Object obj, Executor executor) {
        switch (this.b) {
            case 0:
                return ((mls) obj).a();
            default:
                return ((mqq) ((mrd) obj).c()).a();
        }
    }
}
