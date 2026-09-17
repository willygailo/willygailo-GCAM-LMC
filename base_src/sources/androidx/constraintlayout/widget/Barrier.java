package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.yh;
import defpackage.yk;
import defpackage.zi;
import defpackage.zz;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends zi {
    public int a;
    public yh b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    @Override // defpackage.zi
    protected final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zz.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    this.f = typedArrayObtainStyledAttributes.getString(35);
                    e(this.f);
                } else if (index == 36) {
                    this.g = typedArrayObtainStyledAttributes.getString(36);
                    f(this.g);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.b = new yh();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, zz.b);
            int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = typedArrayObtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    this.a = typedArrayObtainStyledAttributes2.getInt(26, 0);
                } else if (index2 == 25) {
                    this.b.b = typedArrayObtainStyledAttributes2.getBoolean(25, true);
                } else if (index2 == 27) {
                    this.b.c = typedArrayObtainStyledAttributes2.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.i = this.b;
        h();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    @Override // defpackage.zi
    public final void b(yk ykVar, boolean z) {
        int i = this.a;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (ykVar instanceof yh) {
            ((yh) ykVar).a = i;
        }
    }

    public final void c(int i) {
        this.b.c = i;
    }
}
