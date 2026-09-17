package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes2.dex */
final class iko extends LruCache {
    public iko() {
        super(20971520);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        hsp hspVar = (hsp) obj;
        super.entryRemoved(z, hspVar, (bik) obj2, (bik) obj3);
        ((oug) ((oug) ikp.a.c()).G(2979)).z("Placeholder drawable removed: key=%s evicted=%b", hspVar, z);
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((bik) obj2).a();
    }
}
