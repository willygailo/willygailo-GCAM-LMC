package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public class ja extends Dialog {
    private ii a;
    private final fm b;

    public ja(Context context, int i) {
        super(context, a(context, i));
        this.b = new iz(this);
        ii iiVarB = b();
        ((iy) iiVarB).D = a(context, i);
        iiVarB.m();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().c(view, layoutParams);
    }

    public final ii b() {
        if (this.a == null) {
            this.a = new iy(getContext(), getWindow(), this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void d() {
        b().n(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return eu.d(this.b, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().b(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().e();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        b().d();
        super.onCreate(bundle);
        b().m();
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        b().g();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b().i(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b().j(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().l(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().l(charSequence);
    }
}
