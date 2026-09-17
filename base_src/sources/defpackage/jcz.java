package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jcz {
    public final ius a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final boolean e;

    public jcz(final Context context, ius iusVar, final qkg qkgVar, boolean z, final hnx hnxVar, ddf ddfVar) {
        this.a = iusVar;
        this.e = z;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        final int i = 1;
        View.inflate(context, true != ddfVar.k(ddl.ay) ? R.layout.edu_bottomsheet_legacy : R.layout.edu_bottomsheet, frameLayout);
        frameLayout.findViewById(R.id.learn_more_button).setOnClickListener(new View.OnClickListener() { // from class: jcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                        break;
                    default:
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        View.inflate(context, true != ddfVar.k(ddl.ay) ? R.layout.setup_flow_bottomsheet_legacy : R.layout.setup_flow_bottomsheet, frameLayout2);
        frameLayout2.findViewById(R.id.photos_button).setOnClickListener(new View.OnClickListener() { // from class: jcy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jcz jczVar = this.a;
                hnx hnxVar2 = hnxVar;
                qkg qkgVar2 = qkgVar;
                if (jczVar.e) {
                    hnxVar2.e();
                } else {
                    ((dtp) qkgVar2.get()).a();
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        View.inflate(context, true != ddfVar.k(ddl.ay) ? R.layout.ineligible_bottomsheet_legacy : R.layout.ineligible_bottomsheet, frameLayout3);
        final int i2 = 0;
        frameLayout3.findViewById(R.id.learn_more_button).setOnClickListener(new View.OnClickListener() { // from class: jcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                        break;
                    default:
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                        break;
                }
            }
        });
    }
}
