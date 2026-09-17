package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nhf implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean J;
    private boolean K;
    private boolean M;
    private boolean O;
    private boolean Q;
    private boolean S;
    private boolean U;
    private boolean W;
    private boolean Y;
    private boolean Z;
    public boolean o;
    public boolean v;
    private boolean x;
    private boolean y;
    private boolean z;
    public nhh a = null;
    public nhh b = null;
    public nhh c = null;
    public nhh d = null;
    public nhh e = null;
    public nhh f = null;
    public nhh g = null;
    public nhh h = null;
    public nhh i = null;
    public nhh j = null;
    private nhh I = null;
    public nhh k = null;
    private nhh L = null;
    private nhh N = null;
    private nhh P = null;
    private nhh R = null;
    public nhh l = null;
    private String T = "";
    public int m = 0;
    public String n = "";
    private String V = "";
    private String X = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public boolean s = false;
    public final List t = new ArrayList();
    public final List u = new ArrayList();
    private boolean aa = false;
    public String w = "";
    private boolean ab = false;
    private boolean ac = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            nhh nhhVar = new nhh();
            nhhVar.readExternal(objectInput);
            this.x = true;
            this.a = nhhVar;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar2 = new nhh();
            nhhVar2.readExternal(objectInput);
            this.y = true;
            this.b = nhhVar2;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar3 = new nhh();
            nhhVar3.readExternal(objectInput);
            this.z = true;
            this.c = nhhVar3;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar4 = new nhh();
            nhhVar4.readExternal(objectInput);
            this.A = true;
            this.d = nhhVar4;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar5 = new nhh();
            nhhVar5.readExternal(objectInput);
            this.B = true;
            this.e = nhhVar5;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar6 = new nhh();
            nhhVar6.readExternal(objectInput);
            this.C = true;
            this.f = nhhVar6;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar7 = new nhh();
            nhhVar7.readExternal(objectInput);
            this.D = true;
            this.g = nhhVar7;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar8 = new nhh();
            nhhVar8.readExternal(objectInput);
            this.E = true;
            this.h = nhhVar8;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar9 = new nhh();
            nhhVar9.readExternal(objectInput);
            this.F = true;
            this.i = nhhVar9;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar10 = new nhh();
            nhhVar10.readExternal(objectInput);
            this.G = true;
            this.j = nhhVar10;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar11 = new nhh();
            nhhVar11.readExternal(objectInput);
            this.H = true;
            this.I = nhhVar11;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar12 = new nhh();
            nhhVar12.readExternal(objectInput);
            this.J = true;
            this.k = nhhVar12;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar13 = new nhh();
            nhhVar13.readExternal(objectInput);
            this.K = true;
            this.L = nhhVar13;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar14 = new nhh();
            nhhVar14.readExternal(objectInput);
            this.M = true;
            this.N = nhhVar14;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar15 = new nhh();
            nhhVar15.readExternal(objectInput);
            this.O = true;
            this.P = nhhVar15;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar16 = new nhh();
            nhhVar16.readExternal(objectInput);
            this.Q = true;
            this.R = nhhVar16;
        }
        if (objectInput.readBoolean()) {
            nhh nhhVar17 = new nhh();
            nhhVar17.readExternal(objectInput);
            this.S = true;
            this.l = nhhVar17;
        }
        this.T = objectInput.readUTF();
        this.m = objectInput.readInt();
        this.n = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.U = true;
            this.V = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.W = true;
            this.X = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.o = true;
            this.p = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.Y = true;
            this.q = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.Z = true;
            this.r = utf5;
        }
        this.s = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            nhe nheVar = new nhe();
            nheVar.readExternal(objectInput);
            this.t.add(nheVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            nhe nheVar2 = new nhe();
            nheVar2.readExternal(objectInput);
            this.u.add(nheVar2);
        }
        this.aa = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.v = true;
            this.w = utf6;
        }
        this.ab = objectInput.readBoolean();
        this.ac = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F);
        if (this.F) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H);
        if (this.H) {
            this.I.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J);
        if (this.J) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.K);
        if (this.K) {
            this.L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.M);
        if (this.M) {
            this.N.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.O);
        if (this.O) {
            this.P.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Q);
        if (this.Q) {
            this.R.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.S);
        if (this.S) {
            this.l.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.T);
        objectOutput.writeInt(this.m);
        objectOutput.writeUTF(this.n);
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            objectOutput.writeUTF(this.V);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.X);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.r);
        }
        objectOutput.writeBoolean(this.s);
        int size = this.t.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((nhe) this.t.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.u.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((nhe) this.u.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.aa);
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            objectOutput.writeUTF(this.w);
        }
        objectOutput.writeBoolean(this.ab);
        objectOutput.writeBoolean(this.ac);
    }
}
