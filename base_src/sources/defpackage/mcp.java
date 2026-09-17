package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
class mcp extends mcm implements mce {
    public mcp(mip mipVar, mce mceVar, lis lisVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(mipVar, mceVar, lisVar, null, null, null);
    }

    @Override // defpackage.mcd
    public final long a() {
        return l().a();
    }

    @Override // defpackage.mcd
    public final boolean e() {
        return l().e();
    }

    @Override // defpackage.mcd
    public final boolean f() {
        return l().f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mcd, mce] */
    @Override // defpackage.mce
    public final Uri h() {
        return l().h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mcd, mce] */
    @Override // defpackage.mce
    public final mcn i() {
        return l().i();
    }

    @Override // defpackage.mce
    public final void j() throws InterruptedException {
        this.c.writeLock().lockInterruptibly();
        this.c.writeLock().unlock();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mcd, mce] */
    @Override // defpackage.mce
    public final boolean k() {
        return l().k();
    }

    @Override // defpackage.mcm
    public final String toString() {
        return l().toString();
    }
}
