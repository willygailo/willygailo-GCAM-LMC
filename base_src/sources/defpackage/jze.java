package defpackage;

import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceKnob;

/* JADX INFO: loaded from: classes2.dex */
final class jze implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ jzf b;

    public jze(jzf jzfVar, int i) {
        this.b = jzfVar;
        this.a = i;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.b.b.g()) {
            if (z) {
                this.b.f.i();
                this.b.c.fB(true);
                ((hcl) this.b.b.c()).e(true);
            }
            ManualWhiteBalanceKnob manualWhiteBalanceKnobC = this.b.e.c();
            int i2 = this.a;
            int i3 = manualWhiteBalanceKnobC.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) manualWhiteBalanceKnobC.getLayoutParams();
            layoutParams.bottomMargin = (int) ((i - 100) * ((i3 - i2) / 200.0f));
            manualWhiteBalanceKnobC.setLayoutParams(layoutParams);
            float f = i - 100.0f;
            ((hcl) this.b.b.c()).g(f / (f >= 0.0f ? Math.abs(100.0f) : 100.0f));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.f.d();
        this.b.k(true);
    }
}
