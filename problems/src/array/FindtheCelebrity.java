package array;

public class FindtheCelebrity {

    public int findCelebrity(int n) {
        int res = -1;
        outter:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (knows(i, j)) {
                        continue outter;
                    }
                }
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    if (!knows(k, i)) {
                        continue outter;
                    }
                }
            }
            return i;
        }
        return res;
    }

    public int findCelebrity2(int n) {
        if (n < 2) return -1;
        int possible = 0;
        for (int i = 1; i < n; i++) {
            if (knows(possible, i)) {
                possible = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (possible != i && ((knows(possible, i) || !knows(i, possible)))) {
                return -1;
            }
        }
        return possible;
    }

    public boolean knows(int a, int b) {
        return true;
    }
}
