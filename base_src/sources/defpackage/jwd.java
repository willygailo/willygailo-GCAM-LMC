package defpackage;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes2.dex */
public final class jwd implements jvy {
    public final jvx a;
    public final jvb b;
    public final jvo c;
    public final View d;
    public final int e;
    public VideoView f;
    public ImageButton g;
    public ImageButton h;
    public TextView i;
    public TextView j;
    public SeekBar k;
    public View l;
    public boolean m;
    public boolean n;
    public View o;
    private final boolean p;

    public jwd(jvx jvxVar, jvb jvbVar, jvo jvoVar, View view, boolean z) {
        this.a = jvxVar;
        this.b = jvbVar;
        this.c = jvoVar;
        this.d = view;
        this.p = z;
        this.e = view.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    @Override // defpackage.jvy
    public final void a(int i) {
        this.i.setText(mip.dM(i));
        this.k.setMax(i);
    }

    @Override // defpackage.jvy
    public final void b(int i) {
        this.j.setText(mip.dM(i));
        this.k.setProgress(i);
    }

    @Override // defpackage.jvy
    public final void c() {
        this.n = true;
        if (!this.p) {
            this.l.animate().alpha(1.0f).setDuration(this.e).withStartAction(new jwb(this, 3)).start();
        }
        if (this.m) {
            this.h.setVisibility(8);
            this.g.animate().alpha(1.0f).setDuration(this.e).withStartAction(new jwb(this, 4)).start();
        } else {
            this.g.setVisibility(8);
            this.h.animate().alpha(1.0f).setDuration(this.e).withStartAction(new jwb(this, 5)).start();
        }
    }

    public final void d(Rect rect) {
        this.o.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
