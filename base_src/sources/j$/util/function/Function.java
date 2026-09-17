package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface Function {

    /* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Function $default$andThen(final Function function, final Function function2) {
            function2.getClass();
            return new Function() { // from class: j$.util.function.Function$$ExternalSyntheticLambda0
                @Override // j$.util.function.Function
                public /* synthetic */ Function andThen(Function function3) {
                    return Function.CC.$default$andThen(this, function3);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    return function2.apply(function.apply(obj));
                }

                @Override // j$.util.function.Function
                public /* synthetic */ Function compose(Function function3) {
                    return Function.CC.$default$compose(this, function3);
                }
            };
        }

        public static Function $default$compose(final Function function, final Function function2) {
            function2.getClass();
            return new Function() { // from class: j$.util.function.Function$$ExternalSyntheticLambda1
                @Override // j$.util.function.Function
                public /* synthetic */ Function andThen(Function function3) {
                    return Function.CC.$default$andThen(this, function3);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    return function.apply(function2.apply(obj));
                }

                @Override // j$.util.function.Function
                public /* synthetic */ Function compose(Function function3) {
                    return Function.CC.$default$compose(this, function3);
                }
            };
        }
    }

    Function andThen(Function function);

    Object apply(Object obj);

    Function compose(Function function);
}
