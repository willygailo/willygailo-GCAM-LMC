package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class frv implements lie {
    public final mrd a;

    public frv(mpi mpiVar) {
        mqm mqmVar = new mqm(mpiVar);
        mqmVar.a(mwp.g(mrd.h(mpiVar, "#version 320 es\nin vec4 aPosition;\nin vec2 aTexCoord;\nuniform mat4 uTransform;\nout vec2 vTexCoord;\nvoid main() {\n  vTexCoord = aTexCoord;\n  gl_Position = uTransform * aPosition;\n}")));
        mqmVar.a(mwp.g(mrd.b(mpiVar, "#version 320 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp __samplerExternal2DY2YEXT uImgTex;\nin vec2 vTexCoord;\nout vec4 outColor;\nvoid main() {\n    outColor = vec4(yuv_2_rgb(texture(uImgTex, vTexCoord).rgb,\n                              itu_601_full_range), 1.0);\n}")));
        this.a = mqmVar.b();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
