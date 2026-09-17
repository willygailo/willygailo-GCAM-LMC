package defpackage;

import android.view.View;
import android.widget.ImageButton;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* JADX INFO: loaded from: classes2.dex */
final class jpw implements phh {
    final /* synthetic */ jpx a;

    public jpw(jpx jpxVar) {
        this.a = jpxVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        nho nhoVar = (nho) obj;
        if (nhoVar == nho.DISABLED || nhoVar == nho.NEEDS_SIGN_IN || nhoVar == nho.ACCESS_DENIED || nhoVar == nho.UNSUPPORTED_FOR_ALL_USERS) {
            return;
        }
        this.a.e.execute(new Runnable() { // from class: jpu
            @Override // java.lang.Runnable
            public final void run() {
                jpw jpwVar = this.a;
                jpwVar.a.f.e("MarsWirer#mainThread");
                jpx jpxVar = jpwVar.a;
                jpxVar.g = (MarsSwitch) ((jnr) jpxVar.d.get()).c.c(R.id.mars_switch);
                jpx jpxVar2 = jpwVar.a;
                final jdk jdkVar = jpxVar2.b;
                final MarsSwitch marsSwitch = jpxVar2.g;
                jhs jhsVar = new jhs(jpxVar2.a, jpxVar2.c, null);
                jdkVar.k = jhsVar;
                jdkVar.i = marsSwitch;
                jdkVar.j = new jsh(marsSwitch);
                marsSwitch.b.c(jdkVar.g.k(ddl.ay));
                final PopupMenuView popupMenuView = marsSwitch.a;
                popupMenuView.c(R.string.mars_menu_title, jhsVar, 48, jdkVar.g.k(ddl.ay));
                ImageButton imageButton = popupMenuView.b;
                final int i = 0;
                imageButton.setVisibility(0);
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: jdb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jcz jczVar = jdkVar.f;
                        jczVar.a.f(9, -1, jczVar.b);
                    }
                });
                jhsVar.c(new jhq() { // from class: jdd
                    @Override // defpackage.jhq
                    public final void a(jhp jhpVar) {
                        jdk jdkVar2 = jdkVar;
                        MarsSwitch marsSwitch2 = marsSwitch;
                        synchronized (jdkVar2) {
                            marsSwitch2.a.b();
                            if (jhpVar.a != hss.MEDIA_STORE) {
                                plk.af(jdk.a(jdkVar2.d, jdkVar2.b), new jdj(jdkVar2, marsSwitch2, jhpVar), jdkVar2.d);
                            } else {
                                jdkVar2.e.e(htu.ab, false);
                                marsSwitch2.b(jhpVar, jdkVar2.g.k(ddl.ay));
                            }
                        }
                    }
                }, false);
                jhsVar.e(jdkVar.h ? hss.MARS_STORE : hss.MEDIA_STORE);
                jdkVar.h = false;
                marsSwitch.b(jhsVar.b(), jdkVar.g.k(ddl.ay));
                marsSwitch.b.setOnClickListener(new View.OnClickListener() { // from class: jdc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PopupMenuView popupMenuView2 = popupMenuView;
                        if (popupMenuView2.getVisibility() == 0) {
                            popupMenuView2.b();
                        } else {
                            popupMenuView2.d();
                        }
                    }
                });
                final int i2 = 1;
                if (mip.en(marsSwitch.b)) {
                    marsSwitch.postDelayed(new Runnable() { // from class: jde
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    marsSwitch.b.setVisibility(0);
                                    break;
                                default:
                                    marsSwitch.setVisibility(0);
                                    break;
                            }
                        }
                    }, 1500L);
                    marsSwitch.b.postDelayed(new Runnable() { // from class: jde
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    marsSwitch.b.setVisibility(0);
                                    break;
                                default:
                                    marsSwitch.setVisibility(0);
                                    break;
                            }
                        }
                    }, 1500L);
                } else {
                    marsSwitch.setVisibility(0);
                    marsSwitch.b.setVisibility(0);
                }
                marsSwitch.setEnabled(true);
                MainActivityLayout mainActivityLayout = (MainActivityLayout) ((jnr) jpwVar.a.d.get()).c.c(R.id.activity_root_view);
                mainActivityLayout.g = jpwVar.a.g;
                mainActivityLayout.n(mainActivityLayout.d().h);
                jpx jpxVar3 = jpwVar.a;
                jpxVar3.h.e(jpxVar3.b);
                mainActivityLayout.u(new jpv(jpwVar));
                jpwVar.a.f.f();
            }
        });
    }
}
