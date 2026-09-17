package defpackage;

import android.widget.TextView;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lqe implements oiu {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ lqe(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(Math.min(((Long) obj).intValue(), this.a));
            default:
                int i = this.a;
                ouj oujVar = jfs.a;
                TextView textView = (TextView) ((Map.Entry) obj).getValue();
                if (textView.getWidth() == 0) {
                    ((oug) ((oug) jfs.a.c()).G((char) 3316)).r("Trying to measure distance to chip %s with zero width i.e. before layout", textView.getText());
                }
                return Integer.valueOf(Math.min(Math.abs(i - textView.getLeft()), Math.abs(i - (textView.getRight() - 1))));
        }
    }
}
