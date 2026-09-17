package defpackage;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class mkj implements mkc, mks {
    int b;
    final MediaFormat c;
    public final List d = new ArrayList();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    long a = -1;

    public mkj(MediaFormat mediaFormat) {
        this.c = mediaFormat;
    }

    @Override // defpackage.mks
    public final int a() {
        return mip.aq(this.c) ? 90000 : 48000;
    }

    @Override // defpackage.mks
    public final MediaFormat b() {
        return this.c;
    }

    @Override // defpackage.mks
    public final oom c() {
        return oom.j(this.e);
    }

    @Override // defpackage.mks
    public final oom d() {
        return oom.j(this.f);
    }

    @Override // defpackage.mks
    public final oom e() {
        return oom.l();
    }
}
