package defpackage;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jux extends bu {
    public jwd a;
    public ojc b = oih.a;
    private jvx c;

    public static jux k(Bundle bundle, Uri uri) {
        bundle.putParcelable("video_uri", uri);
        jux juxVar = new jux();
        juxVar.Q(bundle);
        return juxVar;
    }

    @Override // defpackage.bu
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.videoplayer_fragment, viewGroup, false);
        this.c = new jvk();
        jvb jvbVar = new jvb(new qkg() { // from class: juw
            @Override // defpackage.qkg
            public final Object get() {
                return this.a.a;
            }
        });
        jvg jvgVar = new jvg();
        boolean z = this.l.getBoolean("auto_loop_enabled", false);
        final jwd jwdVar = new jwd(this.c, jvbVar, jvgVar, viewInflate, this.l.getBoolean("no_seek_bar", false));
        this.a = jwdVar;
        jwdVar.f = (VideoView) jwdVar.d.findViewById(R.id.video_view);
        jwdVar.f.setOnTouchListener(new View.OnTouchListener() { // from class: jwa
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                jwd jwdVar2 = jwdVar;
                if (motionEvent.getAction() == 1) {
                    jwdVar2.b.c();
                }
                return true;
            }
        });
        final int i2 = 2;
        jwdVar.d.setOnClickListener(new View.OnClickListener() { // from class: jvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        jwd jwdVar2 = jwdVar;
                        jwdVar2.a.a();
                        jwdVar2.b.b();
                        break;
                    case 1:
                        jwdVar.a.d();
                        break;
                    default:
                        jwdVar.b.c();
                        break;
                }
            }
        });
        jwdVar.f.setWillNotDraw(false);
        jwdVar.h = (ImageButton) jwdVar.d.findViewById(R.id.videoplayer_pause_button);
        final int i3 = 1;
        jwdVar.h.setOnClickListener(new View.OnClickListener() { // from class: jvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        jwd jwdVar2 = jwdVar;
                        jwdVar2.a.a();
                        jwdVar2.b.b();
                        break;
                    case 1:
                        jwdVar.a.d();
                        break;
                    default:
                        jwdVar.b.c();
                        break;
                }
            }
        });
        jwdVar.g = (ImageButton) jwdVar.d.findViewById(R.id.videoplayer_play_button);
        jwdVar.g.setOnClickListener(new View.OnClickListener() { // from class: jvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        jwd jwdVar2 = jwdVar;
                        jwdVar2.a.a();
                        jwdVar2.b.b();
                        break;
                    case 1:
                        jwdVar.a.d();
                        break;
                    default:
                        jwdVar.b.c();
                        break;
                }
            }
        });
        jwdVar.l = jwdVar.d.findViewById(R.id.video_progress_group);
        jwdVar.k = (SeekBar) jwdVar.d.findViewById(R.id.video_player_progress);
        jwdVar.k.setOnSeekBarChangeListener(new jwc(jwdVar));
        jwdVar.i = (TextView) jwdVar.d.findViewById(R.id.video_total_time);
        jwdVar.j = (TextView) jwdVar.d.findViewById(R.id.video_current_time);
        jwdVar.o = jwdVar.d.findViewById(R.id.video_view_holder);
        if (this.b.g()) {
            this.a.f.setOnInfoListener((MediaPlayer.OnInfoListener) this.b.c());
        }
        Rect rect = (Rect) this.l.getParcelable("video_view_padding");
        if (rect != null) {
            this.a.d(rect);
        }
        Uri uri = (Uri) this.l.getParcelable("video_uri");
        uri.getClass();
        jwd jwdVar2 = this.a;
        jvgVar.c(jwdVar2, new jvq(jwdVar2));
        jvgVar.f();
        jvgVar.g();
        this.c.j(this.a, uri, jvbVar, jvgVar, bundle == null ? 0 : bundle.getInt("videoplayer_position", 0), bundle == null ? true : bundle.getBoolean("videoplayer_playing_state", true), z);
        this.c.f();
        jvbVar.f();
        return viewInflate;
    }

    @Override // defpackage.bu
    public final void K() {
        super.K();
        this.c.b();
    }

    @Override // defpackage.bu
    public final void L() {
        super.L();
        this.c.k();
    }

    @Override // defpackage.bu
    public final void f(Bundle bundle) {
        boolean zIsPlaying = this.a.f.isPlaying();
        int currentPosition = this.a.f.getCurrentPosition();
        bundle.putBoolean("videoplayer_playing_state", zIsPlaying);
        bundle.putInt("videoplayer_position", currentPosition);
    }
}
