package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Range;
import android.view.MotionEvent;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fpi implements jka {
    public final lda a;
    private final DisplayMetrics g;
    private final gvb h;
    private final ScheduledExecutorService i;
    private final kas k;
    public final fvs b = new fvs();
    private final AtomicBoolean j = new AtomicBoolean();
    public volatile Optional c = Optional.empty();
    public volatile float d = 0.0f;
    public volatile float e = 0.0f;
    private volatile float l = 0.0f;
    public volatile float f = 0.0f;

    public fpi(gvb gvbVar, lda ldaVar, DisplayMetrics displayMetrics, kas kasVar, ScheduledExecutorService scheduledExecutorService) {
        this.h = gvbVar;
        this.a = ldaVar;
        this.g = displayMetrics;
        this.k = kasVar;
        this.i = scheduledExecutorService;
    }

    private static float d(float f, Range range) {
        float fFloatValue = ((Float) range.getLower()).floatValue();
        return (f - fFloatValue) / (((Float) range.getUpper()).floatValue() - fFloatValue);
    }

    private static float e(float f, Range range) {
        return (f * (((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue())) + ((Float) range.getLower()).floatValue();
    }

    private static Range f(float f, float f2) {
        return Range.create(Float.valueOf(f), Float.valueOf(Math.max(f, f2)));
    }

    private final synchronized void g(Range range) {
        if (this.j.getAndSet(true)) {
            return;
        }
        this.i.schedule(new fph(this, range, 1), 33L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.jka
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, Rect rect, boolean z) {
        float rawY;
        boolean z2;
        float fMin;
        float fMax;
        boolean z3;
        this.b.b(motionEvent);
        float fC = this.k.c();
        float fB = this.k.b();
        Range rangeCreate = fC < fB ? Range.create(Float.valueOf(fC), Float.valueOf(fB)) : Range.create(Float.valueOf(1.0f), Float.valueOf(8.0f));
        if (this.d <= 0.0f) {
            this.d = ((Float) this.a.fA()).floatValue();
            this.e = this.d;
        }
        if (!this.c.isPresent()) {
            this.c = Optional.of((Float) this.a.fA());
        }
        int iMax = Math.max(this.g.heightPixels, this.g.widthPixels);
        lic licVarF = this.h.f();
        if (licVarF == lic.CLOCKWISE_0 || licVarF == lic.CLOCKWISE_180) {
            float rawY2 = motionEvent2.getRawY();
            rawY = motionEvent.getRawY();
            float fMin2 = Math.min(rawY2, rect.top);
            float fMax2 = Math.max(rawY2, rect.bottom);
            boolean z4 = ((float) rect.top) < rawY && rawY < ((float) rect.bottom);
            z2 = rawY2 >= rawY;
            fMin = fMin2;
            fMax = fMax2;
            z3 = z4;
        } else {
            float rawX = motionEvent2.getRawX();
            rawY = motionEvent.getRawX();
            z3 = ((float) rect.left) < rawY && rawY < ((float) rect.right);
            if (licVarF == lic.CLOCKWISE_90) {
                z2 = rawX <= rawY;
                float f = iMax;
                rawY = f - rawY;
                fMin = f - Math.max(rawX, rect.right);
                fMax = f - Math.min(rawX, rect.left);
            } else {
                z2 = rawX >= rawY;
                fMin = Math.min(rawX, rect.left);
                fMax = Math.max(rawX, rect.right);
            }
        }
        if (z2) {
            b();
            if (z3) {
                return;
            }
            Range rangeF = f(this.d, ((Float) rangeCreate.getUpper()).floatValue());
            float fMax3 = Math.max(0.0f, Math.min(1.0f, d(-rawY, f(-fMin, iMax * (-0.5f)))));
            this.f = Math.max(fMax3, this.f);
            float fE = e(fMax3, rangeF);
            if (this.b.a() > 0.0f) {
                this.d = Math.min(this.d, e(Math.max(0.0f, d(this.e, rangeCreate) - Math.max(this.f - fMax3, 0.0f)), rangeCreate));
                fE = e(fMax3, f(this.d, ((Float) rangeCreate.getUpper()).floatValue()));
            }
            this.a.fB(Float.valueOf(((Float) rangeCreate.clamp(Float.valueOf(fE))).floatValue()));
            return;
        }
        float fMax4 = Math.max(this.g.heightPixels, this.g.widthPixels);
        if (fMax < fMax4) {
            Range rangeCreate2 = Range.create(Float.valueOf(fMax), Float.valueOf(fMax4));
            Range rangeCreate3 = Range.create(Float.valueOf(0.0f), Float.valueOf(0.1f));
            if (z3) {
                b();
                return;
            }
            float fFloatValue = ((Float) rangeCreate2.clamp(Float.valueOf(rawY))).floatValue();
            float fFloatValue2 = ((Float) rangeCreate2.getLower()).floatValue();
            float fFloatValue3 = ((Float) rangeCreate2.getUpper()).floatValue();
            float fFloatValue4 = ((Float) rangeCreate3.getLower()).floatValue();
            this.l = (((fFloatValue - fFloatValue2) / (fFloatValue3 - fFloatValue2)) * (((Float) rangeCreate3.getUpper()).floatValue() - fFloatValue4)) + fFloatValue4;
            g(rangeCreate);
        }
    }

    public final synchronized void b() {
        this.l = 0.0f;
        this.j.set(false);
    }

    public final void c(Range range) {
        if (this.j.get()) {
            float fFloatValue = ((Float) this.a.fA()).floatValue();
            float fMax = Math.max(((Float) range.getLower()).floatValue(), fFloatValue - this.l);
            if (fFloatValue <= fMax) {
                return;
            }
            float fFloatValue2 = ((Float) range.clamp(Float.valueOf(fMax))).floatValue();
            this.a.fB(Float.valueOf(fFloatValue2));
            this.d = fFloatValue2;
            this.e = fFloatValue2;
            this.i.schedule(new fph(this, range, 0), 33L, TimeUnit.MILLISECONDS);
        }
    }
}
