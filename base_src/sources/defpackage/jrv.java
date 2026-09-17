package defpackage;

import android.animation.IntEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class jrv implements TypeEvaluator {
    private static final IntEvaluator a = new IntEvaluator();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        IntEvaluator intEvaluator = a;
        return new Rect(intEvaluator.evaluate(f, Integer.valueOf(rect.left), Integer.valueOf(rect2.left)).intValue(), intEvaluator.evaluate(f, Integer.valueOf(rect.top), Integer.valueOf(rect2.top)).intValue(), intEvaluator.evaluate(f, Integer.valueOf(rect.right), Integer.valueOf(rect2.right)).intValue(), intEvaluator.evaluate(f, Integer.valueOf(rect.bottom), Integer.valueOf(rect2.bottom)).intValue());
    }
}
