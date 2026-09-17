package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class obo implements obp {
    private final obp a;
    private final float b;

    public obo(float f, obp obpVar) {
        while (obpVar instanceof obo) {
            obpVar = ((obo) obpVar).a;
            f += ((obo) obpVar).b;
        }
        this.a = obpVar;
        this.b = f;
    }

    @Override // defpackage.obp
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obo)) {
            return false;
        }
        obo oboVar = (obo) obj;
        return this.a.equals(oboVar.a) && this.b == oboVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
