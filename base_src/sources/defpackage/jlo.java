package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Function;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jlo implements Function {
    private final /* synthetic */ int p;
    public static final /* synthetic */ jlo o = new jlo(14);
    public static final /* synthetic */ jlo n = new jlo(13);
    public static final /* synthetic */ jlo m = new jlo(12);
    public static final /* synthetic */ jlo l = new jlo(11);
    public static final /* synthetic */ jlo k = new jlo(10);
    public static final /* synthetic */ jlo j = new jlo(9);
    public static final /* synthetic */ jlo i = new jlo(8);
    public static final /* synthetic */ jlo h = new jlo(7);
    public static final /* synthetic */ jlo g = new jlo(6);
    public static final /* synthetic */ jlo f = new jlo(5);
    public static final /* synthetic */ jlo e = new jlo(4);
    public static final /* synthetic */ jlo d = new jlo(3);
    public static final /* synthetic */ jlo c = new jlo(2);
    public static final /* synthetic */ jlo b = new jlo(1);
    public static final /* synthetic */ jlo a = new jlo(0);

    private /* synthetic */ jlo(int i2) {
        this.p = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.p) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.p) {
            case 0:
                Resources resources = (Resources) obj;
                jlp jlpVarA = jlq.a();
                jlpVarA.o(resources.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA.j(resources.getColor(R.color.camera_main_button_color, null));
                jlpVarA.m(255);
                jlpVarA.n(jlq.c ? jlq.d : resources.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA.A(0);
                jlpVarA.z(resources.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA.u(0);
                jlpVarA.b(true);
                jlpVarA.r(61);
                jlpVarA.s(resources.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA.t(resources.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA.l(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA.d(R.drawable.ic_shutter_astro_dark);
                jlpVarA.i(resources.getDrawable(R.drawable.ic_shutter_astro_dark, null).getIntrinsicWidth() / 2);
                return jlpVarA;
            case 1:
                Resources resources2 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA2 = jlq.a();
                    jlpVarA2.o(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA2.m(0);
                    jlpVarA2.n(-1);
                    jlpVarA2.A(0);
                    jlpVarA2.z(resources2.getColor(R.color.video_mode_color, null));
                    jlpVarA2.u(0);
                    jlpVarA2.b(true);
                    jlpVarA2.r(255);
                    jlpVarA2.s(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA2.t(resources2.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA2.l(resources2.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA2;
                }
                jlp jlpVarA3 = jlq.a();
                jlpVarA3.o(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.j(resources2.getColor(R.color.camera_main_button_color, null));
                jlpVarA3.m(0);
                jlpVarA3.n(-1);
                jlpVarA3.A(0);
                jlpVarA3.z(0);
                jlpVarA3.u(0);
                jlpVarA3.b(true);
                jlpVarA3.r(255);
                jlpVarA3.s(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA3.p(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.q(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.t(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA3.l(resources2.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA3;
            case 2:
                Resources resources3 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA4 = jlq.a();
                    jlpVarA4.o(resources3.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA4.m(255);
                    jlpVarA4.n(resources3.getColor(R.color.camera_button_cancel_color, null));
                    jlpVarA4.z(resources3.getColor(R.color.video_mode_color, null));
                    jlpVarA4.A(0);
                    jlpVarA4.u(0);
                    jlpVarA4.d(R.drawable.ic_cancel);
                    jlpVarA4.i(resources3.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2);
                    jlpVarA4.s(resources3.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA4.t(resources3.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA4.l(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA4;
                }
                jlp jlpVarA5 = jlq.a();
                jlpVarA5.o(resources3.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA5.j(resources3.getColor(R.color.camera_main_button_color, null));
                jlpVarA5.m(0);
                jlpVarA5.n(0);
                jlpVarA5.z(resources3.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA5.A(0);
                jlpVarA5.u(0);
                jlpVarA5.d(R.drawable.ic_cancel);
                jlpVarA5.i(resources3.getDrawable(R.drawable.ic_cancel, null).getIntrinsicWidth() / 2);
                jlpVarA5.s(0);
                jlpVarA5.t(resources3.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA5.l(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA5;
            case 3:
                Resources resources4 = (Resources) obj;
                jlp jlpVarA6 = jlq.a();
                jlpVarA6.o(resources4.getDimensionPixelSize(R.dimen.photo_button_radius));
                jlpVarA6.j(resources4.getColor(R.color.camera_main_button_color, null));
                jlpVarA6.m(0);
                jlpVarA6.n(resources4.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA6.z(resources4.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA6.A(resources4.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA6.u(0);
                jlpVarA6.s(resources4.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                jlpVarA6.t(resources4.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA6.l(resources4.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA6.d(R.drawable.ic_center_pressed);
                jlpVarA6.i(resources4.getDrawable(R.drawable.ic_center_pressed, null).getIntrinsicWidth() / 2);
                return jlpVarA6;
            case 4:
                Resources resources5 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA7 = jlq.a();
                    jlpVarA7.o(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA7.m(0);
                    jlpVarA7.n(resources5.getColor(R.color.camera_mode_idle_color, null));
                    jlpVarA7.z(resources5.getColor(R.color.video_mode_color, null));
                    jlpVarA7.A(resources5.getDimensionPixelSize(R.dimen.video_button_inner_radius));
                    jlpVarA7.u(0);
                    jlpVarA7.s(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA7.t(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA7.l(resources5.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA7;
                }
                jlp jlpVarA8 = jlq.a();
                jlpVarA8.o(resources5.getDimensionPixelSize(R.dimen.P20_video_button_inner_radius));
                jlpVarA8.j(resources5.getColor(R.color.camera_main_button_color, null));
                jlpVarA8.m(255);
                jlpVarA8.n(resources5.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA8.z(resources5.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA8.A(0);
                jlpVarA8.u(0);
                jlpVarA8.s(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA8.p(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA8.q(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA8.t(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA8.l(resources5.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA8.d(R.drawable.ic_center);
                jlpVarA8.i(resources5.getDrawable(R.drawable.ic_center, null).getIntrinsicWidth() / 2);
                return jlpVarA8;
            case 5:
                Resources resources6 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA9 = jlq.a();
                    jlpVarA9.o(resources6.getDimensionPixelSize(R.dimen.portrait_button_inner_pressed_radius));
                    jlpVarA9.m(0);
                    jlpVarA9.n(-1);
                    jlpVarA9.A(0);
                    jlpVarA9.z(resources6.getColor(R.color.video_mode_color, null));
                    jlpVarA9.u(0);
                    jlpVarA9.b(true);
                    jlpVarA9.r(255);
                    jlpVarA9.s(resources6.getDimensionPixelSize(R.dimen.portrait_button_inner_pressed_radius));
                    jlpVarA9.p(resources6.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius) / 2);
                    jlpVarA9.q(resources6.getDimensionPixelSize(R.dimen.portrait_button_outer_ring_radius) / 2);
                    jlpVarA9.t(resources6.getDimensionPixelSize(R.dimen.portrait_button_outer_radius));
                    jlpVarA9.l(resources6.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA9;
                }
                jlp jlpVarA10 = jlq.a();
                jlpVarA10.o(resources6.getDimensionPixelSize(R.dimen.P20_portrait_button_inner_pressed_radius));
                jlpVarA10.j(resources6.getColor(R.color.camera_main_button_color, null));
                jlpVarA10.m(0);
                jlpVarA10.n(-1);
                jlpVarA10.A(0);
                jlpVarA10.z(resources6.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA10.u(0);
                jlpVarA10.b(true);
                jlpVarA10.r(255);
                jlpVarA10.s(resources6.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA10.p(resources6.getDimensionPixelSize(R.dimen.P20_portrait_button_inner_ring_radius) / 2);
                jlpVarA10.q(resources6.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius) / 2);
                jlpVarA10.t(resources6.getDimensionPixelSize(R.dimen.portrait_button_outer_radius));
                jlpVarA10.l(resources6.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA10;
            case 6:
                Resources resources7 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA11 = jlq.a();
                    jlpVarA11.o(resources7.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA11.m(255);
                    jlpVarA11.n(resources7.getColor(R.color.camera_mode_color, null));
                    jlpVarA11.z(resources7.getColor(R.color.camera_mode_color, null));
                    jlpVarA11.A(0);
                    jlpVarA11.u(0);
                    jlpVarA11.d(R.drawable.ic_check);
                    jlpVarA11.i(resources7.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2);
                    jlpVarA11.s(resources7.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA11.t(resources7.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA11.l(resources7.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA11;
                }
                jlp jlpVarA12 = jlq.a();
                jlpVarA12.o(resources7.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA12.j(resources7.getColor(R.color.camera_main_button_color, null));
                jlpVarA12.m(0);
                jlpVarA12.n(-1);
                jlpVarA12.A(0);
                jlpVarA12.z(resources7.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA12.u(resources7.getDimensionPixelSize(R.dimen.P20_video_button_stop_square_size) / 2);
                jlpVarA12.s(resources7.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA12.t(resources7.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA12.l(resources7.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA12.d(R.drawable.ic_center_rec);
                jlpVarA12.i(resources7.getDrawable(R.drawable.ic_center_rec, null).getIntrinsicWidth() / 2);
                return jlpVarA12;
            case 7:
                Resources resources8 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA13 = jlq.a();
                    jlpVarA13.o(resources8.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA13.m(255);
                    jlpVarA13.n(-1);
                    jlpVarA13.z(resources8.getColor(R.color.video_mode_color, null));
                    jlpVarA13.A(0);
                    jlpVarA13.u(0);
                    jlpVarA13.d(R.drawable.ic_autotimer_idle);
                    jlpVarA13.i(resources8.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2);
                    jlpVarA13.s(resources8.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA13.t(resources8.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA13.l(resources8.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA13;
                }
                jlp jlpVarA14 = jlq.a();
                jlpVarA14.o(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA14.m(255);
                jlpVarA14.n(-1);
                jlpVarA14.j(resources8.getColor(R.color.camera_main_button_color, null));
                jlpVarA14.z(resources8.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA14.A(0);
                jlpVarA14.u(0);
                jlpVarA14.d(R.drawable.ic_autotimer_idle);
                jlpVarA14.i(resources8.getDrawable(R.drawable.ic_autotimer_idle, null).getIntrinsicWidth() / 2);
                jlpVarA14.s(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA14.t(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA14.l(resources8.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA14;
            case 8:
                Resources resources9 = (Resources) obj;
                jlp jlpVarA15 = jlq.a();
                jlpVarA15.o(resources9.getDimensionPixelSize(R.dimen.photo_button_radius));
                jlpVarA15.j(resources9.getColor(R.color.camera_main_button_color, null));
                jlpVarA15.m(0);
                jlpVarA15.n(resources9.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA15.z(resources9.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA15.A(resources9.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA15.u(0);
                jlpVarA15.s(resources9.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                jlpVarA15.t(resources9.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA15.l(resources9.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA15.d(R.drawable.ic_center_pressed);
                jlpVarA15.i(resources9.getDrawable(R.drawable.ic_center_pressed, null).getIntrinsicWidth() / 2);
                return jlpVarA15;
            case 9:
                Resources resources10 = (Resources) obj;
                jlp jlpVarA16 = jlq.a();
                jlpVarA16.o(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA16.j(resources10.getColor(R.color.camera_main_button_color, null));
                jlpVarA16.m(255);
                jlpVarA16.n(jlq.c ? jlq.d : resources10.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA16.A(0);
                jlpVarA16.z(resources10.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA16.u(0);
                jlpVarA16.b(true);
                jlpVarA16.r(61);
                jlpVarA16.s(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA16.t(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA16.l(resources10.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA16.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA16.i(resources10.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA16;
            case 10:
                Resources resources11 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA17 = jlq.a();
                    jlpVarA17.o(resources11.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA17.m(255);
                    jlpVarA17.n(resources11.getColor(R.color.camera_mode_idle_color, null));
                    jlpVarA17.z(resources11.getColor(R.color.camera_mode_idle_color, null));
                    jlpVarA17.A(0);
                    jlpVarA17.u(0);
                    jlpVarA17.d(R.drawable.ic_check);
                    jlpVarA17.i((int) ((resources11.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() * 1.75f) / 2.0f));
                    jlpVarA17.s(resources11.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA17.t(resources11.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA17.l(resources11.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA17;
                }
                jlp jlpVarA18 = jlq.a();
                jlpVarA18.o(resources11.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA18.j(resources11.getColor(R.color.camera_main_button_color, null));
                jlpVarA18.m(255);
                jlpVarA18.n(resources11.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA18.z(resources11.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA18.A(0);
                jlpVarA18.u(0);
                jlpVarA18.d(R.drawable.quantum_gm_ic_done_white_24);
                jlpVarA18.i((int) ((resources11.getDrawable(R.drawable.quantum_gm_ic_done_white_24, null).getIntrinsicWidth() * 1.75f) / 2.0f));
                jlpVarA18.s(resources11.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA18.t(resources11.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA18.l(resources11.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA18;
            case 11:
                Resources resources12 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA19 = jlq.a();
                    jlpVarA19.o(resources12.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA19.m(255);
                    jlpVarA19.n(resources12.getColor(R.color.camera_mode_idle_color, null));
                    jlpVarA19.A(0);
                    jlpVarA19.z(resources12.getColor(R.color.video_mode_color, null));
                    jlpVarA19.u(0);
                    jlpVarA19.s(resources12.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA19.p(resources12.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA19.q(resources12.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA19.t(resources12.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA19.l(resources12.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA19;
                }
                jlp jlpVarA20 = jlq.a();
                jlpVarA20.o(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA20.m(255);
                jlpVarA20.j(resources12.getColor(R.color.camera_main_button_color, null));
                jlpVarA20.n(resources12.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA20.A(0);
                jlpVarA20.z(resources12.getColor(R.color.long_shot_transition_color, null));
                jlpVarA20.u(0);
                jlpVarA20.s(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA20.p(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA20.q(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA20.t(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA20.l(resources12.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA20;
            case 12:
                Resources resources13 = (Resources) obj;
                jlp jlpVarA21 = jlq.a();
                jlpVarA21.o(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA21.m(255);
                jlpVarA21.j(resources13.getColor(R.color.camera_main_button_color, null));
                jlpVarA21.n(resources13.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA21.A(0);
                jlpVarA21.z(0);
                jlpVarA21.u(0);
                jlpVarA21.r(255);
                jlpVarA21.s(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA21.p(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA21.q(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA21.e();
                jlpVarA21.f(-1);
                jlpVarA21.t(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA21.l(resources13.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA21.d(R.drawable.ic_filter_tilt_shift_24px);
                return jlpVarA21;
            case 13:
                return ((jws) obj).b();
            default:
                return ByteBuffer.wrap((byte[]) obj);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.p) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return Function.CC.$default$compose(this, function);
    }
}
