package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
final class akp extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public akp(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        akq akqVar = new akq();
        akqVar.a = (VectorDrawable) this.a.newDrawable();
        return akqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        akq akqVar = new akq();
        akqVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return akqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        akq akqVar = new akq();
        akqVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return akqVar;
    }
}
