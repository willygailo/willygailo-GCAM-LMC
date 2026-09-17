package defpackage;

import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;

/* JADX INFO: loaded from: classes2.dex */
public final class sg {
    public final int a;
    public final Bundle b;

    public sg(int i) {
        this.a = i;
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (i == 7 || i == 4) {
            ComplicationData.j("IMAGE_STYLE", i);
            bundle.putInt("IMAGE_STYLE", 1);
        }
    }

    public final ComplicationData a() {
        for (String str : ComplicationData.a[this.a]) {
            if (!this.b.containsKey(str)) {
                int i = this.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                sb.append("Field ");
                sb.append(str);
                sb.append(" is required for type ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            if (this.b.containsKey("ICON_BURN_IN_PROTECTION") && !this.b.containsKey("ICON")) {
                throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.");
            }
            if (this.b.containsKey("SMALL_IMAGE_BURN_IN_PROTECTION") && !this.b.containsKey("SMALL_IMAGE")) {
                throw new IllegalStateException("Field SMALL_IMAGE must be provided when field SMALL_IMAGE_BURN_IN_PROTECTION is provided.");
            }
        }
        return new ComplicationData(this);
    }
}
