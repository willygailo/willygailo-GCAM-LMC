package defpackage;

import android.widget.SeekBar;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kbf implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ kbi a;

    public kbf(kbi kbiVar) {
        this.a = kbiVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            if (this.a.H.s()) {
                kbi kbiVar = this.a;
                if (kbiVar.L) {
                    kbiVar.H.r(i, kbiVar.U);
                    this.a.u.a();
                    return;
                }
            }
            obr.aG(((Float) ((lce) this.a.e).d).floatValue() != 0.0f, "max zoom value hasn't been initialized properly");
            this.a.a.incrementAndGet();
            kbi kbiVar2 = this.a;
            int i2 = i - kbiVar2.S;
            kbiVar2.E.getDimensionPixelSize(R.dimen.zoom_seekbar_width);
            int dimensionPixelSize = (int) ((kbiVar2.E.getDimensionPixelSize(R.dimen.zoom_icon_size) / kbiVar2.E.getDimensionPixelSize(R.dimen.zoom_seekbar_width)) * kbiVar2.G.getMax());
            int max = kbiVar2.G.getMax();
            int i3 = dimensionPixelSize / 30;
            if (Math.abs(i2) >= dimensionPixelSize / 2 || kbiVar2.R != 0 || i2 == 0) {
                int i4 = kbiVar2.R;
                if (i4 != 0) {
                    if (i4 > i3) {
                        kbiVar2.R = i4 - i3;
                    } else if (i4 < (-i3)) {
                        kbiVar2.R = i4 + i3;
                    } else {
                        kbiVar2.Q(i);
                    }
                    int i5 = i - kbiVar2.R;
                    if (i5 < 0) {
                        kbiVar2.Q(i);
                        i = 0;
                    } else if (i5 > max || i == max) {
                        kbiVar2.Q(i);
                        i = max;
                    } else {
                        i = i5;
                    }
                }
            } else {
                kbiVar2.R = i2;
                i = kbiVar2.S;
            }
            int max2 = this.a.G.getMax();
            float fFloatValue = ((Float) ((lce) this.a.f).d).floatValue();
            double dPow = Math.pow(((Float) ((lce) this.a.e).d).floatValue() / ((Float) ((lce) this.a.f).d).floatValue(), i / max2);
            lda ldaVar = this.a.s;
            double d = fFloatValue;
            Double.isNaN(d);
            Float fValueOf = Float.valueOf((float) (d * dPow));
            ldaVar.fB(fValueOf);
            kbi kbiVar3 = this.a;
            kbiVar3.t.fB((Float) kbiVar3.g.fA());
            if (this.a.a.intValue() > 1) {
                this.a.g.fB(fValueOf);
                if (this.a.a.intValue() == 2) {
                    this.a.z.k();
                    this.a.F.b(true);
                }
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.a.H.s()) {
            kbi kbiVar = this.a;
            if (kbiVar.L) {
                kbiVar.L();
                return;
            }
        }
        this.a.Q(seekBar.getProgress());
        this.a.a.set(0);
        this.a.F.b(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.a.a.intValue() <= 1 && !this.a.H.s()) {
            float fFloatValue = ((Float) ((lce) this.a.s).d).floatValue();
            this.a.z.m(fFloatValue, 5);
            this.a.t.fB(Float.valueOf(fFloatValue));
        }
        this.a.z.n();
        kbi kbiVar = this.a;
        kbiVar.S = 0;
        kbiVar.R = 0;
    }
}
