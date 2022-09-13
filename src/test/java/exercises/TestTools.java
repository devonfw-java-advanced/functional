package exercises;

import java.io.OutputStream;
import java.io.PrintStream;

public class TestTools {
    private static final String FAIL_SOLUTION = ": Your solution does not return the correct result.";

    public static String failMsg(String exNum) {
        return "Exercise " + exNum + FAIL_SOLUTION;
    }

    public static class PrintTestStreamer extends PrintStream {

        private int callCount;
        private String printedText;

        public PrintTestStreamer(OutputStream out) {
            super(out);
        }

        @Override
        public void println(String x) {
            callCount++;
            printedText = x;
            super.println(x);
        }

        public int getCallCount() {
            return callCount;
        }

        public String getPrintedText() {
            return printedText;
        }
    }

}
