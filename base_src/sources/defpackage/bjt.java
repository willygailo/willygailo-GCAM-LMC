package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bjt extends Fragment {
    public final bjj a;
    public final bjv b;
    public ayn c;
    private final Set d;
    private bjt e;

    public bjt() {
        bjj bjjVar = new bjj();
        this.b = new bjs(this);
        this.d = new HashSet();
        this.a = bjjVar;
    }

    private final void a() {
        bjt bjtVar = this.e;
        if (bjtVar != null) {
            bjtVar.d.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a();
            bjt bjtVarC = axv.b(activity).e.c(activity.getFragmentManager());
            this.e = bjtVarC;
            if (equals(bjtVarC)) {
                return;
            }
            this.e.d.add(this);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.b();
        a();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        a();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.d();
    }

    @Override // android.app.Fragment
    public final String toString() {
        String string = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String strValueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 9 + String.valueOf(strValueOf).length());
        sb.append(string);
        sb.append("{parent=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
