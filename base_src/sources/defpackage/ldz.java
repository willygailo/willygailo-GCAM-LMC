package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public enum ldz {
    FPS_AUTO(30, 30, 60),
    FPS_24(24, 24, 24),
    FPS_30(30, 30, 30),
    FPS_60(60, 60, 60),
    FPS_60C_24E(60, 24, 60),
    FPS_60C_30E(60, 30, 60),
    FPS_120_HFR_4X(R.styleable.AppCompatTheme_windowFixedHeightMajor, 30, R.styleable.AppCompatTheme_windowFixedHeightMajor),
    FPS_240_HFR_8X(240, 30, 240);

    public final int i;
    public final int j;
    public final int k;

    ldz(int i, int i2, int i3) {
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public static ldz b(int i, int i2) {
        if (i2 == 30 && i == 30) {
            return FPS_30;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("unsupported capture frame rate =");
        sb.append(i);
        sb.append(" and encoding frame rate=");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Collection d() {
        LinkedList linkedList = new LinkedList();
        for (ldz ldzVar : values()) {
            if (ldzVar.f()) {
                linkedList.add(ldzVar);
            }
        }
        return linkedList;
    }

    public final int a() {
        return this.i / this.j;
    }

    public final boolean e() {
        return this == FPS_60C_24E || this == FPS_60C_30E;
    }

    public final boolean f() {
        return this.i > 60;
    }

    public final boolean g() {
        return this.i <= 60;
    }
}
