package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ic {
    public final int A;
    public final int B;
    final int C;
    final int D;
    final int E;
    final int F;
    public final boolean G;
    final Handler H;
    public final Context a;
    final ja b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    public int h;
    Button j;
    public CharSequence k;
    Message l;
    Button m;
    public CharSequence n;
    Message o;
    Button p;
    public CharSequence q;
    NestedScrollView r;
    public Drawable t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public View x;
    ListAdapter y;
    public boolean i = false;
    public int s = 0;
    int z = -1;
    public final View.OnClickListener I = new hv(this);

    public ic(Context context, ja jaVar, Window window) {
        this.a = context;
        this.b = jaVar;
        this.c = window;
        this.H = new ia(jaVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, jq.e, R.attr.alertDialogStyle, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.G = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        jaVar.d();
    }

    static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static final void c(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.H.obtainMessage(i, onClickListener) : null;
        switch (i) {
            case -2:
                this.n = charSequence;
                this.o = messageObtainMessage;
                break;
            default:
                this.k = charSequence;
                this.l = messageObtainMessage;
                break;
        }
    }
}
