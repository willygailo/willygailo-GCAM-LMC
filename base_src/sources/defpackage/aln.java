package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class aln extends gb {
    final /* synthetic */ ViewPager2 a;

    public aln(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.gb
    public final CharSequence e() {
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // defpackage.gb
    public final void j(hb hbVar) {
        if (this.a.h) {
            return;
        }
        hbVar.j(ha.c);
        hbVar.j(ha.b);
        hbVar.i(false);
    }

    @Override // defpackage.gb
    public final boolean s(int i) {
        return (i == 8192 || i == 4096) && !this.a.h;
    }

    @Override // defpackage.gb
    public final boolean t() {
        return true;
    }

    @Override // defpackage.gb
    public final void w(int i) {
        if (!s(i)) {
            throw new IllegalStateException();
        }
    }
}
