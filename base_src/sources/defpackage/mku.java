package defpackage;

import android.media.MediaFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mku implements mkc, mks {
    final MediaFormat a;
    public final int b;
    final List c = new ArrayList();
    final List d = new ArrayList();
    final List e = new ArrayList();
    final Deque f = new ArrayDeque();
    boolean g = false;
    final /* synthetic */ mkv h;

    public mku(mkv mkvVar, MediaFormat mediaFormat, int i) {
        this.h = mkvVar;
        this.a = mediaFormat;
        this.b = i;
    }

    @Override // defpackage.mks
    public final int a() {
        return mip.ap(this.a) ? 48000 : 90000;
    }

    @Override // defpackage.mks
    public final MediaFormat b() {
        return this.a;
    }

    @Override // defpackage.mks
    public final oom c() {
        return oom.j(this.d);
    }

    @Override // defpackage.mks
    public final oom d() {
        return oom.j(this.e);
    }

    @Override // defpackage.mks
    public final oom e() {
        return oom.j(this.c);
    }
}
