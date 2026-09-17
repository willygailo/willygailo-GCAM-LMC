package defpackage;

import android.os.SystemClock;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
final class afz implements Runnable {
    final /* synthetic */ aga a;

    public afz(aga agaVar) {
        this.a = agaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aga agaVar = this.a;
        long j = agaVar.ac;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = agaVar.aa;
        if (editText == null || !editText.isFocused()) {
            agaVar.ak();
        } else if (((InputMethodManager) agaVar.aa.getContext().getSystemService("input_method")).showSoftInput(agaVar.aa, 0)) {
            agaVar.ak();
        } else {
            agaVar.aa.removeCallbacks(agaVar.ab);
            agaVar.aa.postDelayed(agaVar.ab, 50L);
        }
    }
}
