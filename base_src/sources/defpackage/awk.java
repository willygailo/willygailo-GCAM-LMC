package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public final class awk implements Runnable {
    final /* synthetic */ awq a;
    final /* synthetic */ awl b;
    private final /* synthetic */ int c;

    public awk(awl awlVar, awq awqVar, int i) {
        this.c = i;
        this.b = awlVar;
        this.a = awqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.b.c().obtainMessage(R.styleable.AppCompatTheme_textAppearanceListItem, this.a).sendToTarget();
                break;
            default:
                this.b.c().obtainMessage(R.styleable.AppCompatTheme_switchStyle, null).sendToTarget();
                this.b.c().post(this.a.a);
                break;
        }
    }
}
