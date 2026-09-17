package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes2.dex */
final class sn implements Icon.OnDrawableLoadedListener {
    final /* synthetic */ sq a;
    private final /* synthetic */ int b;

    public sn(sq sqVar, int i) {
        this.b = i;
        this.a = sqVar;
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public final void onDrawableLoaded(Drawable drawable) {
        switch (this.b) {
            case 0:
                if (drawable != null) {
                    sq sqVar = this.a;
                    sqVar.e = drawable;
                    sqVar.e.mutate();
                    this.a.c();
                    break;
                }
                break;
            case 1:
                if (drawable != null) {
                    sq sqVar2 = this.a;
                    sqVar2.d = drawable;
                    sqVar2.d.mutate();
                    this.a.c();
                    break;
                }
                break;
            case 2:
                if (drawable != null) {
                    sq sqVar3 = this.a;
                    sqVar3.f = drawable;
                    sqVar3.c();
                    break;
                }
                break;
            case 3:
                if (drawable != null) {
                    sq sqVar4 = this.a;
                    sqVar4.g = drawable;
                    sqVar4.c();
                    break;
                }
                break;
            default:
                if (drawable != null) {
                    sq sqVar5 = this.a;
                    sqVar5.h = drawable;
                    sqVar5.c();
                    break;
                }
                break;
        }
    }
}
