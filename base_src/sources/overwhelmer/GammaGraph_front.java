package overwhelmer;

import android.content.Context;
import android.util.AttributeSet;
import com.SDE.getGammaCurve;
import com.google.android.GoogleCameraEngR18F1.R;
import com.softmoore.android.graphlib.Graph;
import com.softmoore.android.graphlib.GraphView;
import com.softmoore.android.graphlib.Point;

/* JADX INFO: loaded from: classes2.dex */
public class GammaGraph_front extends GraphView {
    public static double[] _GammaGraph;
    public static GammaGraph_front sGammaGraph;

    public GammaGraph_front(Context context) {
        super(context);
        sGammaGraph = this;
        drawGamma();
    }

    public GammaGraph_front(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sGammaGraph = this;
        drawGamma();
    }

    public static void ArrayLogPointDouble(Point[] pointArr, String str) {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(getGammaCurve.gammaPresetName_front);
        sb.append("\n");
        sb.append("\n");
        if (str == null || (length = pointArr.length) == 0) {
            sb.append("Length 0");
            sb.append("\n");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(Double.toString(pointArr[i].getX()));
                sb.append("  -  ");
                sb.append(Double.toString(pointArr[i].getY()));
                sb.append("\n");
            }
        }
        sb.toString();
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [overwhelmer.GammaGraph, overwhelmer.GammaGraph_front] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    public static void drawGamma() {
        getGammaCurve.gammaPresetName_front = "Default";
        _GammaGraph = getGammaCurve.getGammaCurve(1);
        Point[] pointArr = new Point[33];
        double d = 0.0d;
        for (int i = 0; d <= 1.0d && i < 33; i++) {
            pointArr[i] = new Point(d, _GammaGraph[i + 0]);
            d += 0.03125d;
        }
        ((GraphView) sGammaGraph.findViewById(R.id.GRAPHbutton)).setGraph(new Graph.Builder().setWorldCoordinates(0.0d, 1.0d, 0.0d, 1.0d).addLineGraph(pointArr, -7829368).setAxesColor(-7829368).setBackgroundColor(0).build());
        ArrayLogPointDouble(pointArr, "addlogsdir/_GammaGraphPoint_front.log");
    }

    public static void refreshGraph() {
        drawGamma();
    }
}
